package gui;

import game.Images;
import game.Songlist;
import game.Sound;
import gui.common.BaseScene;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.control.Button;

import static game.Constant.SCREEN_WIDTH;


public class GameOverScene extends BaseScene {

    public GameOverScene(Navigator navigator) {
        super(navigator, Images.GAMEOVER);

        setOnMouseClicked(e -> navigator.goTo(SceneType.START_SCREEN));
    }

    @Override
    public void start() {
        Group root = (Group) getRoot();
        root.getChildren().clear();
        super.prepare();
        Sound.play(Songlist.BACKGROUND);

        Button btntoMenu = new Button("Back to Menu");
        btntoMenu.setOnMouseClicked(event -> {
            navigator.goTo(SceneType.START_SCREEN);
        });
        btntoMenu.setPadding(new Insets(10));
        btntoMenu.setPrefWidth(150);
        btntoMenu.setLayoutX(SCREEN_WIDTH/2 - btntoMenu.getPrefWidth()/2);
        btntoMenu.setLayoutY(650);


        root.getChildren().add(btntoMenu);
    }

    @Override
    public void stop() {
    }

}
