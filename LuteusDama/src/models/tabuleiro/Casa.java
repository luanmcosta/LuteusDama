package models.tabuleiro;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import luteusdama.TabuleiroController;

public class Casa extends Rectangle {

    private Peca peca;

    public boolean hasPeca() {
        return peca != null;
    }

    public Peca getPeca() {
        return peca;
    }

    public void setPeca(Peca peca) {
        this.peca = peca;
    }

    public Casa(boolean clara, int x, int y) {
        setWidth(TabuleiroController.TAMANHO_CASA);
        setHeight(TabuleiroController.TAMANHO_CASA);

        relocate(x * TabuleiroController.TAMANHO_CASA, y * TabuleiroController.TAMANHO_CASA);

        setFill(clara ? Color.valueOf("#403bc7") : Color.valueOf("#373649"));
    }
}
