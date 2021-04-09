package game;
import javafx.scene.image.Image;

public class Images {
    public final static Image GAME_BACKGROUND = getImage("background.png");
    public final static Image GREEN_BRICK = getImage("green_brick.png");

    private static Image getImage(String imagePath) {
        return new Image("/Images/" + imagePath);
    }
}