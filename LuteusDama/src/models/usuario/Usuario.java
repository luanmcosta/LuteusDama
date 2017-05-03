package models.usuario;

public class Usuario {
    
    // Atributos
    private int id;
    private String nome;
    private String email;
    private String senha;
    private int vitorias;
    private int derrotas;
    
    // Construtor(es)
    public Usuario() {
    }
    
    public Usuario(int id, String nome, String email, String senha, int vitorias, int derrotas) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
    }
    
    // Métodos 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    } 
    
    
}
