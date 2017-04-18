package models;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import luteusdama.LuteusDamaController;

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
        setWidth(LuteusDamaController.TAMANHO_CASA);
        setHeight(LuteusDamaController.TAMANHO_CASA);

        relocate(x * LuteusDamaController.TAMANHO_CASA, y * LuteusDamaController.TAMANHO_CASA);

        setFill(clara ? Color.valueOf("#403bc7") : Color.valueOf("#373649"));
    }
}
