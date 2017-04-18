package models;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import static luteusdama.LuteusDamaController.TAMANHO_CASA;


public class Peca extends StackPane {

    private TipoPeca tipo;

    private double mouseX, mouseY;
    private double oldX, oldY;

    public TipoPeca getTipo() {
        return tipo;
    }

    public double getOldX() {
        return oldX;
    }

    public double getOldY() {
        return oldY;
    }

    public Peca(TipoPeca tipo, int x, int y) {
        this.tipo = tipo;
        mover(x, y);

        Ellipse pecaVisual = new Ellipse(TAMANHO_CASA * 0.3, TAMANHO_CASA * 0.3);
        pecaVisual.setFill(tipo == TipoPeca.VERMELHA ? Color.valueOf("#e53522") : Color.valueOf("#dbdbdb"));
        pecaVisual.setStroke(Color.BLACK);
        pecaVisual.setStrokeWidth(TAMANHO_CASA * 0.03);
        pecaVisual.setTranslateX((TAMANHO_CASA - TAMANHO_CASA * 0.3 * 2) / 2);
        pecaVisual.setTranslateY((TAMANHO_CASA - TAMANHO_CASA * 0.3 * 2) / 2);

        getChildren().addAll(pecaVisual);

        setOnMousePressed(e -> {
            mouseX = e.getSceneX();
            mouseY = e.getSceneY();
        });

        setOnMouseDragged(e -> {
            relocate(e.getSceneX() - mouseX + oldX, e.getSceneY() - mouseY + oldY);
        });
    }

    public void mover(int x, int y) {
        oldX = x * TAMANHO_CASA;
        oldY = y * TAMANHO_CASA;
        relocate(oldX, oldY);
    }

    public void cancelarMovimento() {
        relocate(oldX, oldY);
    }
}
