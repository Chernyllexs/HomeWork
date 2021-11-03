package com.javaoctoberfest.task.oop_2.ball;

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

        return  (x1 < ballX2 && x2 > ballX1 && y1 > ballY1 && y2 < ballY2);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Container container = (Container) o;

        if (x1 != container.x1) return false;
        if (y1 != container.y1) return false;
        if (x2 != container.x2) return false;
        return y2 == container.y2;
    }

    @Override
    public int hashCode() {
        int result = x1;
        result = 31 * result + y1;
        result = 31 * result + x2;
        result = 31 * result + y2;
        return result;
    }
}
