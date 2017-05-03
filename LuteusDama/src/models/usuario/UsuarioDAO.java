package models.usuario;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UsuarioDAO{

    // Atributos
    Statement declaracao;
    Connection conexao;
    
    // Construtor
    public UsuarioDAO(Conexao conexao){
        this.conexao = conexao.conectar();
        
        // criar declaração       
        try {
            this.declaracao = this.conexao.createStatement();
        } catch (SQLException ex) {
            System.out.println("Erro ao tentar criar declação!");
        }
    }

    // Métodos
    public void inserir(Usuario usuario) {
        // Gerar query de inserção
        String query = "INSERT INTO usuarios (nome, email, senha) VALUES ('"
                                                    + usuario.getNome() + "', '"
                                                    + usuario.getEmail() + "', '"
                                                    + usuario.getSenha() + "');";
        // Tentar inserir no banco
        System.out.println(query);
        try {
            declaracao.execute(query);
        } catch (SQLException ex) {
            System.out.println("Erro ao tentar inserir usuario!");
        }
        
        // Informar (log) da inserção
        System.out.println("Usuario inserido com sucesso!");
    }
    
}
