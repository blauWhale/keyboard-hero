package game;

import game.objects.Brick;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static game.Constant.BrickColors;
import static game.Constant.SCREEN_HEIGHT;

public class Songs {
    private static int speed = 100;

    public static ArrayList<Brick> getSong1(){
        ArrayList<Brick> bricks = new ArrayList<>();
        speed = 130;
        //Green Notes
        bricks.add(new Brick(105, calculateY(4.151),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(20.58),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(26.3),70,40,BrickColors[0],0, speed));

            //Buildup
        bricks.add(new Brick(105, calculateY(44.309),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(45.051),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(45.742),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(48.037),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(48.737),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(49.424),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(51.732),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(52.423),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(53.117),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(55.430),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(56.124),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(56.820),70,40,BrickColors[0],0, speed));


            //Chords

        bricks.add(new Brick(105, calculateY(59.350),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(63.043),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(66.733),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(70.426),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(74.000),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(74.344),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(77.694),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(78.035),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(81.381),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(81.726),70,40,BrickColors[0],0, speed));

            //Chords II
        bricks.add(new Brick(105, calculateY(103.539),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(103.880),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(107.234),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(110.921),70,40,BrickColors[0],0, speed));

            //Breakdown
        bricks.add(new Brick(105, calculateY(118.898),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(121.906),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(122.589),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(126.284),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(129.972),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(133.681),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(137.374),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(141.062),70,40,BrickColors[0],0, speed));

            //Outro
        bricks.add(new Brick(105, calculateY(162.462),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(168.039),70,40,BrickColors[0],0, speed));





        //Red Notes
            //Intro
        bricks.add(new Brick(185, calculateY(7.384),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(14.769),70,40,BrickColors[1],1, speed));
            //Kick Intro
        bricks.add(new Brick(185, calculateY(29.538),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(29.884),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(30.462),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(30.923),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(31.384),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(31.842),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(32.307),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(32.652),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(33.232),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(33.577),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(34.154),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(34.616),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(35.076),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(35.538),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(36.000),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(36.345),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(36.923),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(37.268),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(37.846),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(38.307),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(38.769),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(39.231),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(39.692),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(40.038),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(40.616),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(40.960),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(41.538),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(42.000),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(42.461),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(42.924),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(43.385),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(43.730),70,40,BrickColors[1],1, speed));

            //Buildup

        bricks.add(new Brick(185, calculateY(44.798),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(45.504),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(48.504),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(49.195),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(49.653),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(52.194),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(52.888),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(53.347),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(55.888),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(56.576),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(57.040),70,40,BrickColors[1],1, speed));

            //Chord
        bricks.add(new Brick(185, calculateY(59.926),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(60.270),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(63.613),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(63.964),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(67.304),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(67.657),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(71.000),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(71.347),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(74.574),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(75.037),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(78.268),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(78.724),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(81.959),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(82.418),70,40,BrickColors[1],1, speed));

            //Drum Sequence
        bricks.add(new Brick(185, calculateY(89.533),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(90.476),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(92.297),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(93.234),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(94.157),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(95.995),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(96.919),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(97.846),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(99.385),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(100.612),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(101.539),70,40,BrickColors[1],1, speed));

            //Chords II
        bricks.add(new Brick(185, calculateY(104.113),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(104.578),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(107.806),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(111.501),70,40,BrickColors[1],1, speed));

            //Breakdown
        bricks.add(new Brick(185, calculateY(118.652),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(123.040),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(126.725),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(130.433),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(134.130),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(137.821),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(141.510),70,40,BrickColors[1],1, speed));

            //Outro
        bricks.add(new Brick(185, calculateY(169.846),70,40,BrickColors[1],1, speed));





        //Yellow Notes
            //Intro
        bricks.add(new Brick(265, calculateY(9.457),70,40,BrickColors[2],2, speed));
            //Buildup
        bricks.add(new Brick(265, calculateY(46.191),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(49.882),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(53.580),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(57.279),70,40,BrickColors[2],2, speed));

            //Chords
        bricks.add(new Brick(265, calculateY(57.848),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(58.196),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(58.658),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(60.852),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(61.194),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(61.544),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(61.889),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(62.348),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(64.541),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(64.884),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(65.234),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(65.577),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(66.035),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(68.235),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(68.574),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(68.925),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(69.267),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(69.734),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(71.925),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(72.265),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(72.612),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(72.952),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(73.416),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(75.496),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(75.955),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(76.645),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(77.112),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(79.187),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(79.648),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(80.344),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(80.808),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(82.877),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(83.339),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(84.034),70,40,BrickColors[2],2, speed));

            //Drum Sequence
        bricks.add(new Brick(265, calculateY(89.071),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(90.000),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(90.925),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(92.768),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(93.693),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(94.608),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(96.460),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(97.384),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(98.300),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(100.152),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(101.073),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(101.991),70,40,BrickColors[2],2, speed));

            //Chords II
        bricks.add(new Brick(265, calculateY(105.036),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(105.500),70,40,BrickColors[2],2, speed));
        //bricks.add(new Brick(265, calculateY(106.421),70,40,BrickColors[2],2, speed));
        //bricks.add(new Brick(265, calculateY(106.887),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(108.733),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(112.420),70,40,BrickColors[2],2, speed));

            //Breakdown
        bricks.add(new Brick(265, calculateY(120.039),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(123.738),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(127.423),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(131.118),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(134.810),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(138.506),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(142.195),70,40,BrickColors[2],2, speed));



        //Blue Notes

            //Alarm Tone
        bricks.add(new Brick(345, calculateY(85.193),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(85.641),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(86.106),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(86.592),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(87.032),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(87.485),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(87.941),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(88.408),70,40,BrickColors[3],3, speed));

            //Drum Sequence
        bricks.add(new Brick(345, calculateY(91.260),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(91.610),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(94.956),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(95.303),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(98.649),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(98.994),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(102.347),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(102.687),70,40,BrickColors[3],3, speed));

            //Chords II
        bricks.add(new Brick(345, calculateY(105.731),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(106.190),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(106.656),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(109.424),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(109.880),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(110.349),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(113.115),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(113.573),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(114.036),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(114.734),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(115.192),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(115.656),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(116.113),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(116.581),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(117.040),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(117.487),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(117.962),70,40,BrickColors[3],3, speed));

            //Breakdown
        bricks.add(new Brick(345, calculateY(120.966),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(124.661),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(128.335),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(132.044),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(135.732),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(139.422),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(143.117),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(144.259),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(144.721),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(145.183),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(145.644),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(146.106),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(146.567),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(147.027),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(147.483),70,40,BrickColors[3],3, speed));




        //Purple Notes

            //Breakdown
        bricks.add(new Brick(425, calculateY(121.426),70,40,BrickColors[4],4, speed));
        bricks.add(new Brick(425, calculateY(125.115),70,40,BrickColors[4],4, speed));
        bricks.add(new Brick(425, calculateY(128.812),70,40,BrickColors[4],4, speed));
        bricks.add(new Brick(425, calculateY(132.499),70,40,BrickColors[4],4, speed));
        bricks.add(new Brick(425, calculateY(136.195),70,40,BrickColors[4],4, speed));
        bricks.add(new Brick(425, calculateY(139.885),70,40,BrickColors[4],4, speed));
        bricks.add(new Brick(425, calculateY(143.579),70,40,BrickColors[4],4, speed));




        return bricks;
    }

    private static int calculateY(double elementPostion){
        return (int) ((SCREEN_HEIGHT-50) - (speed * elementPostion));
    }
}
