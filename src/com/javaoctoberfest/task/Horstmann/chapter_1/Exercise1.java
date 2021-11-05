package com.javaoctoberfest.task.Horstmann.chapter_1;

public class Exercise1 {

    public static void convertInt(int in) {
        System.out.println("Binary representation = " + Integer.toBinaryString(in));
        System.out.println("Octal representation = " + Integer.toOctalString(in));
        System.out.println("Hexadecimal representation = " + Integer.toHexString(in));
        System.out.println("Reverse hexadecimal representation = " + Float.toHexString(1.0f / (float) in));
    }

}
