package game;

import game.objects.Brick;

import java.util.ArrayList;

import static game.Constant.BrickColors;
import static game.Constant.SCREEN_HEIGHT;

public class Songs {


    public static ArrayList<Brick> getSong1(){
            ArrayList<Brick> bricks = new ArrayList<>();
            //Green Notes
            bricks.add(new Brick(105, calculateY(4.151),70,40,BrickColors[0],0));
            bricks.add(new Brick(105, calculateY(20.58),70,40,BrickColors[0],0));

            //Red Notes
            bricks.add(new Brick(185, calculateY(7.384),70,40,BrickColors[1],1));
            bricks.add(new Brick(185, calculateY(14.769),70,40,BrickColors[1],1));
            bricks.add(new Brick(185, calculateY(29.538),70,40,BrickColors[1],1));
            bricks.add(new Brick(185, calculateY(29.884),70,40,BrickColors[1],1));
            bricks.add(new Brick(185, calculateY(30.462),70,40,BrickColors[1],1));
            bricks.add(new Brick(185, calculateY(30.923),70,40,BrickColors[1],1));
            bricks.add(new Brick(185, calculateY(31.384),70,40,BrickColors[1],1));

            //Yellow Notes
            bricks.add(new Brick(265, calculateY(9.457),70,40,BrickColors[2],2));
            //Blue Notes

            //Purple Notes



            return bricks;
        }

        private static int calculateY(double elementPostion1){
            return (int) ((SCREEN_HEIGHT-50) - (130*elementPostion1));
        }
}
