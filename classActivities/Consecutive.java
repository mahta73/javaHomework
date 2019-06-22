import java.util.Scanner;

public class Consecutive {
    public static void main(String[] args) {
        // Scanner is data type
        Scanner keyboard = new Scanner(System.in);
        // int numberOne;
        // int numberTwo;
        // int numberThree;

        System.out.println("Enter three Integer numbers");
        int numberOne = keyboard.nextInt();
        int numberTwo = keyboard.nextInt();
        int numberThree = keyboard.nextInt();

        // sort and then check

        int diff = numberTwo - numberOne;
        int diff2 = numberThree - numberTwo;

        boolean isConsecutive =  (diff == 1) && (diff2 == 1);

        System.out.println(diff == 1);
        System.out.println(diff2 == 1);
        System.out.println(isConsecutive);
    }
}