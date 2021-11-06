package com.javaoctoberfest.task.Horstmann.chapter_2;

public class Test {
    public static void main(String[] args) {
        /*
        Point point = new Point(1.5, 2.25);
        System.out.println(point.toString());
        point = point.scale(2);
        System.out.println(point.toString());
        point = point.translate(10, -10);
        System.out.println(point.toString());
*/

        Car car = new Car(1.0);
        car.drive(30.0);
        car.refuel(35.0);
        car.drive(33.5);
        System.out.println(car);
    }
}
