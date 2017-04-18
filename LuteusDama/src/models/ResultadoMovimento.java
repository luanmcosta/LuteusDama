package models;

public class ResultadoMovimento {
    private TipoMovimento tipo;
    private Peca peca;

    // Construtor(es)

    public ResultadoMovimento(TipoMovimento tipo, Peca peca) {
        this.tipo = tipo;
        this.peca = peca;
    }

    public ResultadoMovimento(TipoMovimento tipo) {
        this(tipo, null);
    }
    
    
    // Getters e Setters
    public TipoMovimento getTipo() {
        return tipo;
    }

    public void setTipo(TipoMovimento tipo) {
        this.tipo = tipo;
    }

    public Peca getPeca() {
        return peca;
    }

    public void setPeca(Peca peca) {
        this.peca = peca;
    }

}
