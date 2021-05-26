package gui;

import game.Images;
import game.Songlist;
import game.Sound;
import gui.common.BaseScene;
import gui.common.FontFactory;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.control.Button;

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
        finishedSongs.add(navigator.getExchange("finishedSongNr"));
        generateView();
    }

    @Override
    public void stop() {

    }

    private void generateView() {
        Group root = (Group) getRoot();

        Button easyButton = new Button("Bl\u00f6 - Zweiunddreissigtausend");
        easyButton.setOnMouseClicked(event -> {
            navigator.goTo(SceneType.GAME_SCREEN, "songNr", 1);
        });
        easyButton.setPadding(new Insets(10));
        easyButton.setPrefWidth(300);
        easyButton.setLayoutX(SCREEN_WIDTH/2 - easyButton.getPrefWidth()/2);
        easyButton.setLayoutY(350);
        easyButton.setFont(FontFactory.initFont(15));
        root.getChildren().add(easyButton);

        if (finishedSongs.contains(1)){
//        if (true){
            Button normalButton = new Button("Kyrptogram - Sneak Away With Me");
            normalButton.setOnMouseClicked(event -> {
                navigator.goTo(SceneType.GAME_SCREEN, "songNr", 2);
            });
            normalButton.setPadding(new Insets(10));
            normalButton.setPrefWidth(300);
            normalButton.setLayoutX(SCREEN_WIDTH/2 - normalButton.getPrefWidth()/2);
            normalButton.setLayoutY(400);
            normalButton.setFont(FontFactory.initFont(15));
            root.getChildren().add(normalButton);
        }



        if (finishedSongs.contains(2)){
//        if (true){
            Button hardButton = new Button("Gammer - Beam of Light");
            hardButton.setOnMouseClicked(event -> {
                navigator.goTo(SceneType.GAME_SCREEN, "songNr", 3);
            });
            hardButton.setPadding(new Insets(10));
            hardButton.setPrefWidth(300);
            hardButton.setLayoutX(SCREEN_WIDTH/2 - hardButton.getPrefWidth()/2);
            hardButton.setLayoutY(450);
            hardButton.setFont(FontFactory.initFont(15));
            root.getChildren().add(hardButton);
        }



    }

}
