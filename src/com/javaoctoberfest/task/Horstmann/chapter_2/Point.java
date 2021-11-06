package com.javaoctoberfest.task.Horstmann.chapter_2;

public final class Point {
    private final double x;
    private final double y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point translate(double deltaX, double deltaY) {
        return new Point(x + deltaX, y + deltaY);
    }

    public Point scale(double coefficient) {
        return new Point(x * coefficient, y * coefficient);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
