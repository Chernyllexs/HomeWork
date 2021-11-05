package com.javaoctoberfest.task.Horstmann.chapter_1;

public class Exercise3 {
    public static void maxInteger(int a, int b, int c) {
        int maxValue = a;
        if (maxValue < b)
            maxValue = b;
        if (maxValue < c)
            maxValue = c;

        System.out.println("Compare with if-else conditional: " + maxValue);

        maxValue = Math.max(a, Math.max(b, c));
        System.out.println("Compare with Math.max(): " + maxValue);
    }
}
