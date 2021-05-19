package gui;

import game.Images;
import game.Songlist;
import game.Sound;
import gui.common.BaseScene;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.control.Button;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static game.Constant.SCREEN_WIDTH;

public class StartScene extends BaseScene {
    Set<Integer> finishedSongs = new HashSet<>();
    public StartScene(Navigator navigator) {
        super(navigator, Images.WELCOME);



    }

    @Override
    public void start() {
        Sound.play(Songlist.BACKGROUND);
        finishedSongs.add((Integer) navigator.getExchange("finishedSongNr"));
        generateView();
    }

    @Override
    public void stop() {

    }

    private void generateView() {
        Group root = (Group) getRoot();

        Button easyButton = new Button("Bl\u00f6 - Zweiunddreissigtausend");
        easyButton.setOnMouseClicked(event -> {
            //setSongNr(1);
            navigator.goTo(SceneType.GAME_SCREEN, "songNr", Integer.valueOf(1));
        });
        easyButton.setPadding(new Insets(10));
        easyButton.setPrefWidth(200);
        easyButton.setLayoutX(SCREEN_WIDTH/2 - easyButton.getPrefWidth()/2);
        easyButton.setLayoutY(350);

        Button normalButton = new Button("Kyrptogram - Sneak Away With Me");
        normalButton.setOnMouseClicked(event -> {
            navigator.goTo(SceneType.GAME_SCREEN, "songNr", Integer.valueOf(2));
        });
        normalButton.setPadding(new Insets(10));
        normalButton.setPrefWidth(220);
        normalButton.setLayoutX(SCREEN_WIDTH/2 - normalButton.getPrefWidth()/2);
        normalButton.setLayoutY(400);

        if (finishedSongs.contains(2)){
            Button hardButton = new Button("Bl\u00f6 - In OrBIT");
            hardButton.setOnMouseClicked(event -> {
                navigator.goTo(SceneType.GAME_SCREEN, "songNr", Integer.valueOf(3));
            });
            hardButton.setPadding(new Insets(10));
            hardButton.setPrefWidth(100);
            hardButton.setLayoutX(250);
            hardButton.setLayoutY(450);
            root.getChildren().add(hardButton);
        }






        root.getChildren().add(normalButton);
        root.getChildren().add(easyButton);

    }
    /*public static int getSongNr() {
        return SongNr;
    }

    public static void setSongNr(int songNr) {
        StartScene.SongNr = songNr;
    }*/


}
