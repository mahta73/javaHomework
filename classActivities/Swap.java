import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter two integers: ");
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();

        System.out.println("Before swap: a = " + a + " b = " + b);

        // The first method
        int c = b;
        b = a;
        a = c;

        /* 
            THE BEST PRACTICE FOR INTEGERS, but it doesn't work for String type variables
            int, double, float
            a = a + b;
            b = a - b;
            a = a - b;
        */

        /* 
            int
            a = a ^ b;
            b = a ^ b;
            a = a ^ b; 
        */
        System.out.println("Before swap: a = " + a + " b = " + b); 
    }
}