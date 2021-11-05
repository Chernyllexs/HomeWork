package com.javaoctoberfest.task.Horstmann.chapter_1;

import java.util.ArrayList;
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

/*

        // Exercise 3
        System.out.println("________________________Exercise 3________________________");
        System.out.print("Enter three integers: ");
        scanner = new Scanner(System.in);
        Exercise3.maxInteger(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        scanner.close();
*/


/*

        // Exercise 4
        System.out.println("________________________Exercise 4________________________");
        Exercise4.printDoublePositiveValue();
*/


/*

        // Exercise 6
        System.out.println("________________________Exercise 6________________________");
        System.out.println("Through for loop: " + Exercise6.factorialOfThousandFor(1000));
        System.out.println("Through recursion: " + Exercise6.factorialOfThousandRecursion(1000));
*/


        // Exercise 13
        System.out.println("________________________Exercise 13________________________");
        ArrayList<Integer> winCombination = Exercise13.lottery();
        System.out.println("Win combination: " + winCombination.toString());

    }
}
