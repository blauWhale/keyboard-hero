package game.objects;

import javafx.animation.FadeTransition;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.util.Duration;

import static game.Constant.SCREEN_HEIGHT;
import static game.Constant.SCREEN_WIDTH;

public class SideText extends Label{

    private FadeTransition fadeIn = new FadeTransition(Duration.millis(3000));

    private boolean finished = false;
    private int kind;
    private double x = SCREEN_WIDTH - 100 ;
    private double y = SCREEN_HEIGHT - 120;
    private String text = "";
    private Color color;

    private double speedOfText = -100;

    public SideText(int kind) {
        super();
        this.kind = kind;
        switch (kind) {
            case 0 -> {
                text = "Missed -10";
                color = Color.RED;
            }
            case 1 -> {
                text = "Too Early +50";
                color = Color.YELLOW;
            }
            case 2 -> {
                text = "Too Late +50";
                color = Color.YELLOW;
            }
            case 3 -> {
                text = "PERFECT +100";
                color = Color.GREEN;
            }
        }

        setText(text);
        setLayoutX(x);
        setLayoutY(y);
        setTextFill(color);
        setFont(Font.font("Arial bold",15));

        fadeIn.setNode(this);

        fadeIn.setFromValue(1.0);
        fadeIn.setToValue(0.0);
        fadeIn.setCycleCount(1);
        fadeIn.setAutoReverse(false);
        fadeIn.playFromStart();
        fadeIn.setOnFinished(event -> finished = true);

    }

    public void update(double deltaInSec){
        double distanceToMove = speedOfText * deltaInSec;
        setTranslateY( getTranslateY() + distanceToMove);
    }

    public boolean finished() {
        return this.finished;
    }
}
