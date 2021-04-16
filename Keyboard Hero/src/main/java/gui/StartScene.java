package gui;

import game.Images;
import game.Songlist;
import game.Sound;
import gui.common.BaseScene;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.control.Button;

import static game.Constant.SCREEN_WIDTH;

public class StartScene extends BaseScene {
    private static int gameDifficulty = 0;
    public StartScene(Navigator navigator) {
        super(navigator, Images.WELCOME);


        Button easyButton = new Button("Bl\u00f6 - Zweiunddreissigtausend");
        easyButton.setOnMouseClicked(event -> {
            setGameDifficulty(1);
            navigator.goTo(SceneType.GAME_SCREEN);
        });
        easyButton.setPadding(new Insets(10));
        easyButton.setPrefWidth(200);
        easyButton.setLayoutX(SCREEN_WIDTH/2 - easyButton.getPrefWidth()/2);
        easyButton.setLayoutY(350);

        Button normalButton = new Button("Bl\u00f6 - Zweiunddreissigtausend(Remix)");
        normalButton.setOnMouseClicked(event -> {

        });
        normalButton.setPadding(new Insets(10));
        normalButton.setPrefWidth(220);
        normalButton.setLayoutX(SCREEN_WIDTH/2 - normalButton.getPrefWidth()/2);
        normalButton.setLayoutY(400);

        Button hardButton = new Button("Bl\u00f6 - In OrBIT");
        hardButton.setOnMouseClicked(event -> {

        });
        hardButton.setPadding(new Insets(10));
        hardButton.setPrefWidth(100);
        hardButton.setLayoutX(250);
        hardButton.setLayoutY(450);


        Group root = (Group) getRoot();
        root.getChildren().add(hardButton);
        root.getChildren().add(normalButton);
        root.getChildren().add(easyButton);


    }

    @Override
    public void start() {
        Sound.play(Songlist.BACKGROUND);
    }

    @Override
    public void stop() {

    }

    public static int getGameDifficulty() {
        return gameDifficulty;
    }

    public static void setGameDifficulty(int gameDifficulty) {
        StartScene.gameDifficulty = gameDifficulty;
    }
}
