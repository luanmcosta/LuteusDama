package luteusdama;

import view.TelaLogin;

/**
 * @author Luan M. Costa
 */
public class LuteusDama {

    public static void main(String[] args) {
        
        TelaLogin tl = new TelaLogin();
        tl.setTitle("Login - Luteus");
        tl.setVisible(true);
        
        TabuleiroController tabController = new TabuleiroController();
        tabController.iniciarTabuleiro();
    }
    
}
