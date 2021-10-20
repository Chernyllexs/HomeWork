package com.javaoctoberfest.task.oop_1.figures;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle{" +
                "v1=(" + v1.toString() +
                "), v2=(" + v2.toString() +
                "), v3=(" + v3.toString() +
                ")}";
    }

    public double getPerimeter() {
        return v1.distance(v2) + v1.distance(v3) + v2.distance(v3);
    }

    public String getType() {
        String triangleType = null;
        double lengthA = v1.distance(v2);
        double lengthB = v1.distance(v3);
        double lengthC = v2.distance(v3);

        if (lengthA >= (lengthB + lengthC) || lengthC >= (lengthB + lengthA) || lengthB >= (lengthA + lengthC))
            triangleType =  "Nonexistent";
        else if (lengthA == lengthB && lengthA == lengthC)
            triangleType = "Equilateral";
        else if (lengthA == lengthB || lengthA == lengthC || lengthB == lengthC)
            triangleType = "Isosceles";
        else if (lengthA != lengthB && lengthB != lengthC && lengthC != lengthA)
            triangleType = "Scalene";
        return triangleType;
    }
}
