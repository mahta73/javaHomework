/*
    Write a program to find maximum between three numbers.
*/
import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numberOne = keyboard.nextInt();
        int numberTwo = keyboard.nextInt();
        int numberThree = keyboard.nextInt();

        int max = numberOne;
        if (numberTwo > numberOne) {
            max = numberTwo;
        }
        if (numberThree > max) {
            max = numberThree;
        }

        System.out.println("the max is " + max);
    }
}