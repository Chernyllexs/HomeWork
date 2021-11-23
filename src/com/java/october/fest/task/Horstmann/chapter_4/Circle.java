package com.javaoctoberfest.task.Horstmann.chapter_4;

public class Circle extends Shape implements Cloneable {
    private double radius;

    public Circle(Point centre, double radius) {
        super(centre);
        this.radius = radius;
    }

    @Override
    public Point getCentre() {
        return this.point;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Circle(point, radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", centre=" + point +
                '}';
    }
}
