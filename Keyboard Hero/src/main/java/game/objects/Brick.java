package game.objects;

import javafx.scene.effect.BlendMode;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

public class Brick extends Rectangle {

    private boolean isDead;
    private double speedOfNote = 100;


    private int line;

    public Brick(int x, int y, int width, int height, Image image, int line) {
        super(x, y, width, height);
        ImagePattern pattern = new ImagePattern(image);
        this.setFill(pattern);
        this.line = line;
    }

    public void update(double deltaInSec){
        double distanceToMove = speedOfNote * deltaInSec;
        this.setY(getY()+ distanceToMove);
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

}
