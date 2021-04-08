package gui;

import game.*;
//import game.objects.*;
import gui.common.BaseScene;
import javafx.animation.AnimationTimer;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.text.Font;
import javafx.scene.paint.*;
import org.w3c.dom.css.Rect;

import java.util.ArrayList;

import static game.Constant.SCREEN_HEIGHT;
import static game.Constant.SCREEN_WIDTH;
import static game.Images.*;

public class GameScene extends BaseScene {

    //Animation
    private long lastTimeInNanoSec;
    private AnimationTimer timer;

    //Text
    private Label score = new Label("Score: 0");
    private int currentScore = 0;

    //Shapes
    private ArrayList<Shape> shapes = new ArrayList<>();


    public GameScene(Navigator navigator) {
        super(navigator, GAME_BACKGROUND);
        Group root = (Group) getRoot();

        score.setLayoutX(400);
        score.setLayoutY(750);
        score.setTextFill(Color.BLACK);
        score.setFont(Font.font("Perfect DOS VGA 437",30));
        root.getChildren().add(score);


        int bandWith = 50;
        int bandCount = 5;
        int startX = (int) (SCREEN_WIDTH - bandWith * bandCount) / 2;
        for (int i = 0; i <= bandCount; i++) {
            int x = startX + i * bandWith;
            shapes.add(new Line(x, 0, x, SCREEN_HEIGHT));
        }

        root.getChildren().addAll(shapes);
    }

    @Override
    public void start() {


        lastTimeInNanoSec = System.nanoTime();
        timer = new AnimationTimer() {
            @Override
            public void handle(long currentTimeInNanoSec) {
                long deltaInNanoSec = currentTimeInNanoSec - lastTimeInNanoSec;
                double deltaInSec = deltaInNanoSec / 1000000000d;
                lastTimeInNanoSec = currentTimeInNanoSec;
                update(deltaInSec);


            }
        };
        timer.start();


    }

    @Override
    public void stop() {
    }


    private void paint() {
        gc.drawImage(GAME_BACKGROUND, 0, 0);


        drawLines();
        drawGUI();

    }

    private void drawLines() {
        gc.setFill(Color.BLACK);

        int bandWith = 50;
        int bandCount = 5;
        int startX = (int) (SCREEN_WIDTH - bandWith * bandCount) / 2;
        for (int i = 0; i <= bandCount; i++) {
            int x = startX + i * bandWith;
            gc.strokeLine(x, 0, x, SCREEN_HEIGHT);
        }
    }

    private void drawGUI() {
        gc.setFill(Color.RED);
        gc.setFont(Font.font(30));
        gc.fillText("Score: " + currentScore, 50, 50);
    }

    private void update(double deltaInSec) {



    }
}
