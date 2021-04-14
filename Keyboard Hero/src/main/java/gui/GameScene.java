package gui;

//import game.objects.*;
import game.Songs;
import game.objects.Brick;
import gui.common.BaseScene;
import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.scene.CacheHint;
import javafx.scene.Group;
import javafx.scene.LightBase;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.paint.*;
import javafx.util.Duration;

import java.io.File;
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
    private Label clock = new Label("0:00");
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
    private final Group root;

    //Mediaplayer for Sound
    String musicFile = "src/main/resources/Music/zweiunddreissigtausendMASTER.wav";
    Media sound = new Media(new File(musicFile).toURI().toString());
    MediaPlayer mediaPlayer = new MediaPlayer(sound);


    public GameScene(Navigator navigator) {
        super(navigator, GAME_BACKGROUND);
        root = (Group) getRoot();
        prepare();
    }

    private void prepare() {

        root.setCacheHint(CacheHint.SPEED);

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

        //Clock
        clock.setLayoutX(SCREEN_WIDTH - 100);
        clock.setLayoutY(SCREEN_HEIGHT - 60);
        clock.setTextFill(Color.BLACK);
        clock.setFont(Font.font("Arial bold",20));
        root.getChildren().add(clock);

        //Letters & Lines
        int lineWidth = 80;
        int lineCount = 5;
        int startX = (int) (SCREEN_WIDTH - lineWidth * lineCount) / 2;
        for (int i = 0; i <= lineCount; i++) {
            int x = startX + i * lineWidth;
            lines.add(new Line(x, 0, x, SCREEN_HEIGHT));

            //Null Exception Handler
            if (i < lineCount){
                letters.add(new Label(Keys[i]));
                letters.get(i).setLayoutX(x+25);
                letters.get(i).setLayoutY(SCREEN_HEIGHT - 60);
                letters.get(i).setFont(Font.font("Arial Bold", 40));

                //Trigger Area
                rectangles.add(new Rectangle(lineWidth-10, 40, Color.valueOf(Colors[i])));
                rectangles.get(i).setX(x+5);
                rectangles.get(i).setY(SCREEN_HEIGHT-50);

                //Bricks
                bricks.addAll(Songs.getSong1());

                //Music
                mediaPlayer.setVolume(0.8);
                mediaPlayer.play();

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

        Duration time = mediaPlayer.getCurrentTime();

        clock.setText("Time: "+ time.toMinutes());



    }

    private void checkKeys() {
        this.setOnKeyPressed(event -> {
            switch (event.getCode()) {
                case A -> {
                    A_KeyPressed = true;
                    rectangles.get(0).setFill(Color.WHITESMOKE);
                    checkBrick(0);
                }
                case S -> {
                    S_KeyPressed = true;
                    rectangles.get(1).setFill(Color.WHITESMOKE);
                    checkBrick(1);
                }
                case D -> {
                    D_KeyPressed = true;
                    rectangles.get(2).setFill(Color.WHITESMOKE);
                    checkBrick(2);
                }
                case F -> {
                    F_KeyPressed = true;
                    rectangles.get(3).setFill(Color.WHITESMOKE);
                    checkBrick(3);

                }
                case G -> {
                    G_KeyPressed = true;
                    rectangles.get(4).setFill(Color.WHITESMOKE);
                    checkBrick(4);
                }
            }
        });


        this.setOnKeyReleased(event -> {
            switch (event.getCode()) {
                case A -> {
                    A_KeyPressed = false;
                    rectangles.get(0).setFill(Color.valueOf(Colors[0]));
                }
                case S -> {
                    S_KeyPressed = false;
                    rectangles.get(1).setFill(Color.valueOf(Colors[1]));
                }
                case D -> {
                    D_KeyPressed = false;
                    rectangles.get(2).setFill(Color.valueOf(Colors[2]));
                }
                case F -> {
                    F_KeyPressed = false;
                    rectangles.get(3).setFill(Color.valueOf(Colors[3]));
                }
                case G -> {
                    G_KeyPressed = false;
                    rectangles.get(4).setFill(Color.valueOf(Colors[4]));
                }
            }
        });


    }

    private void checkBrick(int line){
        ArrayList<Brick> deadBricks = new ArrayList<>();
        for (Brick brick : bricks) {
            if(brick.getLine() == line){
                if(brick.getY() + 30 >= rectangles.get(line).getY() && brick.getY() - 30 <= rectangles.get(line).getY() && !(brick.getY() > SCREEN_HEIGHT) ){
                    deadBricks.add(brick);
                    currentScore+= 1;
                    score.setText("Score: "+ currentScore);
                }
            }

        }
        bricks.removeAll(deadBricks);
        root.getChildren().removeAll(deadBricks);


    }
}

