package game.objects;

import javafx.scene.Node;

import java.awt.*;

public class Brick {

    public boolean isDead;
    private int x;
    private int y = -100;
    private int width = 60;
    private int height = 30;
    public Rectangle bounds;

    public Brick() {
        bounds = new Rectangle(x, y, width, height);

    }
}
