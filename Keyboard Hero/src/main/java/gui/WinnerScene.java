package gui;

import game.Images;
import game.Songlist;
import game.Sound;
import gui.common.BaseScene;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import static game.Constant.SCREEN_HEIGHT;
import static game.Constant.SCREEN_WIDTH;

public class WinnerScene extends BaseScene {

    public WinnerScene(Navigator navigator) {
        super(navigator, Images.WINNER);

        setOnMouseClicked(e -> {
            navigator.goTo(SceneType.START_SCREEN);
        });

    }

    private Label finalscore = new Label("1000 "+"Points");

    @Override
    public void start() {
        Sound.play(Songlist.BACKGROUND);

        Group root = (Group) getRoot();
        root.getChildren().clear();
        super.prepare();
        finalscore.setLayoutX(SCREEN_WIDTH /2 - 50);
        finalscore.setLayoutY(SCREEN_HEIGHT - 250);
        finalscore.setTextFill(Color.BLACK);
        finalscore.setFont(Font.font("Arial bold",30));


        Button btntoMenu = new Button("Back to Menu");
        btntoMenu.setOnMouseClicked(event -> {
            navigator.goTo(SceneType.START_SCREEN);
        });
        btntoMenu.setPadding(new Insets(10));
        btntoMenu.setPrefWidth(150);
        btntoMenu.setLayoutX(SCREEN_WIDTH/2 - btntoMenu.getPrefWidth()/2);
        btntoMenu.setLayoutY(650);

        root.getChildren().add(finalscore);
        root.getChildren().add(btntoMenu);
    }

    @Override
    public void stop() {
    }

}
