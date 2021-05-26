package gui;

import game.Images;
import game.Songlist;
import game.Sound;
import gui.common.BaseScene;
import gui.common.FontFactory;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

import static game.Constant.SCREEN_HEIGHT;
import static game.Constant.SCREEN_WIDTH;

public class WinnerScene extends BaseScene {

    public WinnerScene(Navigator navigator) {
        super(navigator, Images.WINNER);

        setOnMouseClicked(e -> {
            navigator.goTo(SceneType.START_SCREEN);
        });

    }



    @Override
    public void start() {
        Sound.play(Songlist.BACKGROUND);
        Group root = (Group) getRoot();
        root.getChildren().clear();
        super.prepare();
        Label finalscore = new Label(navigator.getExchange("finalScore") +" Points");
        finalscore.setTextFill(Color.BLACK);
        finalscore.setFont(FontFactory.initFont(25));
        finalscore.setLayoutX(SCREEN_WIDTH /2 - 50);
        finalscore.setLayoutY(SCREEN_HEIGHT - 260);

        String winnertext = "Well done";
        switch(navigator.getExchange("songNr")) {
            case 1:
                winnertext = "\nYou unlocked a new Song:\nkryptogram - Sneak Away With Me";
                break;
            case 2:
                winnertext = "\nYou unlocked a new Song:\nGammer - Beam of Light";
                break;
            case 3:
                winnertext = "\nYou finished Keyboard Hero";
                break;
            default:
                break;
        }

        Text congrats = new Text ("Congratulations! " + winnertext);
        congrats.setLayoutX(SCREEN_WIDTH /2 - 150);
        congrats.setLayoutY(SCREEN_HEIGHT - 180);
        congrats.setFill(Color.BLACK);
        congrats.setFont(FontFactory.initFont(25));
        congrats.setTextAlignment(TextAlignment.CENTER);

        Button btntoMenu = new Button("Back to Menu");
        btntoMenu.setOnMouseClicked(event -> {
            navigator.goTo(SceneType.START_SCREEN, "finishedSongNr", navigator.getExchange("songNr"));
        });
        btntoMenu.setPadding(new Insets(10));
        btntoMenu.setPrefWidth(150);
        btntoMenu.setLayoutX(SCREEN_WIDTH/2 - btntoMenu.getPrefWidth()/2);
        btntoMenu.setLayoutY(650);

        root.getChildren().add(congrats);
        root.getChildren().add(finalscore);
        root.getChildren().add(btntoMenu);
    }

    @Override
    public void stop() {
    }

}
