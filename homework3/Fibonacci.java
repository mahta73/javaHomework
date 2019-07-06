/*
    (15 points) Write two variants (iterative and recursive) of a Java program that reads a
    natural number n (1 ≤ n ≤ 80) and prints the n-th Fibonacci number.
*/

import java.util.Scanner;

public class Fibonacci {

    public static double nth_FibonacciNumber(int n) {
        double[] fibonacci = new double[n+1];
        for (int i = 0; i < n+1; i++) {
            if (i == 0 || i == 1) {
                fibonacci[i] = 1;
            } else {
                fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
            }
        }

        return fibonacci[n];
    }

    public static double nth_FibonacciRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return nth_FibonacciRecursive(n-1) + nth_FibonacciRecursive(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int n;
        do {
            System.out.println("Please enter a natural number which is: 1 ≤ n ≤ 80");
            n = keyboard.nextInt();
        } while(n < 1 || n > 80);
        
        // iterative variant
        double result = nth_FibonacciNumber(n);
        System.out.println("The " + n + "th number of the Fibonacci sequence is " + result);

        //recursive variant
        double result2 = nth_FibonacciRecursive(n);
        System.out.println("The " + n + "th number of the Fibonacci sequence is " + result2);
    }
}