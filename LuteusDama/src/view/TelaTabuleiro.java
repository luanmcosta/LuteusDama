package view;

import models.usuario.Usuario;

/**
 *
 * @author Nexus_Kayros
 */
public class TelaTabuleiro extends javax.swing.JFrame {

    // Referencia(s) do(s) Jogadore(s)
    Usuario usuarioUm;
    Usuario usuarioDois;
    int jogadores;
    int vezJogador;
    
    // Strings de auxilio
    String nomeJogadorUm;
    String nomeJogadorDois;
    

    public TelaTabuleiro() {
        initComponents();
    }

    // Construtor para um Jogador

    public TelaTabuleiro(Usuario usuarioUm) {
        this();
        this.usuarioUm = usuarioUm;
        this.usuarioDois = null;
        this.jogadores = 1;
        this.nomeJogadorUm = usuarioUm.getNome();
        this.nomeJogadorDois = "Computador";
        this.atualizarDados();
    }
    
    // Construtor para dois jogadores
    public TelaTabuleiro(Usuario usuarioUm, Usuario usuarioDois) {
        this();
        this.usuarioUm = usuarioUm;
        this.usuarioDois = usuarioDois;
        this.jogadores = 2;
        this.nomeJogadorUm = usuarioUm.getNome();
        this.nomeJogadorDois = usuarioDois.getNome();
        this.atualizarDados();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpUsuarios = new javax.swing.JPanel();
        btnDesistir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaMensagens = new javax.swing.JTextArea();
        jtfMensagem = new javax.swing.JTextField();
        lblVezDe = new javax.swing.JLabel();
        lblNomeJogadorAtual = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        jpUsuarios.setBackground(new java.awt.Color(0, 51, 153));

        btnDesistir.setText("Desistir");

        btnCancelar.setText("Cancelar");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jtaMensagens.setColumns(20);
        jtaMensagens.setRows(5);
        jScrollPane1.setViewportView(jtaMensagens);

        jtfMensagem.setText("Enviar mensagem");

        lblVezDe.setForeground(new java.awt.Color(204, 204, 204));
        lblVezDe.setText("Vez de:");

        lblNomeJogadorAtual.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeJogadorAtual.setText("Fulano de Tal");

        javax.swing.GroupLayout jpUsuariosLayout = new javax.swing.GroupLayout(jpUsuarios);
        jpUsuarios.setLayout(jpUsuariosLayout);
        jpUsuariosLayout.setHorizontalGroup(
            jpUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUsuariosLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jpUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDesistir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(jtfMensagem)
                    .addComponent(lblNomeJogadorAtual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblVezDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpUsuariosLayout.setVerticalGroup(
            jpUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblVezDe)
                .addGap(2, 2, 2)
                .addComponent(lblNomeJogadorAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnDesistir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTabuleiro().setVisible(true);
            }
        });
    }
    
    // Métodos adicionais
    
    public Usuario getUsuarioUm() {
        return usuarioUm;
    }

    public void setUsuarioUm(Usuario usuarioUm) {
        this.usuarioUm = usuarioUm;
    }

    public Usuario getUsuarioDois() {
        return usuarioDois;
    }

    public void setUsuarioDois(Usuario usuarioDois) {
        this.usuarioDois = usuarioDois;
    }

    public int getVezJogador() {
        return vezJogador;
    }

    public void setVezJogador(int vezJogador) {
        this.vezJogador = vezJogador;
    }
    
    public void atualizarDados(){
        if(this.vezJogador == 1)
            this.lblNomeJogadorAtual.setText(nomeJogadorUm);
        if(this.vezJogador == 2)
            this.lblNomeJogadorAtual.setText(nomeJogadorDois); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDesistir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpUsuarios;
    private javax.swing.JTextArea jtaMensagens;
    private javax.swing.JTextField jtfMensagem;
    private javax.swing.JLabel lblNomeJogadorAtual;
    private javax.swing.JLabel lblVezDe;
    // End of variables declaration//GEN-END:variables
}
