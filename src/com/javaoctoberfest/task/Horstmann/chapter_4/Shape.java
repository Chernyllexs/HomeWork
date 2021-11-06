package com.javaoctoberfest.task.Horstmann.chapter_4;


public abstract class Shape {
    Point point;

    public Shape(Point point) {
        this.point = point;
    }

    public void moveBy(double dx, double dy){
        point.setXY(point.getX() + dx, point.getY() + dy);
    }

    public abstract Point getCentre();


}
