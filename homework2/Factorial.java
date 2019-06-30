/*
What is the maximum value for n that allows its factorial to be represented with type long?

since the maximum possible value for long is "9223372036854775807", I think the maximum possible 
value for n is around 20
*/
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Write a Java program that reads a natural number n   
        System.out.println("Please enter a natural number: ");
        int n = keyboard.nextInt();

        // and prints its factorial n!
        int factorial = 1;
        while (n != 0) { // POINT: 0 is not a natural number
            factorial *= n;
            n--;
        }

        System.out.println("n's factorial is " + factorial);
    }
}