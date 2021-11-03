package com.javaoctoberfest.task.oop_1.figures;

public class Rectangle {
    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle() {
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle["
                + "length=" + length
                + ", width=" + width
                + ']';
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimetr() {
        return (2 * (length + width));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        if (Float.compare(rectangle.getLength(), getLength()) != 0) return false;
        return Float.compare(rectangle.getWidth(), getWidth()) == 0;
    }

    @Override
    public int hashCode() {
        int result = (getLength() != +0.0f ? Float.floatToIntBits(getLength()) : 0);
        result = 31 * result + (getWidth() != +0.0f ? Float.floatToIntBits(getWidth()) : 0);
        return result;
    }
}
