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
            bricks.add(new Brick(105, calculateY(26.3),70,40,BrickColors[0],0));

                //Buildup
            bricks.add(new Brick(105, calculateY(44.309),70,40,BrickColors[0],0));
            bricks.add(new Brick(105, calculateY(45.051),70,40,BrickColors[0],0));
            bricks.add(new Brick(105, calculateY(45.960),70,40,BrickColors[0],0));
            bricks.add(new Brick(105, calculateY(48.037),70,40,BrickColors[0],0));
            bricks.add(new Brick(105, calculateY(48.737),70,40,BrickColors[0],0));
            bricks.add(new Brick(105, calculateY(49.424),70,40,BrickColors[0],0));

            //Red Notes
                //Intro
            bricks.add(new Brick(185, calculateY(7.384),70,40,BrickColors[1],1));
            bricks.add(new Brick(185, calculateY(14.769),70,40,BrickColors[1],1));
                //Kick Intro
            bricks.add(new Brick(185, calculateY(29.538),70,40,BrickColors[1],1));
            bricks.add(new Brick(185, calculateY(29.884),70,40,BrickColors[1],1));
            bricks.add(new Brick(185, calculateY(30.462),70,40,BrickColors[1],1));
            bricks.add(new Brick(185, calculateY(30.923),70,40,BrickColors[1],1));
            bricks.add(new Brick(185, calculateY(31.384),70,40,BrickColors[1],1));
            bricks.add(new Brick(185, calculateY(31.842),70,40,BrickColors[1],1));
            bricks.add(new Brick(185, calculateY(32.307),70,40,BrickColors[1],1));
            bricks.add(new Brick(185, calculateY(32.652),70,40,BrickColors[1],1));
            bricks.add(new Brick(185, calculateY(33.232),70,40,BrickColors[1],1));
            bricks.add(new Brick(185, calculateY(33.577),70,40,BrickColors[1],1));
            bricks.add(new Brick(185, calculateY(34.154),70,40,BrickColors[1],1));
            bricks.add(new Brick(185, calculateY(34.616),70,40,BrickColors[1],1));
            bricks.add(new Brick(185, calculateY(35.076),70,40,BrickColors[1],1));
            bricks.add(new Brick(185, calculateY(35.538),70,40,BrickColors[1],1));
            bricks.add(new Brick(185, calculateY(36.000),70,40,BrickColors[1],1));
            bricks.add(new Brick(185, calculateY(36.345),70,40,BrickColors[1],1));
            bricks.add(new Brick(185, calculateY(36.923),70,40,BrickColors[1],1));
            bricks.add(new Brick(185, calculateY(37.268),70,40,BrickColors[1],1));
            bricks.add(new Brick(185, calculateY(37.846),70,40,BrickColors[1],1));
            bricks.add(new Brick(185, calculateY(38.307),70,40,BrickColors[1],1));
            bricks.add(new Brick(185, calculateY(38.769),70,40,BrickColors[1],1));
            bricks.add(new Brick(185, calculateY(39.231),70,40,BrickColors[1],1));
            bricks.add(new Brick(185, calculateY(39.692),70,40,BrickColors[1],1));
            bricks.add(new Brick(185, calculateY(40.038),70,40,BrickColors[1],1));
            bricks.add(new Brick(185, calculateY(40.616),70,40,BrickColors[1],1));
            bricks.add(new Brick(185, calculateY(40.960),70,40,BrickColors[1],1));
            bricks.add(new Brick(185, calculateY(41.538),70,40,BrickColors[1],1));
            bricks.add(new Brick(185, calculateY(42.000),70,40,BrickColors[1],1));
            bricks.add(new Brick(185, calculateY(42.461),70,40,BrickColors[1],1));
            bricks.add(new Brick(185, calculateY(42.924),70,40,BrickColors[1],1));
            bricks.add(new Brick(185, calculateY(43.385),70,40,BrickColors[1],1));
            bricks.add(new Brick(185, calculateY(43.730),70,40,BrickColors[1],1));

                //Buildup

            bricks.add(new Brick(185, calculateY(44.798),70,40,BrickColors[1],1));
            bricks.add(new Brick(185, calculateY(45.494),70,40,BrickColors[1],1));
            bricks.add(new Brick(185, calculateY(48.504),70,40,BrickColors[1],1));
            bricks.add(new Brick(185, calculateY(49.195),70,40,BrickColors[1],1));
            bricks.add(new Brick(185, calculateY(49.653),70,40,BrickColors[1],1));


            //Yellow Notes
                //Intro
            bricks.add(new Brick(265, calculateY(9.457),70,40,BrickColors[2],2));
                //Buildup
            bricks.add(new Brick(265, calculateY(46.191),70,40,BrickColors[2],2));
            bricks.add(new Brick(265, calculateY(49.882),70,40,BrickColors[2],2));

            //Blue Notes

            //Purple Notes



            return bricks;
        }

        private static int calculateY(double elementPostion){
            return (int) ((SCREEN_HEIGHT-50) - (130*elementPostion));
        }
}
