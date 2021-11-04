package com.javaoctoberfest.task.Horstmann.chapter_1;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  Exercise 1
/*
        System.out.println("________________________Exercise 1________________________");
        System.out.print("Enter an integer: ");
        Exercise1.convertInt(scanner.nextInt());
        scanner.close();
*/

/*

        // Exercise 2
        System.out.println("________________________Exercise 2________________________");
        System.out.print("Enter an integer number of degrees: ");
        scanner = new Scanner(System.in);
        Exercise2.normaliseDegree(scanner.nextInt());
        scanner.close();
*/


        // Exercise 3
        System.out.println("________________________Exercise 3________________________");
        System.out.print("Enter three integers: ");
        scanner = new Scanner(System.in);
        Exercise3.maxInteger(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        scanner.close();

    }
}
