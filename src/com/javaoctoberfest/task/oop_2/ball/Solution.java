package com.javaoctoberfest.task.oop_2.ball;

import com.javaoctoberfest.task.oop_2.ball.Ball;
import com.javaoctoberfest.task.oop_2.ball.Container;

public class Solution {
    public static void main(String[] args) {

        Container container = new Container(0, 0, 15, 12);
        Ball ball = new Ball(2.5f, -2.5f, 2, 1, 45);
        System.out.println("Размеры контейнера" + container.toString());
        for (int i = 0; i < 50; i++) {
            System.out.println(ball.toString());
            ball.move();
            if (!container.collides(ball)) {
                System.out.println("Рикошет от границы");
                ball.reflectHorizontal();
                ball.reflectVertical();
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
