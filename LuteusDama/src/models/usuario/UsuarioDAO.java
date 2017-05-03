package models.usuario;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsuarioDAO{

    // Atributos
    Statement declaracao;
    Connection conexao;
    String tabela = "usuarios_novo";
    
    // Construtor
    public UsuarioDAO(Conexao conexao){
        this.conexao = conexao.conectar();
        
        // Criar declaração       
        try {
            this.declaracao = this.conexao.createStatement();
        } catch (SQLException ex) {
            System.out.println("Erro ao tentar criar declação!");
        }
    }

    // Métodos
    public void inserir(Usuario usuario) {
        // Gerar query de inserção
        String query = "INSERT INTO " + tabela + " (nome, email, senha) VALUES ('"
                                                    + usuario.getNome() + "', '"
                                                    + usuario.getEmail() + "', '"
                                                    + usuario.getSenha() + "');";
                
        
        executarQuery(query);
        // Informar (log) da inserção
        System.out.println("Usuario inserido com sucesso!");
    }
    
    public void remover(Usuario usuario){
        // Gerar query de remoção
        String query = "DELETE FROM " + tabela + " WHERE id = '" + usuario.getId() + "';";
        
        executarQuery(query);
        // Informar (log) da inserção
        System.out.println("Usuario removido com sucesso!");
    }
    
    public void remover(int id){
        // Gerar query de remoção
        String query = "DELETE FROM usuarios WHERE id = '" + id + "';";
        
        executarQuery(query);
        // Informar (log) da inserção
        System.out.println("Usuario removido com sucesso!");
    }
    
    public Usuario consultar(String email, String senha){
        // Declarar novo usuário
        Usuario usuario;
        
        // declaracar query
        String query = "SELECT * FROM " + tabela + " WHERE email = '" + email + "' AND senha = '" + senha + "';";
        
        // Executar query e receber resultado
        ResultSet resultado = executarQuery(query);
        
        // Verificar dados retornados e atribuir ao novo objeto
        try {
            resultado.first();
            usuario = new Usuario();
            usuario.setId(resultado.getInt("id"));
            usuario.setNome(resultado.getString("nome"));
            usuario.setEmail(email);
            usuario.setSenha(senha);
            usuario.setVitorias(resultado.getInt("vitorias"));
            usuario.setDerrotas(resultado.getInt("derrotas"));

            return usuario;
        } catch (SQLException ex) {
            System.out.println("Usuário não localizado na base de dados!");
        }
  
        return null;
    }
    
    
    private ResultSet executarQuery(String query){  
        // Objeto de resultado da query
        ResultSet rs;
        
        // Tentar executar query no no banco
        System.out.println(query);
        try {
            rs = declaracao.executeQuery(query);
            return rs;
        } catch (SQLException ex) {
            System.out.println("Erro ao tentar inserir usuario!");
        }
        
        return null;
    }
    
}
