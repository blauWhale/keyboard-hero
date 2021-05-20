package gui;

//import game.objects.*;
import game.Songlist;
import game.Songs;
import game.Sound;
import game.objects.Brick;
import game.objects.SideText;
import gui.common.BaseScene;
import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Side;
import javafx.scene.CacheHint;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.paint.*;
import javafx.util.Duration;

import javax.swing.*;
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import static game.Constant.*;
import static game.Images.*;

public class GameScene extends BaseScene {

    private final Group root;

    //Animation
    private long lastTimeInMs;
    private int fps;
    private long nextSecond;
    private Timeline looper;

    //Text
    private Label score = new Label();
    private Label highScore = new Label();
    private Label streak = new Label();
    private Label clock = new Label("0:00");




    private int currentScore = 0;
    private static int finalScore = 0;
    private String highestScore = "default:0";
    private int currentStreak = 1;

    //Letters
    private ArrayList<Label> letters = new ArrayList<>();

    //Shapes
    private ArrayList<Line> lines = new ArrayList<>();
    private ArrayList<Rectangle> rectangles = new ArrayList<>();

    //Music Notes
    private LinkedList<Brick> bricks = new LinkedList<>();
    private ArrayList<Brick> deadBricks = new ArrayList<>();
    private int currentMissedNotes = 0;

    //Sidetexts
    private ArrayList<SideText> sidetexts = new ArrayList<>();

    //KeyHandler
    private boolean A_KeyPressed = false;
    private boolean S_KeyPressed = false;
    private boolean D_KeyPressed = false;
    private boolean F_KeyPressed = false;
    private boolean G_KeyPressed = false;






    public GameScene(Navigator navigator) {
        super(navigator, GAME_BACKGROUND);
        root = (Group) getRoot();
    }

