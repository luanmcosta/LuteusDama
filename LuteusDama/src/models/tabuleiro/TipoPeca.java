package models.tabuleiro;

public enum TipoPeca {
    VERMELHA(1), BRANCA(-1);

    final public int direcaoMovimento;

    TipoPeca(int direcaoMovimento) {
        this.direcaoMovimento = direcaoMovimento;
    }
}