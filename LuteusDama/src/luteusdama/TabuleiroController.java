package luteusdama;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.HeadlessException;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import models.tabuleiro.Casa;
import models.tabuleiro.Peca;
import models.tabuleiro.ResultadoMovimento;
import models.tabuleiro.TipoMovimento;
import models.tabuleiro.TipoPeca;
import models.usuario.Usuario;

public class TabuleiroController extends JApplet {
    
    // Referencias (Janelas anteriores e Jogadores)
    private Usuario jogadorUm;
    private Usuario JogadorDois;
    private LuteusDamaController refLoginController;
    
    // Configurações de Tamanho
    public static final int TAMANHO_CASA = 80;
    public static final int LARGURA = 8;
    public static final int ALTURA = 8;
    public boolean multijogador = false;
    
    // Grupos(Vetores) de Casas de Objetos
    private final Casa[][] tabuleiro = new Casa[LARGURA][ALTURA];
    private final Group grupoCasas = new Group();
    private final Group grupoPecas = new Group();
    public static JFXPanel fxContainer;
    
    // Variáveis de controle
    private int pecasBrancas;
    private int pecasVermelhas;
    
    // Construtores
    public TabuleiroController(){    
    }
    
    // Constutor para um jogador
    public TabuleiroController(Usuario jogador, LuteusDamaController refLoginController) throws HeadlessException {
        this.jogadorUm = jogador;
        this.refLoginController = refLoginController;
    }

    // Construtor para dois Jogadores
    public TabuleiroController(Usuario jogadorUm, Usuario JogadorDois, LuteusDamaController refLoginController) throws HeadlessException{
        this.jogadorUm = jogadorUm;
        this.JogadorDois = JogadorDois;
        this.refLoginController = refLoginController;
        this.multijogador = true;
    }
    
    
    // Método padrão de adaptação FX para Swing
    public void iniciarTabuleiro(){
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            }
            
            JFrame frame = new JFrame("Tabuleiro LuteusDama");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            JApplet applet = new TabuleiroController();
            applet.init();
            
