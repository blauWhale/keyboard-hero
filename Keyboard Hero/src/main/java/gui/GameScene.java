package gui;

//import game.objects.*;
import game.objects.Brick;
import gui.common.BaseScene;
import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
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

    //KeyHandler
    private boolean A_KeyPressed = false;
    private boolean S_KeyPressed = false;
    private boolean D_KeyPressed = false;
    private boolean F_KeyPressed = false;
    private boolean G_KeyPressed = false;


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
                bricks.add(new Brick(x+5, (int) (SCREEN_HEIGHT-500),lineWidth-10,40,BrickColors[i],i));
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
        for (Brick brick : bricks) {
            brick.update(deltaInSec);
        }
        checkKeys();




    }

    private void checkKeys() {
        this.setOnKeyPressed(event -> {
            switch (event.getCode()) {
                case A -> A_KeyPressed = true;
                case S -> S_KeyPressed = true;
                case D -> D_KeyPressed = true;
                case F -> F_KeyPressed = true;
                case G -> G_KeyPressed = true;
            }
        });

        this.setOnKeyReleased(event -> {
            switch (event.getCode()) {
                case A -> A_KeyPressed = false;
                case S -> S_KeyPressed = false;
                case D -> D_KeyPressed = false;
                case F -> F_KeyPressed = false;
                case G -> G_KeyPressed = false;
            }
        });

        if (A_KeyPressed){
            rectangles.get(0).setFill(Color.WHITESMOKE);
            ArrayList<Brick> deadBricks = new ArrayList<>();
            for (Brick brick : bricks) {
                    if(brick.getLine() == 0){
                        if(brick.getY() + 10 >= rectangles.get(0).getY() && brick.getY() - 10 >= rectangles.get(0).getY() && !(brick.getY() > SCREEN_HEIGHT) ){
                            deadBricks.add(brick);
                            currentScore+= 200;
                            score.setText("Score: "+ currentScore);
                        }
                    }

            }
            bricks.removeAll(deadBricks);
        }
        if (!A_KeyPressed){
            rectangles.get(0).setFill(Color.valueOf(Colors[0]));
        }

        if (S_KeyPressed){
            rectangles.get(1).setFill(Color.WHITESMOKE);
        }
        if (!S_KeyPressed){
            rectangles.get(1).setFill(Color.valueOf(Colors[1]));
        }

        if (D_KeyPressed){
            rectangles.get(2).setFill(Color.WHITESMOKE);
        }
        if (!D_KeyPressed){
            rectangles.get(2).setFill(Color.valueOf(Colors[2]));
        }

        if (F_KeyPressed){
            rectangles.get(3).setFill(Color.WHITESMOKE);
        }
        if (!F_KeyPressed){
            rectangles.get(3).setFill(Color.valueOf(Colors[3]));
        }

        if (G_KeyPressed){
            rectangles.get(4).setFill(Color.WHITESMOKE);
        }
        if (!G_KeyPressed){
            rectangles.get(4).setFill(Color.valueOf(Colors[4]));
        }

    }
}
