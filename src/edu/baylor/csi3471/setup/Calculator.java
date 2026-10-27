package edu.baylor.csi3471.setup;

public class Calculator {
    // compute factorial of an integer n with validation
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        if (n > 20) {
            throw new IllegalArgumentException("n is too large for a long");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}