            frame.setContentPane(applet.getContentPane());
            
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            
            applet.start();
        });
    }
    
    @Override
    public void init() {
        
        // Instanciar objeto JFXPanel e setar dimensões
        fxContainer = new JFXPanel();
        fxContainer.setPreferredSize(new Dimension(TAMANHO_CASA * LARGURA, TAMANHO_CASA * ALTURA));
        add(fxContainer, BorderLayout.CENTER);
        
        // Instanciar tabuleiro
        Platform.runLater(() -> {
            criarCena();
        });
    }
    
    private Parent criarComponentes() {
        Pane root = new Pane();
        root.setPrefSize(LARGURA * TAMANHO_CASA, ALTURA * TAMANHO_CASA);
        root.getChildren().addAll(grupoCasas, grupoPecas);

        for (int y = 0; y < ALTURA; y++) {
            for (int x = 0; x < LARGURA; x++) {
                Casa casa = new Casa((x + y) % 2 == 0, x, y);
                tabuleiro[x][y] = casa;

                grupoCasas.getChildren().add(casa);

                Peca peca = null;

                if (y <= 2 && (x + y) % 2 != 0) {
                    peca = criarPeca(TipoPeca.VERMELHA, x, y);
                }

                if (y >= 5 && (x + y) % 2 != 0) {
                    peca = criarPeca(TipoPeca.BRANCA, x, y);
                }

                if (peca != null) {
                    casa.setPeca(peca);
                    grupoPecas.getChildren().add(peca);
                }
            }
        }
        
        // Quantidade de pecas atualizadas
        pecasBrancas = 12;
        pecasVermelhas = 12;
        
        return root;
    }
    
    private int ajusteTabuleiro(double pixel) {
        return (int)(pixel + TAMANHO_CASA / 2) / TAMANHO_CASA;
    }
    
    private ResultadoMovimento tentarMover(Peca peca, int newX, int newY) {
        if (tabuleiro[newX][newY].hasPeca() || (newX + newY) % 2 == 0) {
            return new ResultadoMovimento(TipoMovimento.NENHUM);
        }

        int x0 = ajusteTabuleiro(peca.getOldX());
        int y0 = ajusteTabuleiro(peca.getOldY());

        if (Math.abs(newX - x0) == 1 && newY - y0 == peca.getTipo().direcaoMovimento) {
            return new ResultadoMovimento(TipoMovimento.NORMAL);
        } else if (Math.abs(newX - x0) == 2 && newY - y0 == peca.getTipo().direcaoMovimento * 2) {

            int x1 = x0 + (newX - x0) / 2;
            int y1 = y0 + (newY - y0) / 2;

            if (tabuleiro[x1][y1].hasPeca() && tabuleiro[x1][y1].getPeca().getTipo() != peca.getTipo()) {
                return new ResultadoMovimento(TipoMovimento.COMER, tabuleiro[x1][y1].getPeca());
            }
        }

        return new ResultadoMovimento(TipoMovimento.NENHUM);
}
    
    private Peca criarPeca(TipoPeca tipo, int x, int y) {
        Peca peca = new Peca(tipo, x, y);

        // Listener para verificar movimentação da peca
        peca.setOnMouseReleased(e -> {
            movimentoPeca(peca, x, y);
            System.out.println("Brancas: " + pecasBrancas + " - Vermelhas: " + pecasVermelhas);
            // Obter peças brancas restantes
            if(pecasBrancas <= 0)
                JOptionPane.showMessageDialog(this, "As pecas vermelhas venceram!");
            if(pecasVermelhas <= 0)
                JOptionPane.showMessageDialog(this, "As pecas brancas venceram!");

            if(pecasVermelhas <=0 || pecasBrancas <= 0)
                System.exit(0);
            
        });

        return peca;
}
    
    private void criarCena() {
        Pane root = (Pane) criarComponentes();
        fxContainer.setScene(new Scene(root));
    }
    
    private void movimentoPeca(Peca peca, int x, int y){
        // Obter coordenas gráficas(pixels) de onde a peca está
        int newX = ajusteTabuleiro(peca.getLayoutX());
        int newY = ajusteTabuleiro(peca.getLayoutY());

        ResultadoMovimento resultado;

        // Veificar se há movimento e se o movimento é válido
        if (newX < 0 || newY < 0 || newX >= ALTURA || newY >= LARGURA) {
            resultado = new ResultadoMovimento(TipoMovimento.NENHUM);
        } else {
            resultado = tentarMover(peca, newX, newY);
        }

        // Obter posição inicial da peca
        int x0 = ajusteTabuleiro(peca.getOldX());
        int y0 = ajusteTabuleiro(peca.getOldY());

        // Verificar o tipo de movimento gerado
        switch (resultado.getTipo()) {
            case NENHUM:
                peca.cancelarMovimento();
                break;
            case NORMAL:
                peca.mover(newX, newY);
                tabuleiro[x0][y0].setPeca(null);
                tabuleiro[newX][newY].setPeca(peca);
                break;
            case COMER:
                peca.mover(newX, newY);
                tabuleiro[x0][y0].setPeca(null);
                tabuleiro[newX][newY].setPeca(peca);
                
                Peca outraPeca = resultado.getPeca();
                
                // Contagem de peca
                if(outraPeca.getTipo() == TipoPeca.BRANCA)
                    pecasBrancas--;
                else
                    pecasVermelhas--;
              
                // Realizar remoção da peca (outraPeca)
                tabuleiro[ajusteTabuleiro(outraPeca.getOldX())][ajusteTabuleiro(outraPeca.getOldY())].setPeca(null);
                grupoPecas.getChildren().remove(outraPeca);
                break;
        }
    }
    
}
