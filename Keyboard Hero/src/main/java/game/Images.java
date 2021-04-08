package game;
import javafx.scene.image.Image;

public class Images {
    public final static Image GAME_BACKGROUND = getImage("background.png");

    private static Image getImage(String imagePath) {
        return new Image("/Images/" + imagePath);
    }
}