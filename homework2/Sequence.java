import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Write a Java program that first reads an integer n
        System.out.println("Please enter an integer");
        int n = keyboard.nextInt();

        String[] stringArray = new String[n];

        // then reads a sequence of n words
        for (int i = 0; i < n; i++) {
         System.out.println("Please enter an String");
         stringArray[i] = keyboard.next();
        }

        // and prints that sequence reversing the order of the words in odd positions.
        for (int i = 0; i < n / 2 ; i+=2) {
            String c; 
            c = stringArray[i];
            stringArray[i] = stringArray[(n-1) - i];
            stringArray[(n-1) - i] = c;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(stringArray[i] + " ");
        }
    } 
}

/*
    How many iterations does each of the loops in your program do?
    half of its length and if it is a decimal number we can round it down
*/