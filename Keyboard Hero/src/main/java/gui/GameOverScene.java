package gui;

import game.Images;
import game.Songlist;
import game.Sound;;
import gui.common.BaseScene;


public class GameOverScene extends BaseScene {

    public GameOverScene(Navigator navigator) {
        super(navigator, Images.GAMEOVER);

        setOnMouseClicked(e -> navigator.goTo(SceneType.START_SCREEN));
    }

    @Override
    public void start() {
        Sound.play(Songlist.BACKGROUND);

    }

    @Override
    public void stop() {
    }

}
