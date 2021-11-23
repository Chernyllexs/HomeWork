package com.java.october.fest.task.oop_2;

import java.util.Objects;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return Double.toString(real) + '+' + imag + 'i';
    }

    public boolean isReal() {
        return (Double.compare(real, 0.0) != 0);
    }

    public void setReal(double real) {
        this.real = real;
    }

    public boolean isImaginary() {
        return (Double.compare(imag, 0.0) != 0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyComplex myComplex = (MyComplex) o;
        return Double.compare(myComplex.real, real) == 0 &&
                Double.compare(myComplex.imag, imag) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(real, imag);
    }

    public boolean equals(double real, double imag) {
        MyComplex c = new MyComplex(real, imag);
        return this.equals(c);
    }

    public double magnitude() {
        return Math.sqrt(Math.pow((real), 2) + Math.pow((imag), 2));
    }

    public double argument() {
        return Math.atan2(imag, real);
    }

    public MyComplex add(MyComplex c) {
        this.real += c.getReal();
        this.imag += c.getImag();
        return this;
    }

    public MyComplex addNew(MyComplex c) {
        return new MyComplex(this.real + c.getReal(), this.imag + c.getImag());
    }

    public MyComplex subtract(MyComplex c) {
        this.real -= c.getReal();
        this.imag -= c.getImag();
        return this;
    }

    public MyComplex subtractNew(MyComplex c) {
        return new MyComplex(this.real - c.getReal(), this.imag - c.getImag());
    }

    public MyComplex multiply(MyComplex c) {
        this.real = this.getReal() * c.getReal() - this.getImag() * c.getImag();
        this.imag = this.getReal() * c.getImag() + this.getImag() * c.getReal();
        return this;
    }

    public MyComplex divide(MyComplex c) {
        this.real = (this.getReal() * c.getReal() + this.getReal() * c.getReal()) / Math.pow(c.magnitude(), 2);
        this.imag = (this.getImag() * c.getReal() - this.getReal() * c.getImag()) / Math.pow(c.magnitude(), 2);
        return this;
    }

    public MyComplex conjugate() {
        return new MyComplex(this.getReal(), -this.getImag());
    }
}
