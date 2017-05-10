package luteusdama;

import view.TelaLogin;

/**
 * @author Luan M. Costa
 */
public class LuteusDamaController {
    
    // Configuração do Servidor
    static String host = "localhost";
    static String usuario = "root";
    static String porta = "3306";
    static String senha = "";
    static String db = "luteusdama";  

    public static void main(String[] args) {
        
        TelaLogin tl = new TelaLogin();
        tl.setTitle("Login - Luteus");
        tl.setVisible(true);
        
    }
    
}
