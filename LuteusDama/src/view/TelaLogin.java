/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import luteusdama.TabuleiroController;
import luteusdama.UsuarioController;
import models.usuario.Conexao;
import models.usuario.Usuario;
import models.usuario.UsuarioDAO;

/**
 *
 * @author Aluno
 */
public class TelaLogin extends javax.swing.JFrame {
    
    public TelaLogin() {
        initComponents();
        setLocationRelativeTo(null);
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelTudo = new javax.swing.JPanel();
        PainelTitulo = new javax.swing.JPanel();
        lblTituto = new javax.swing.JLabel();
        PainelConteudo = new javax.swing.JPanel();
        jtfEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblEsqueciMinhaSenha = new javax.swing.JLabel();
        btnLogar = new javax.swing.JButton();
        jtfSenha = new javax.swing.JPasswordField();
        lblCadastrese = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        PainelTitulo.setBackground(new java.awt.Color(0, 51, 153));

        lblTituto.setFont(new java.awt.Font("GENISO", 0, 36)); // NOI18N
        lblTituto.setForeground(new java.awt.Color(255, 255, 255));
        lblTituto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituto.setText("Projeto Dama");

        javax.swing.GroupLayout PainelTituloLayout = new javax.swing.GroupLayout(PainelTitulo);
        PainelTitulo.setLayout(PainelTituloLayout);
        PainelTituloLayout.setHorizontalGroup(
            PainelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTituto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PainelTituloLayout.setVerticalGroup(
            PainelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTituto, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jtfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEmailActionPerformed(evt);
            }
        });

        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmail.setText("E-mail");

        lblSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSenha.setText("Senha");

        lblEsqueciMinhaSenha.setForeground(new java.awt.Color(0, 51, 204));
        lblEsqueciMinhaSenha.setText("Esqueci minha senha");

        btnLogar.setText("Logar");
        btnLogar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnLogarMouseReleased(evt);
            }
        });
        btnLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogarActionPerformed(evt);
            }
        });

        lblCadastrese.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblCadastrese.setForeground(new java.awt.Color(0, 0, 102));
        lblCadastrese.setText("Cadastre-se");
        lblCadastrese.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblCadastreseMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout PainelConteudoLayout = new javax.swing.GroupLayout(PainelConteudo);
        PainelConteudo.setLayout(PainelConteudoLayout);
        PainelConteudoLayout.setHorizontalGroup(
            PainelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelConteudoLayout.createSequentialGroup()
                .addGroup(PainelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PainelConteudoLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(PainelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelConteudoLayout.createSequentialGroup()
                                .addGroup(PainelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(PainelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfEmail)
                                    .addComponent(jtfSenha)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelConteudoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblEsqueciMinhaSenha))))
                    .addGroup(PainelConteudoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCadastrese, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                        .addComponent(btnLogar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PainelConteudoLayout.setVerticalGroup(
            PainelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelConteudoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(PainelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(PainelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblEsqueciMinhaSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCadastrese, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout PainelTudoLayout = new javax.swing.GroupLayout(PainelTudo);
        PainelTudo.setLayout(PainelTudoLayout);
        PainelTudoLayout.setHorizontalGroup(
            PainelTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PainelConteudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        PainelTudoLayout.setVerticalGroup(
            PainelTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelTudoLayout.createSequentialGroup()
                .addComponent(PainelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelConteudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelTudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelTudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEmailActionPerformed

    private void lblCadastreseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCadastreseMouseReleased
        TelaCadastro tc = new TelaCadastro(this);
        tc.setTitle("Cadastro - Luteus");
        tc.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblCadastreseMouseReleased

    private void btnLogarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogarMouseReleased
        // Extrair campos
        String email = jtfEmail.getText();
        String senha = String.valueOf(jtfSenha.getPassword());
        
        // Verificar campos
        boolean emailOk = !email.trim().equals("");
        boolean senhaOk = !senha.trim().equals("");
        
        if(emailOk && senhaOk){
            // Tentar autenticar
            boolean autenticado = UsuarioController.autenticar(email, senha);
            
            if(!autenticado){
                JOptionPane.showMessageDialog(this, "Erro: Usuário ou senha estão incorretos.");
            }else{
                JOptionPane.showMessageDialog(this, "Usuario encontrado e autenticado!");
                
                // Iniciar tabuleiro e fechar tela de login
                Usuario user = UsuarioController.getUsuario(email, senha);
                
                // Instanciar tabuleiro
                TabuleiroController tc = new TabuleiroController(user);
                
                tc.setVisible(true);
                tc.iniciarTabuleiro();
                tc.iniciarMenu(user);
                
                dispose();
            }
       
        }else
            JOptionPane.showMessageDialog(this, "Erro: Usuario ou senha inválido!");
    }//GEN-LAST:event_btnLogarMouseReleased

    private void btnLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }
    
    private void setIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icone.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelConteudo;
    private javax.swing.JPanel PainelTitulo;
    private javax.swing.JPanel PainelTudo;
    private javax.swing.JButton btnLogar;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JPasswordField jtfSenha;
    private javax.swing.JLabel lblCadastrese;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEsqueciMinhaSenha;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTituto;
    // End of variables declaration//GEN-END:variables
}
