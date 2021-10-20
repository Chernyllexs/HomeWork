package com.javaoctoberfest.task.oop_1.figures;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        return new int[]{x, y};
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return Integer.toString(x) + ',' + y;
    }

    private double calculateDistance(int x, int y) {
        return Math.sqrt(Math.pow((x - this.x), 2) + Math.pow((y - this.y), 2));
    }

    public double distance(int x, int y) {
        return calculateDistance(x, y);
    }

    public double distance(MyPoint point) {
        return calculateDistance(point.getX(), point.getY());
    }

    public double distance() {
        return calculateDistance(0, 0);
    }
}
