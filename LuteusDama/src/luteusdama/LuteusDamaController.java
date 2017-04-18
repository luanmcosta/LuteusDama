package luteusdama;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import models.Casa;
import models.Peca;
import models.ResultadoMovimento;
import models.TipoMovimento;
import models.TipoPeca;

public class LuteusDamaController extends JApplet {
    
    // Configurações de Tamanho
    public static final int TAMANHO_CASA = 80;
    public static final int LARGURA = 8;
    public static final int ALTURA = 8;
    
    // Grupos(Vetores) de Casas de Objetos
    private Casa[][] tabuleiro = new Casa[LARGURA][ALTURA];
    private Group grupoCasas = new Group();
    private Group grupoPecas = new Group();
    public static JFXPanel fxContainer;
    
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            } catch (Exception e) {
            }
            
            JFrame frame = new JFrame("Tabuleiro LuteusDama");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            JApplet applet = new LuteusDamaController();
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
        fxContainer = new JFXPanel();
        fxContainer.setPreferredSize(new Dimension(TAMANHO_CASA * LARGURA, TAMANHO_CASA * ALTURA));
        add(fxContainer, BorderLayout.CENTER);
        // Instanciar tabuleiro
        Platform.runLater(() -> {
            createScene();
        });
    }
    
    private Parent createContent() {
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

        peca.setOnMouseReleased(e -> {
            int newX = ajusteTabuleiro(peca.getLayoutX());
            int newY = ajusteTabuleiro(peca.getLayoutY());

            ResultadoMovimento resultado;

            if (newX < 0 || newY < 0 || newX >= ALTURA || newY >= LARGURA) {
                resultado = new ResultadoMovimento(TipoMovimento.NENHUM);
            } else {
                resultado = tentarMover(peca, newX, newY);
            }

            int x0 = ajusteTabuleiro(peca.getOldX());
            int y0 = ajusteTabuleiro(peca.getOldY());

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
                    tabuleiro[ajusteTabuleiro(outraPeca.getOldX())][ajusteTabuleiro(outraPeca.getOldY())].setPeca(null);
                    grupoPecas.getChildren().remove(outraPeca);
                    break;
            }
        });

        return peca;
}
    
    private void createScene() {
        Pane root = (Pane) createContent();
        fxContainer.setScene(new Scene(root));
    }
    
}
