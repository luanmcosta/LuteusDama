package luteusdama;

import javax.swing.JOptionPane;
import models.usuario.*;
import luteusdama.LuteusDamaController;

public class UsuarioController {
    
    public static Usuario getUsuario(String email, String senha){
        // Iniciar conexão
        Conexao conexao = new Conexao(LuteusDamaController.host, LuteusDamaController.porta, LuteusDamaController.usuario, LuteusDamaController.senha, LuteusDamaController.db);

        // Iniciar DAO
        UsuarioDAO conUsuario = new UsuarioDAO(conexao);

        // Consultar dados do usuario
        Usuario usuario = conUsuario.consultar(email, senha);
        
        return usuario;
    }
    
    public static boolean autenticar(String email, String senha){
        Usuario usuario = getUsuario(email, senha);
        
        return usuario != null;
    }
    
    public static boolean cadastrar(String nome, String email, String senha){
        // Variavel auxiliar
        boolean inserido;
        
        // Instanciar novo usuario
        Usuario usuario = new Usuario(0, nome, email, senha, 0, 0);
            
         // Iniciar conexão
        Conexao conexao = new Conexao(LuteusDamaController.host, LuteusDamaController.porta, LuteusDamaController.usuario, LuteusDamaController.senha, LuteusDamaController.db);

        // Instanciar DAO
        UsuarioDAO conUsuario = new UsuarioDAO(conexao);
        
        // Tentar inserir usuario
        inserido = conUsuario.inserir(usuario);
        
        // Fechar conexao
        conexao.desconectar();
        
        // Retornar resultado
        return inserido;     
    }
            
            
}
