package com.javaoctoberfest.task.Horstmann.chapter_4;

public class Rectangle extends Shape implements Cloneable {
    private double width;
    private double height;

    public Rectangle(Point topLeft, double width, double height) {
        super(topLeft);
        this.width = width;
        this.height = height;
    }

    @Override
    public Point getCentre() {
        return new Point(point.getX() + width / 2, point.getY() + height / 2);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Rectangle(point, width, height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", top left=" + point +
                '}';
    }
}
