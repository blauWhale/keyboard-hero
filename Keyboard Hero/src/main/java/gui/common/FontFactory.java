package gui.common;

import javafx.scene.text.Font;
import java.io.*;

public class FontFactory {

    private static final String FONT_FILE_PATH = "/fonts/Win95.ttf";

    public static Font initFont(int size) {
        Font font = null;
        InputStream is = FontFactory.class.getResourceAsStream(FONT_FILE_PATH);
        font = Font.loadFont(is, size);
        return font;
    }
}