package models.usuario;

import java.sql.*;

public class Conexao {
    
    // Atributos
    private String host;
    private String port;
    private String usuario;
    private String senha;
    private String db;
    
    Connection conexao;

    // Construtor para gerar conexao
    public Conexao() {
        // Preencher atributos
        this.host = "localhost";
        this.port = "3306";
        this.usuario = "root";
        this.senha = "";
        this.db = "";
    }

    public Conexao(String host, String port, String usuario, String senha, String db) {
        this.host = host;
        this.port = port;
        this.usuario = usuario;
        this.senha = senha;
        this.db = db;
    }
    
    
    // Métodos
    public Connection conectar(){
        
        // Tentar conectar
        try {
            // Registrar driver
            Class.forName("com.mysql.jdbc.Driver");
            
            //Abrindo a conexão
            conexao = DriverManager.getConnection("jdbc:mysql://" + host + "/" + db, usuario, senha);
 
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Erro ao tentar conectar ao banco de dados!");
        }
        
        return conexao;
    }
    
    public void desconectar(){
        try {
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("Conexão já encerrada!");
        }
    }
    

}
