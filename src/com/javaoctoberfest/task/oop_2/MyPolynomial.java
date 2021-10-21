package com.javaoctoberfest.task.oop_2;

public class MyPolynomial {
    private final double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        int counter = 0;

        while ((counter - 1) != getDegree()) {
            if (counter == 0)
                stringBuilder.append(coeffs[0]);
            else if (coeffs[counter] > 0)
                stringBuilder.append(" + " + coeffs[counter] + "x^" + counter);
            else if (coeffs[counter] < 0)
                stringBuilder.append(" - " + Math.abs(coeffs[counter]) + "x^" + counter);

            counter++;
        }
        return stringBuilder.toString();
    }

    public double evaluate(double x) {
        double result = coeffs[0];
        for (int i = 1; i <= this.getDegree(); i++) {
            result += coeffs[i] * Math.pow(x, i);
        }
        return result;
    }

    public MyPolynomial add(MyPolynomial polynomial) {
        if (this.getDegree() >= polynomial.getDegree()) {
            return add(this, polynomial);
        } else {
            return add(polynomial, this);
        }
    }

    private MyPolynomial add(MyPolynomial a, MyPolynomial b) {
        double[] newPolynom = new double[0];
        if (a.getDegree() >= b.getDegree()) {
            newPolynom = new double[a.getDegree() + 1];
            for (int i = 0; i <= a.getDegree(); i++) {
                if (i <= b.getDegree())
                    newPolynom[i] = a.coeffs[i] + b.coeffs[i];
                else
                    newPolynom[i] = a.coeffs[i];
            }
        }
        return new MyPolynomial(newPolynom);
    }

    public MyPolynomial multiply(MyPolynomial polynomial) {
        double[] newPolynom = new double[this.getDegree() + polynomial.getDegree() + 2];
        for (int i = 0; i <= this.getDegree(); i++) {
            for (int j = 0; j <= polynomial.getDegree(); j++) {
                newPolynom[i + j] += this.coeffs[i] * polynomial.coeffs[j];
            }
        }
        return new MyPolynomial(newPolynom);
    }
}
