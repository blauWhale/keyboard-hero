package gui;

//import game.objects.*;
import game.Songlist;
import game.Songs;
import game.Sound;
import game.objects.Brick;
import gui.common.BaseScene;
import javafx.animation.Animation;
import javafx.animation.AnimationTimer;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.CacheHint;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.paint.*;
import javafx.util.Duration;

import java.io.File;
import java.util.ArrayList;

import static game.Constant.*;
import static game.Images.*;

public class GameScene extends BaseScene {

    //Animation
    private long lastTimeInMs;
    private int fps;
    private long nextSecond;

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



    public GameScene(Navigator navigator) {
        super(navigator, GAME_BACKGROUND);
        root = (Group) getRoot();
        prepare();
    }

    private void prepare() {

        root.setCacheHint(CacheHint.DEFAULT);

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


            }
        }




        root.getChildren().addAll(lines);
        root.getChildren().addAll(rectangles);
        root.getChildren().addAll(letters);
        root.getChildren().addAll(bricks);

        registerKeyHandlers();
    }

    @Override
    public void start() {

        lastTimeInMs = System.nanoTime();
        Timeline looper = new Timeline();
        fps = 0;
        nextSecond = 0;
        looper.getKeyFrames().add(new KeyFrame(Duration.millis(16), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                fps++;
                long currentTimeMs = System.nanoTime();
                long deltaInMs = System.nanoTime() - lastTimeInMs;
                double deltaInSec = deltaInMs / 1000000000d;
                lastTimeInMs = currentTimeMs;
                update(deltaInSec);

                if(currentTimeMs > nextSecond){
                    System.out.println(fps);
                    fps = 0;
                    nextSecond = currentTimeMs + 1000000000L;
                }
            }
        }));
        looper.setCycleCount(Animation.INDEFINITE);
        looper.play();
        Sound.play(Songlist.ZDTF1);



       /* lastTimeInMs = System.nanoTime();
        timer = new AnimationTimer() {
            @Override
            public void handle(long currentTimeInNanoSec) {
                long deltaInNanoSec = currentTimeInNanoSec - lastTimeInMs;
                double deltaInSec = deltaInNanoSec / 1000000000d;
                lastTimeInMs = currentTimeInNanoSec;
                update(deltaInSec);
            }
        };
        timer.start();*/


    }

    @Override
    public void stop() {
    }


    private void paint() {
        gc.drawImage(GAME_BACKGROUND, 0, 0);

    }

    private void update(double deltaInSec) {

        if(A_KeyPressed){
            checkBrick(0);
        }
        if(S_KeyPressed){
            checkBrick(1);
        }
        if(D_KeyPressed){
            checkBrick(2);
        }
        if(F_KeyPressed){
            checkBrick(3);
        }
        if(G_KeyPressed){
            checkBrick(4);
        }


        for (Brick brick : bricks) {
            brick.update(deltaInSec);
            //checkIfBrickDead(brick);
        }


        Duration time = Sound.getSongTime();
        clock.setText("Time: "+ time.toSeconds());

        if (time.toSeconds() > 55){
            navigator.goTo(SceneType.GAMEOVER_SCREEN);
        }


    }

    private void checkIfBrickDead(Brick brick) {
        ArrayList<Brick> deadBricks = new ArrayList<>();
            if (brick.getY()>SCREEN_HEIGHT){
                deadBricks.add(brick);
                currentScore-=10;
                score.setText("Score: "+ currentScore);
                System.out.println("Missed");
            }
        bricks.removeAll(deadBricks);
        root.getChildren().removeAll(deadBricks);
    }

    private void registerKeyHandlers() {
        this.setOnKeyPressed(event -> {
            switch (event.getCode()) {
                case A -> {
                    rectangles.get(0).setFill(Color.WHITESMOKE);
                    A_KeyPressed = true;
                }
                case S -> {
                    rectangles.get(1).setFill(Color.WHITESMOKE);
                    S_KeyPressed = true;
                }
                case D -> {
                    rectangles.get(2).setFill(Color.WHITESMOKE);
                    D_KeyPressed = true;
                }
                case F -> {
                    rectangles.get(3).setFill(Color.WHITESMOKE);
                    F_KeyPressed = true;

                }
                case G -> {
                    rectangles.get(4).setFill(Color.WHITESMOKE);
                    G_KeyPressed = true;
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
                boolean perfectHit = brick.getY() <= rectangles.get(line).getY() + 10 && brick.getY() >= rectangles.get(line).getY() - 10;
                //BrickY is between 690 and 710
                boolean littleTooLate = brick.getY() >= rectangles.get(line).getY() + 10 && brick.getY() <= rectangles.get(line).getY() + 50;
                //BrickY is between 710 and 750
                boolean littleTooEarly = brick.getY() >= rectangles.get(line).getY() - 50 && brick.getY() <= rectangles.get(line).getY()  - 10;
                //BrickY is between 690 and 650
                boolean missed = brick.getY() > SCREEN_HEIGHT;
                //BrickY is (under 650 and) over 750
                if(perfectHit){
                    deadBricks.add(brick);
                    currentScore+= 100;
                    score.setText("Score: "+ currentScore);
                    System.out.println("Perfect");
                    break;
                }
                if(littleTooLate){
                    deadBricks.add(brick);
                    currentScore+= 50;
                    score.setText("Score: "+ currentScore);
                    System.out.println("Late");
                    break;
                }
                if(littleTooEarly){
                    deadBricks.add(brick);
                    currentScore+= 50;
                    score.setText("Score: "+ currentScore);
                    System.out.println("Early");
                    break;
                }
                if(missed){
                    deadBricks.add(brick);
                    currentScore-= 10;
                    score.setText("Score: "+ currentScore);
                    System.out.println("Missed");
                    break;
                }


            }

        }
        bricks.removeAll(deadBricks);
        root.getChildren().removeAll(deadBricks);


    }
}

