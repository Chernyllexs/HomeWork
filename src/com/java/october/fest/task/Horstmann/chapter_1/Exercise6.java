package com.java.october.fest.task.Horstmann.chapter_1;

import java.math.BigInteger;

public class Exercise6 {
    public static BigInteger factorialOfThousandFor(int count) {
        BigInteger bigInteger = BigInteger.valueOf(1);
        for (int i = count; i > 0; i--) {
            bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
        }
        return bigInteger;
    }

    public static BigInteger factorialOfThousandRecursion(int count) {
        BigInteger bigInteger = BigInteger.valueOf(1);

        if (count == 1 || count == 0)
            return bigInteger;

        bigInteger = factorialOfThousandRecursion(count - 1).multiply(BigInteger.valueOf(count));
        return bigInteger;
    }
}
