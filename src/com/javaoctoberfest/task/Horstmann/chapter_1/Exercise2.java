package com.javaoctoberfest.task.Horstmann.chapter_1;

public class Exercise2 {
    public static void normaliseDegree(int angel) {
        if (angel < 0)
            System.out.println("%: " + (angel % 360 + 360));
        else
            System.out.println("%: " + (angel % 360));

        System.out.println("floorMod: " + Math.floorMod(angel, 360));
    }
}
