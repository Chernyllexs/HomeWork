package com.javaoctoberfest.task.Horstmann.chapter_4;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(new Point(5, 5), 5);
        circle.moveBy(5, -5);
        System.out.println(circle);
        System.out.println(circle.getCentre());

        Rectangle rectangle = new Rectangle(new Point(1.5, -1.5), 5.5, -3.5);
        System.out.println(rectangle);
        System.out.println(rectangle.getCentre());

        Line line = new Line(new Point(1.5, -1.5), new Point(-1.5, 1.5));
        System.out.println(line);
        System.out.println(line.getCentre());


        Circle circle1 = null;
        try {
            circle1 = (Circle) circle.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("Clone circle: " + circle1);

    }
}
