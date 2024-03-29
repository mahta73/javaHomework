/*
    3. (15 points) Imagine the following game: you start with a positive integer number a.
    Then taking the product of the digits of a, you get the number b. Then taking the product
    of the digits of b, you get the number c. Continuing in this manner, you eventually get a
    single-digit number (or do you?) and stop the game there.
    Write two variants (iterative and recursive) of a Java program that reads a positive integer
    number a and simulates this game by printing the resulting numbers at each step. Once
    a single-digit number is reached, the program stops and prints the number of steps taken.
    Does your program always terminate? Explain your answer.
*/

import java.util.Scanner;

public class Game {
    public static int test;
    // get the digits of the number 
    public static int[] digitsofNumber(int number) {
        int size = 0;
        int n = number;
        while(n > 0) {
            n /= 10;
            size++;
        }

        int[] digits = new int[size];
        for (int i = digits.length-1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    } 

    // get the product of digits of the number
    public static int ProductofDigitsOfNumber(int number) {
        int[] digits = digitsofNumber(number);

        int product = 1;
        for (int i = 0; i < digits.length; i++) {
            product *= digits[i];
        }
        System.out.println("The product of the digits of the number is " + product);
        return product;
    }

    // recursion
    public static int ProductofDigitsRecursive(int number) {
        
        int product = 1;
        if (number == 0){
            return product;
        }
        else {
            product = product * number % 10 * ProductofDigitsRecursive(number / 10);
            return product;
        }
    }

    public static int product_recursion(int number) {
        if (ProductofDigitsRecursive(number) < 10) {
            System.out.println("The product of the digits of the number is " + ProductofDigitsRecursive(number));
            return number;
        } else {
            System.out.println("The product of the digits of the number is " + ProductofDigitsRecursive(number));
            return product_recursion(ProductofDigitsRecursive(number));
        } 
    }



    // iterative
    public static void ProductofDigitsIteration(int number) {
        do {
            number = ProductofDigitsOfNumber(number);
        } while(number > 9);
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int positiveInt;

        // you start with a positive integer number a
        do {
            System.out.println("Please enter a positive integer");
            positiveInt = keyboard.nextInt();
        } while(positiveInt <= 0);
        
        ProductofDigitsIteration(positiveInt);
        System.out.println();
        product_recursion(positiveInt);
    }   
}

/*
    Does your program always terminate? Explain your answer.
    I think yes, my program always terminates since digits of a number are integers
    and if we keep multiplying them by each other we will get smaller and smaller numbers
    and a signle digit number eventually.

*/