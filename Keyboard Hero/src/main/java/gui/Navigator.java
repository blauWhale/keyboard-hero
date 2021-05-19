package gui;

import gui.common.BaseScene;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;

public class Navigator {

    private final Stage stage;
    private final Map<SceneType, BaseScene> viewMap = new HashMap<>();
    private Map<String, Object> exchange = new HashMap<>();

    public Navigator(Stage stage) {
        this.stage = stage;
    }

    public void registerScene(SceneType enumScene, BaseScene scene) {
        viewMap.put(enumScene, scene);
    }

    public void goTo(SceneType scene) {

        BaseScene currentScene = (BaseScene) stage.getScene();
        if (currentScene != null){
            currentScene.stop();
        }

        BaseScene nextScene = viewMap.get(scene);
        nextScene.start();
        stage.setScene(nextScene);

    }

    public void goTo(SceneType sceneType, String key, Object value){
        exchange.put(key, value);
        this.goTo(sceneType);
    }

    public Object getExchange(String key){
        return exchange.get(key);
    }

}
