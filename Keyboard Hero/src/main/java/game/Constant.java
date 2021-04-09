package game;


import javafx.scene.image.Image;
import javafx.scene.paint.Color;


import static game.Images.*;


public class Constant {

    //Frame
    public final static double SCREEN_WIDTH = 600;
    public final static double SCREEN_HEIGHT = 750;

    //Keyboard
    public final static String[] Keys = {"A", "S", "D", "F", "G"};


    //BrickColors
    public final static Image[] BrickColors = {GREEN_BRICK, RED_BRICK, YELLOW_BRICK, BLUE_BRICK, PURPLE_BRICK};
    /*
    Map<String, String> colors = new HashMap<>();
    colors.put("lightGreen", "#9DF583");
    colors.put("lightRed", "#F58383");
    colors.put("lightYellow", "#F1F583");
    colors.put("lightBlue", "#83DEF5");
    colors.put("lightPurple", "#A883F5");
    */

    //ColorsSimple
    public final static String[] Colors = {"#9DF583", "#F58383", "#F1F583", "#83DEF5", "#A883F5"};
}
