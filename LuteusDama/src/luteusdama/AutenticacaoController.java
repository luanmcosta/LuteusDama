package luteusdama;

import models.usuario.Conexao;
import models.usuario.Usuario;
import models.usuario.UsuarioDAO;

public class AutenticacaoController {
    
    public static void main(String[] args) {
        teste();
    }
    
    public static void teste(){
        
        Usuario usuario = new Usuario(0, "Luan", "luanwebdev@gmail.com", "123456", 0, 0);
        Conexao conexao = new Conexao("localhost", "3306", "root", "", "luteusdama");
        UsuarioDAO inserirUsuario = new UsuarioDAO(conexao);
        
        inserirUsuario.inserir(usuario);
    }
    
}
