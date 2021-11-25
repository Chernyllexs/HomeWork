package com.java.october.fest.task.Horstmann.chapter_4;

public class Line extends Shape implements Cloneable {
    Point to;

    public Line(Point from, Point to) {
        super(from);
        this.to = to;
    }

    @Override
    public Point getCentre() {
        return new Point((point.getX() + to.getX()) / 2, (point.getY() + to.getY()) / 2);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Line(point, to);
    }

    @Override
    public String toString() {
        return "Line{" +
                "to point=" + to +
                ", from point=" + point +
                '}';
    }


}
