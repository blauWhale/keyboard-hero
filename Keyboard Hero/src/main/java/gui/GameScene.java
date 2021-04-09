package gui;

//import game.objects.*;
import game.objects.Brick;
import gui.common.BaseScene;
import javafx.animation.AnimationTimer;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.paint.*;

        import java.util.ArrayList;
import java.util.List;

import static game.Constant.*;
import static game.Images.*;

public class GameScene extends BaseScene {

    //Animation
    private long lastTimeInNanoSec;
    private AnimationTimer timer;

    //Text
    private Label score = new Label("Score: 0");
    private Label combo = new Label("Combo: 1x");
    private int currentScore = 0;

    //Letters
    private ArrayList<Label> letters = new ArrayList<>();

    //Shapes
    private ArrayList<Line> lines = new ArrayList<>();
    private ArrayList<Rectangle> rectangles = new ArrayList<>();

    //Music Notes
    private ArrayList<Brick> bricks = new ArrayList<>();




    public GameScene(Navigator navigator) {
        super(navigator, GAME_BACKGROUND);
        Group root = (Group) getRoot();
        prepare(root);
    }

    private void prepare(Group root) {

        //Score
        score.setLayoutX(SCREEN_WIDTH - 100);
        score.setLayoutY(SCREEN_HEIGHT - 100);
        score.setTextFill(Color.BLACK);
        score.setFont(Font.font("Arial bold",20));
        root.getChildren().add(score);

        //Combo
        combo.setLayoutX(SCREEN_WIDTH - 100);
        combo.setLayoutY(SCREEN_HEIGHT - 80);
        combo.setTextFill(Color.BLACK);
        combo.setFont(Font.font("Arial bold",20));
        root.getChildren().add(combo);

        //Letters & Lines
        int lineWidth = 80;
        int lineCount = 5;
        int startX = (int) (SCREEN_WIDTH - lineWidth * lineCount) / 2;
        for (int i = 0; i <= lineCount; i++) {
            int x = startX + i * lineWidth;
            lines.add(new Line(x, 0, x, SCREEN_HEIGHT));

            //Null Exception Handler
            if (i!=5){
                letters.add(new Label(Keys[i]));
                letters.get(i).setLayoutX(x+25);
                letters.get(i).setLayoutY(SCREEN_HEIGHT - 60);
                letters.get(i).setFont(Font.font("Arial Bold", 40));

                //Trigger Area
                rectangles.add(new Rectangle(lineWidth-10, 40, Color.valueOf(Colors[i])));
                rectangles.get(i).setX(x+5);
                rectangles.get(i).setY(SCREEN_HEIGHT-50);
                //Bricks
                bricks.add(new Brick(x+5, (int) (SCREEN_HEIGHT-500),lineWidth-10,40,BrickColors[i]));
            }
        }




        root.getChildren().addAll(lines);
        root.getChildren().addAll(rectangles);
        root.getChildren().addAll(letters);
        root.getChildren().addAll(bricks);
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

    }

    private void update(double deltaInSec) {


    }
}
