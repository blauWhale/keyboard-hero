package game.objects;

import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

public class Brick extends Rectangle {

    private boolean isDead;

    public Brick(int x, int y, int height, int width, Image image) {
        super(x, y, width, height);
        ImagePattern pattern = new ImagePattern(image, x, y, width, height, false);
        this.setFill(pattern);
    }
}
