package game;

import game.objects.Brick;

import java.util.ArrayList;

import static game.Constant.BrickColors;
import static game.Constant.SCREEN_HEIGHT;

public class Songs {
        public static ArrayList<Brick> getSong1(){
            ArrayList<Brick> bricks = new ArrayList<>();
            bricks.add(new Brick(105, 200,70,40,BrickColors[0],0));
            bricks.add(new Brick(185, 250,70,40,BrickColors[1],1));
            bricks.add(new Brick(265, 250,70,40,BrickColors[2],2));
            bricks.add(new Brick(345, 250,70,40,BrickColors[3],3));
            bricks.add(new Brick(425, 250,70,40,BrickColors[4],4));
            return bricks;
        }
}
