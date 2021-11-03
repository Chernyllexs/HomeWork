package com.javaoctoberfest.task.oop_2.ball;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        if (-180 <= direction && direction <= 180) {
            this.xDelta = (float) (speed * Math.cos(direction));
            this.yDelta = (float) (-speed * Math.sin(direction));
        }
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move() {
        this.x += xDelta;
        this.y += yDelta;
    }

    public void reflectHorizontal() {
        xDelta = -xDelta;
    }

    public void reflectVertical() {
        yDelta = -yDelta;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ball ball = (Ball) o;

        if (Float.compare(ball.getX(), getX()) != 0) return false;
        if (Float.compare(ball.getY(), getY()) != 0) return false;
        if (getRadius() != ball.getRadius()) return false;
        if (Float.compare(ball.getxDelta(), getxDelta()) != 0) return false;
        return Float.compare(ball.getyDelta(), getyDelta()) == 0;
    }

    @Override
    public int hashCode() {
        int result = (getX() != +0.0f ? Float.floatToIntBits(getX()) : 0);
        result = 31 * result + (getY() != +0.0f ? Float.floatToIntBits(getY()) : 0);
        result = 31 * result + getRadius();
        result = 31 * result + (getxDelta() != +0.0f ? Float.floatToIntBits(getxDelta()) : 0);
        result = 31 * result + (getyDelta() != +0.0f ? Float.floatToIntBits(getyDelta()) : 0);
        return result;
    }
}
