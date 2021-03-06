/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Toolkit;
import java.util.Arrays;
import javax.swing.JOptionPane;
import luteusdama.UsuarioController;

/**
 *
 * @author Aluno
 */
public class TelaCadastro extends javax.swing.JFrame {

    // Referencias
    private TelaLogin refTelaLogin;
    
    public TelaCadastro() {
        initComponents();
        setIcon();
        setLocationRelativeTo(null);
    }
    public TelaCadastro(TelaLogin refTelaLogin){
        this();
        this.refTelaLogin = refTelaLogin;
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
        jtfSenha = new javax.swing.JPasswordField();
        jtfNome = new javax.swing.JTextField();
        lblSenha1 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        PainelTudo.setFocusCycleRoot(true);

        PainelTitulo.setBackground(new java.awt.Color(0, 51, 153));

        lblTituto.setFont(new java.awt.Font("GENISO", 0, 36)); // NOI18N
        lblTituto.setForeground(new java.awt.Color(255, 255, 255));
        lblTituto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituto.setText("Projeto Dama");

        javax.swing.GroupLayout PainelTituloLayout = new javax.swing.GroupLayout(PainelTitulo);
        PainelTitulo.setLayout(PainelTituloLayout);
        PainelTituloLayout.setHorizontalGroup(
            PainelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTituto, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
        );
        PainelTituloLayout.setVerticalGroup(
            PainelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelTituloLayout.createSequentialGroup()
                .addComponent(lblTituto, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
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

        lblSenha1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSenha1.setText("Nome");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout PainelConteudoLayout = new javax.swing.GroupLayout(PainelConteudo);
        PainelConteudo.setLayout(PainelConteudoLayout);
        PainelConteudoLayout.setHorizontalGroup(
            PainelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelConteudoLayout.createSequentialGroup()
                .addGroup(PainelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PainelConteudoLayout.createSequentialGroup()
                        .addGroup(PainelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelConteudoLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(PainelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PainelConteudoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        PainelConteudoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblEmail, lblSenha, lblSenha1});

        PainelConteudoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jtfEmail, jtfNome, jtfSenha});

        PainelConteudoLayout.setVerticalGroup(
            PainelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelConteudoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmail)
                    .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(lblSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PainelConteudoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jtfEmail, jtfNome, jtfSenha});

        PainelConteudoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblEmail, lblSenha, lblSenha1});

        javax.swing.GroupLayout PainelTudoLayout = new javax.swing.GroupLayout(PainelTudo);
        PainelTudo.setLayout(PainelTudoLayout);
        PainelTudoLayout.setHorizontalGroup(
            PainelTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PainelTudoLayout.createSequentialGroup()
                .addComponent(PainelConteudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        PainelTudoLayout.setVerticalGroup(
            PainelTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelTudoLayout.createSequentialGroup()
                .addComponent(PainelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelConteudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnCadastrarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseReleased
        // Verificar se todos os campos estão preenchidos
        boolean nomeOk = !jtfNome.getText().trim().equals("");
        boolean emailOk = !jtfEmail.getText().trim().equals("");
        boolean senhaOk = !String.valueOf(jtfSenha.getPassword()).trim().equals("");
        
        if(nomeOk && emailOk && senhaOk){
            if(UsuarioController.cadastrar(jtfNome.getText(), jtfEmail.getText(), String.valueOf(jtfSenha.getPassword()))){
                JOptionPane.showMessageDialog(this, "Usuario cadastrado com sucesso!");
                refTelaLogin.setVisible(true);
                dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Erro: Erro ao tentar cadastrar usuario!");
            } 
        }else{
            JOptionPane.showMessageDialog(this, "Erro: Algum dos campos está inválido!");
        }

        
        
        
        
    }//GEN-LAST:event_btnCadastrarMouseReleased

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
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
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JPasswordField jtfSenha;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblSenha1;
    private javax.swing.JLabel lblTituto;
    // End of variables declaration//GEN-END:variables
}
