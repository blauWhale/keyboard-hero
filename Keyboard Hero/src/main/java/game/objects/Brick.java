package game.objects;

import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

import static game.Constant.SCREEN_HEIGHT;

public class Brick extends Rectangle {

    private int speedOfNote;

    private int line;

    public Brick(int x, int y, int width, int height, Image image, int line, int speed) {
        super(x, y, width, height);
        ImagePattern pattern = new ImagePattern(image);
        this.setFill(pattern);
        this.line = line;
        this.speedOfNote = speed;
    }

    public void update(double deltaInSec){
        double distanceToMove = speedOfNote * deltaInSec;
        this.setY(getY()+ distanceToMove);
    }

    public int getLine() {
        return line;
    }


}
