package com.javaoctoberfest.task.oop_2;

public class Container {
    private int x1, y1, x2, y2;

    public Container(int x, int y, int width, int height) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = x + width;
        this.y2 = y - height;
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public int getWidth() {
        return x2 - x1;
    }

    public int getHeight() {
        return x2 - x1;
    }

    public boolean collides(Ball ball) {
        float ballX1 = ball.getX() + ball.getRadius();
        float ballY1 = ball.getY() + ball.getRadius();
        float ballX2 = ball.getX() - ball.getRadius();
        float ballY2 = ball.getY() - ball.getRadius();

        if (x1 < ballX2 && x2 > ballX1 && y1 > ballY1 && y2 < ballY2)
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "Container{" +
                "(" + x1 +
                ", " + y1 +
                "), (" + x2 +
                ", " + y2 +
                ")}";
    }
}
