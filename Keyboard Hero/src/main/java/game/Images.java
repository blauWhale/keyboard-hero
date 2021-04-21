package game;
import javafx.scene.image.Image;

public class Images {
    public final static Image GAME_BACKGROUND = getImage("background.png");
    public final static Image WELCOME = getImage("menu_background.png");
    public final static Image GAMEOVER = getImage("gameover_background.png");
    public final static Image WINNER = getImage("winner_background.png");
    public final static Image GREEN_BRICK = getImage("green_brick.png");
    public final static Image RED_BRICK = getImage("red_brick.png");
    public final static Image YELLOW_BRICK = getImage("yellow_brick.png");
    public final static Image BLUE_BRICK = getImage("blue_brick.png");
    public final static Image PURPLE_BRICK = getImage("purple_brick.png");

    private static Image getImage(String imagePath) {
        return new Image("/Images/" + imagePath);
    }
}