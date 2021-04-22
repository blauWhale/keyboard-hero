package game;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class Sound {
    private static MediaPlayer musicPlayer;
    private final static Map<String, Media> cache = new HashMap<>();

    public static void play(Songlist music){
        play(music, () -> {});
    }
    public static void play(Songlist music, Runnable runOnReady) {
        if (musicPlayer != null) {
            musicPlayer.stop();
        }

        if(music == Songlist.STOP)
            return;

        musicPlayer = createMediaPlayer(getMusicFileName(music));

        musicPlayer.setOnReady(runOnReady);
        musicPlayer.setVolume(0.2);
        musicPlayer.play();

    }




    private static MediaPlayer createMediaPlayer(String filePath){
        filePath = "/music/" + filePath;

        if (!cache.containsKey(filePath)){
            URL url = Sound.class.getResource(filePath);
            if (url == null) {
                throw new RuntimeException("Could not load file: " + filePath);
            }

            cache.put(filePath, new Media(url.toString()));
        }

        return new MediaPlayer(cache.get(filePath));
    }


    private static String getMusicFileName(Songlist music) {
        switch (music) {
            case BACKGROUND:
                return "menuMusic.wav";
            case ZDTF1:
                return "zweiunddreissigtausendMASTER.wav";
            case ZDTF2:
                return "zweiunddreissigtausendMASTER.wav";
            case INORBIT:
                return "zweiunddreissigtausendMASTER.wav";
            case STOP:
                return "";
            default:
                throw new RuntimeException("No Soundfilename set for this enum value:" + music);
        }
    }

    public static Duration getSongTime(){
        return musicPlayer.getCurrentTime();
    }

    public static Duration getSongDuration(){
        return musicPlayer.getMedia().getDuration();
    }
}
