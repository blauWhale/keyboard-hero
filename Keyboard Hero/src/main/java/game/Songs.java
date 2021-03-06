package game;

import game.objects.Brick;

import java.util.ArrayList;

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
    public static ArrayList<Brick> getSong2(){
        ArrayList<Brick> bricks = new ArrayList<>();
        speed = 180;
        //Green Notes
        bricks.add(new Brick(105, calculateY(3.165),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(4.793),70,40,BrickColors[0],0, speed));
            //Solo
        bricks.add(new Brick(105, calculateY(9.486),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(10.429),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(10.891),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(11.600),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(13.471),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(14.411),70,40,BrickColors[0],0, speed));
            //Solo II
        bricks.add(new Brick(105, calculateY(17.461),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(18.865),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(20.733),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(22.146),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(23.547),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(24.491),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(25.431),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(26.841),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(27.772),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(28.477),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(29.180),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(30.117),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(32.458),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(33.163),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(33.862),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(34.561),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(35.736),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(36.441),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(37.144),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(37.614),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(38.084),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(39.488),70,40,BrickColors[0],0, speed));


        //Red Notes
        bricks.add(new Brick(185, calculateY(3.166),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(4.794),70,40,BrickColors[1],1, speed));
            //Solo
        bricks.add(new Brick(185, calculateY(9.716),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(10.658),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(11.133),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(11.838),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(13.709),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(14.179),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(14.884),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(15.348),70,40,BrickColors[1],1, speed));
            //Solo II
        bricks.add(new Brick(185, calculateY(17.696),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(18.627),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(19.097),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(19.570),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(20.971),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(21.441),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(21.914),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(22.378),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(22.848),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(23.315),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(24.723),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(25.196),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(25.663),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(26.597),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(27.070),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(28.703),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(29.415),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(30.352),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(32.693),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(33.395),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(34.103),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(34.802),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(35.974),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(36.677),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(38.322),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(39.723),70,40,BrickColors[1],1, speed));

        //Yellow Notes
        bricks.add(new Brick(265, calculateY(6.912),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(7.377),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(8.081),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(8.549),70,40,BrickColors[2],2, speed));
            //Solo
        bricks.add(new Brick(265, calculateY(9.951),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(11.368),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(12.064),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(12.775),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(13.941),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(15.119),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(15.580),70,40,BrickColors[2],2, speed));
            //Solo II
        bricks.add(new Brick(265, calculateY(17.931),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(18.401),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(19.335),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(19.802),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(21.203),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(21.670),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(22.613),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(23.087),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(24.961),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(25.901),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(26.365),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(27.302),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(28.948),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(29.878),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(30.580),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(32.931),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(33.627),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(34.332),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(35.269),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(36.206),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(36.918),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(38.548),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(39.955),70,40,BrickColors[2],2, speed));

        //Blue Notes
            //solo
        bricks.add(new Brick(345, calculateY(10.184),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(12.302),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(16.047),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(18.160),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(20.269),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(26.130),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(30.819),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(31.054),70,40,BrickColors[3],3, speed));











        return bricks;
    }
    public static ArrayList<Brick> getSong3(){
        ArrayList<Brick> bricks = new ArrayList<>();
        speed = 225;
        //Green Notes
        bricks.add(new Brick(105, calculateY(0.924),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(2.334),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(2.875),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(6.575),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(8.506),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(12.218),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(13.633),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(17.860),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(18.578),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(19.281),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(20.750),70,40,BrickColors[0],0, speed));

        bricks.add(new Brick(105, calculateY(23.502),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(24.393),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(25.981),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(26.687),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(28.442),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(28.823),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(29.212),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(30.040),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(31.627),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(32.073),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(32.861),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(34.096),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(34.627),70,40,BrickColors[0],0, speed));

        bricks.add(new Brick(105, calculateY(23.502+11.3),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(24.393+11.3),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(25.981+11.3),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(26.687+11.3),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(28.442+11.3),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(28.823+11.3),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(29.212+11.3),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(30.040+11.3),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(42.568),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(42.924),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(43.276),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(43.628),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(43.978),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(44.334),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(44.688),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(45.038),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(45.394),70,40,BrickColors[0],0, speed));

        //Drop
        bricks.add(new Brick(105, calculateY(23.502+22.6),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(24.393+22.6),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(25.981+22.6),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(26.687+22.6),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(28.442+22.6),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(28.823+22.6),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(29.212+22.6),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(30.040+22.6),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(31.627+22.6),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(32.073+22.6),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(32.861+22.6),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(34.096+22.6),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(34.627+22.6),70,40,BrickColors[0],0, speed));

        bricks.add(new Brick(105, calculateY(23.502+33.9),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(24.393+33.9),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(25.981+33.9),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(26.687+33.9),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(28.442+33.9),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(28.823+33.9),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(29.212+33.9),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(30.040+33.9),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(31.627+33.9),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(32.073+33.9),70,40,BrickColors[0],0, speed));
        bricks.add(new Brick(105, calculateY(32.861+33.9),70,40,BrickColors[0],0, speed));

        //Red Notes
        bricks.add(new Brick(185, calculateY(0.925),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(1.663),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(2.335),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(2.876),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(6.576),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(7.265),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(7.944),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(8.507),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(12.219),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(12.929),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(13.634),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(14.161),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(17.861),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(18.579),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(19.812),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(21.393),70,40,BrickColors[1],1, speed));

        bricks.add(new Brick(185, calculateY(23.686),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(24.570),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(26.082),70,40,BrickColors[1],1, speed));

        bricks.add(new Brick(185, calculateY(27.041),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(27.394),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(28.097),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(28.644),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(29.336),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(30.214),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(31.721),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(32.303),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(33.097),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(33.567),70,40,BrickColors[1],1, speed));

        bricks.add(new Brick(185, calculateY(23.686+11.3),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(24.570+11.3),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(26.082+11.3),70,40,BrickColors[1],1, speed));

        bricks.add(new Brick(185, calculateY(27.041+11.3),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(27.394+11.3),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(28.097+11.3),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(28.644+11.3),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(29.336+11.3),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(30.214+11.3),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(45.608),70,40,BrickColors[1],1, speed));


        //Drop
        bricks.add(new Brick(185, calculateY(23.686+22.6),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(24.570+22.6),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(26.082+22.6),70,40,BrickColors[1],1, speed));

        bricks.add(new Brick(185, calculateY(27.041+22.6),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(27.394+22.6),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(28.097+22.6),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(28.644+22.6),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(29.336+22.6),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(30.214+22.6),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(31.721+22.6),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(32.303+22.6),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(33.097+22.6),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(33.567+22.6),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(34.282+22.6),70,40,BrickColors[1],1, speed));

        bricks.add(new Brick(185, calculateY(23.686+33.9),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(24.570+33.9),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(26.082+33.9),70,40,BrickColors[1],1, speed));

        bricks.add(new Brick(185, calculateY(27.041+33.9),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(27.394+33.9),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(28.097+33.9),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(28.644+33.9),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(29.336+33.9),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(30.214+33.9),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(31.721+33.9),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(32.303+33.9),70,40,BrickColors[1],1, speed));
        bricks.add(new Brick(185, calculateY(33.097+33.9),70,40,BrickColors[1],1, speed));


        //Yellow Notes
        bricks.add(new Brick(265, calculateY(1.664),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(2.877),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(7.266),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(7.945),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(12.930),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(14.162),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(17.862),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(21.931),70,40,BrickColors[2],2, speed));

        bricks.add(new Brick(265, calculateY(23.861),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(24.742),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(25.265),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(26.151),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(26.482),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(27.215),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(27.923),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(29.509),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(30.392),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(31.274),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(31.783),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(32.477),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(34.450),70,40,BrickColors[2],2, speed));

        bricks.add(new Brick(265, calculateY(23.861+11.3),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(24.742+11.3),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(25.265+11.3),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(26.151+11.3),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(26.482+11.3),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(27.215+11.3),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(27.923+11.3),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(29.509+11.3),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(30.392+11.3),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(45.776),70,40,BrickColors[2],2, speed));

        //Drop
        bricks.add(new Brick(265, calculateY(23.861+22.6),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(24.742+22.6),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(25.265+22.6),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(26.151+22.6),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(26.482+22.6),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(27.215+22.6),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(27.923+22.6),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(29.509+22.6),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(30.392+22.6),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(31.274+22.6),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(31.783+22.6),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(32.477+22.6),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(34.450+22.6),70,40,BrickColors[2],2, speed));

        bricks.add(new Brick(265, calculateY(23.861+33.9),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(24.742+33.9),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(25.265+33.9),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(26.151+33.9),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(26.482+33.9),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(27.215+33.9),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(27.923+33.9),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(29.509+33.9),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(30.392+33.9),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(31.274+33.9),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(31.783+33.9),70,40,BrickColors[2],2, speed));
        bricks.add(new Brick(265, calculateY(32.477+33.9),70,40,BrickColors[2],2, speed));



        //Blue Notes
        bricks.add(new Brick(345, calculateY(24.039),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(25.100),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(25.627),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(27.573),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(29.686),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(30.921),70,40,BrickColors[3],3, speed));


        bricks.add(new Brick(345, calculateY(24.039+11.3),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(25.100+11.3),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(25.627+11.3),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(27.573+11.3),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(29.686+11.3),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(30.921+11.3),70,40,BrickColors[3],3, speed));

        //Drop
        bricks.add(new Brick(345, calculateY(24.039+22.6),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(25.100+22.6),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(25.627+22.6),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(27.573+22.6),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(29.686+22.6),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(30.921+22.6),70,40,BrickColors[3],3, speed));

        bricks.add(new Brick(345, calculateY(24.039+33.9),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(25.100+33.9),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(25.627+33.9),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(27.573+33.9),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(29.686+33.9),70,40,BrickColors[3],3, speed));
        bricks.add(new Brick(345, calculateY(30.921+33.9),70,40,BrickColors[3],3, speed));
        //Purple Notes

        return bricks;
    }

    private static int calculateY(double elementPostion){
        return (int) ((SCREEN_HEIGHT-50) - (speed * elementPostion));
    }
}