    @Override
    protected void prepare() {
        super.prepare();

        letters.clear();
        lines.clear();
        rectangles.clear();
        bricks.clear();

        root.setCacheHint(CacheHint.DEFAULT);

        //Score
        currentScore = 0;
        currentMissedNotes = 0;
        score.setText("Score: "+ currentScore);
        score.setLayoutX(SCREEN_WIDTH - 100);
        score.setLayoutY(SCREEN_HEIGHT - 100);
        score.setTextFill(Color.BLACK);
        score.setFont(Font.font("Arial bold",15));
        root.getChildren().add(score);


        highestScore = this.getHighestScore();

        highScore.setText("Highscore: "+ highestScore);
        highScore.setFont(Font.font("Arial bold", 15));
        highScore.setLayoutX(SCREEN_WIDTH - 100);
        highScore.setLayoutY(SCREEN_HEIGHT - 120);
        highScore.setTextFill(Color.BLACK);
        root.getChildren().add(highScore);


        //Combo
        currentStreak = 0;
        streak.setText("Streak: "+ currentStreak +"x");
        streak.setLayoutX(SCREEN_WIDTH - 100);
        streak.setLayoutY(SCREEN_HEIGHT - 80);
        streak.setTextFill(Color.BLACK);
        streak.setFont(Font.font("Arial bold",15));
        root.getChildren().add(streak);


        //Clock
        clock.setLayoutX(SCREEN_WIDTH - 100);
        clock.setLayoutY(SCREEN_HEIGHT - 60);
        clock.setTextFill(Color.BLACK);
        clock.setFont(Font.font("Arial bold",15));
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




            }
        }

        //Bricks
        switch(navigator.getExchange("songNr")) {
            case 1:
                bricks.addAll(Songs.getSong1());
                break;
            case 2:
                bricks.addAll(Songs.getSong2());
                break;
            case 3:
                bricks.addAll(Songs.getSong3());
                break;
            default:
                break;
        }


        root.getChildren().addAll(lines);
        root.getChildren().addAll(rectangles);
        root.getChildren().addAll(letters);
        root.getChildren().addAll(bricks);

        registerKeyHandlers();
    }

    @Override
    public void start() {
        prepare();

        lastTimeInMs = System.nanoTime();
        looper = new Timeline();
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
                    fps = 0;
                    nextSecond = currentTimeMs + 1000000000L;
                }
            }
        }));
        looper.setCycleCount(Animation.INDEFINITE);
        switch(navigator.getExchange("songNr")) {
            case 1:
                Sound.play(Songlist.ZDTF1, new Runnable() {
                    @Override
                    public void run() {
                        looper.play();
                    }

                });
                break;
            case 2:
                Sound.play(Songlist.SAWM, new Runnable() {
                    @Override
                    public void run() {
                        looper.play();
                    }
                });
                break;
            case 3:
                Sound.play(Songlist.BOL, new Runnable() {
                    @Override
                    public void run() {
                        looper.play();
                    }
                });
            default:
                break;
        }


    }

    @Override
    public void stop() {
        looper.stop();
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
            if(brick.getY()>SCREEN_HEIGHT+20){
                deadBricks.add(brick);
                currentScore-= 10;
                currentStreak = 1;
                currentMissedNotes+=1;
                score.setText("Score: "+ currentScore);
                streak.setText("Streak: "+ currentStreak +"x");

                sidetexts.add(new SideText(0));

            }
        }

        for (Iterator<SideText> it = sidetexts.iterator(); it.hasNext(); ) {

            SideText sideText = it.next();
            sideText.update(deltaInSec);

            if(!root.getChildren().contains(sideText)){
                root.getChildren().add(sideText);
            }


            if(sideText.finished()){
                it.remove();
                root.getChildren().remove(sideText);
            }
        }









        Duration time = Sound.getSongTime();
        clock.setText(String.format("Time: %.2f", time.toSeconds()));

        if (currentMissedNotes >= 10){
            navigator.goTo(SceneType.GAMEOVER_SCREEN);
        }

        if (time.toSeconds() >= Sound.getSongDuration().toSeconds()){
            checkScore();
            navigator.goTo(SceneType.WINNER_SCREEN, "finalScore", currentScore);
        }

      /*if (time.toSeconds() >= 10){
            checkScore();
            navigator.goTo(SceneType.WINNER_SCREEN, "finalScore", currentScore);
        }*/



        bricks.removeAll(deadBricks);
        root.getChildren().removeAll(deadBricks);
        deadBricks.clear();
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

                case SPACE -> {
                    looper.pause();
                    Sound.pause();
                }
                case ENTER -> {
                    lastTimeInMs = System.nanoTime();
                    looper.play();
                    Sound.continuePlay();
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
        for (Brick brick : bricks) {
            if(brick.getLine() == line){
                boolean perfectHit = brick.getY() <= rectangles.get(line).getY() + 10 && brick.getY() >= rectangles.get(line).getY() - 20;
                //BrickY is between 680 and 710
                boolean littleTooLate = brick.getY() >= rectangles.get(line).getY() + 10 && brick.getY() <= SCREEN_HEIGHT;
                //BrickY is between 710 and 750
                boolean littleTooEarly = brick.getY() >= rectangles.get(line).getY() - 50 && brick.getY() <= rectangles.get(line).getY()  - 20;
                //BrickY is between 680 and 650
                boolean missed = !perfectHit && !littleTooLate && !littleTooEarly && brick.getY() > SCREEN_HEIGHT || brick.getY() < SCREEN_HEIGHT-100;
                //BrickY is (under 650 and) over 750
                if(perfectHit){
                    deadBricks.add(brick);
                    currentScore+= 100;
                    currentStreak += 1;
                    currentMissedNotes = 0;
                    score.setText("Score: "+ currentScore);
                    streak.setText("Combo: "+ currentStreak +"x");
                    System.out.println("Perfect");
                    sidetexts.add(new SideText(3));
                    break;

                }
                if(littleTooLate){
                    deadBricks.add(brick);
                    currentScore+= 50;
                    currentStreak += 1;
                    currentMissedNotes = 0;
                    score.setText("Score: "+ currentScore);
                    streak.setText("Streak: "+ currentStreak +"x");
                    System.out.println("Late");
                    sidetexts.add(new SideText(2));
                    break;
                }
                if(littleTooEarly){
                    deadBricks.add(brick);
                    currentScore+= 50;
                    currentStreak += 1;
                    currentMissedNotes = 0;
                    score.setText("Score: "+ currentScore);
                    streak.setText("Streak: "+ currentStreak +"x");
                    System.out.println("Early");
                    sidetexts.add(new SideText(1));
                    break;
                }
                if(missed){
                    currentScore-= 10;
                    currentStreak = 1;
                    score.setText("Score: "+ currentScore);
                    streak.setText("Streak: "+ currentStreak +"x");
                    sidetexts.add(new SideText(0));
                    break;
                }


            }

        }
        resetKeyes();
    }

    private void resetKeyes() {
        A_KeyPressed = false;
        S_KeyPressed = false;
        D_KeyPressed = false;
        F_KeyPressed = false;
        G_KeyPressed = false;
    }

    public static int getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(int finalScore) {
        this.finalScore = finalScore;
    }

    public String getHighestScore() {
        FileReader readFile;
        BufferedReader reader = null;
        // Read the first line of the File and then return it
        try {
            readFile = new FileReader( navigator.getExchange("songNr")+ "highscore.dat");
            reader = new BufferedReader(readFile);
            String s = reader.readLine();
            if (s == null){
                s = "default:0";
            }
            return s;
        }
        // If File not found or if an error occurs, set High-Score to 0
        catch (Exception e) {
            return "default:0";
        }
        // Close the Reader
        finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (Exception e) {
            }
        }
    }

    public void checkScore() {
        // Split the Highscore int into an array of 2 parts, one the name and the other with the number(Name /:/ 100) Samuel  ("100") -> int 100 -> 90 > 100 -> true/false

        String[] subStrings = highestScore.split(":");
        String currentHighScore = subStrings[1];
        int currentHighScoreInt = Integer.parseInt(currentHighScore);
        if (currentScore > currentHighScoreInt) { // Integer.parseInt(highestScore.split(":")[1])){
            // Creates a Textfield that asks for Players name if they set a new record
            String name = JOptionPane.showInputDialog("You set a new Highscore! Enter your name:");
            highestScore = name + ":" + currentScore;

            File scoreFile = new File(navigator.getExchange("songNr") + "highscore.dat");
            // Create a new File if doesn't exist
            if (!scoreFile.exists()) {
                try {
                    scoreFile.createNewFile();
                } catch (Exception e) {
                }
            }
            // Creates a FileWriter, that stores the File and creates a BufferedWriter, which allows us to write to the File
            FileWriter writeFile = null;
            BufferedWriter writer = null;
            try {
                writeFile = new FileWriter(scoreFile);
                writer = new BufferedWriter(writeFile);
                writer.write(this.highestScore);
            } catch (Exception e) {
            } finally {
                try {
                    if (writer != null) {
                        writer.close();
                    }
                } catch (Exception e) {
                }
            }
        }
    }


}

