import java.util.Scanner;

public class Lucky {
    static void IsLucky(int[] arr) {
        int firstHalf = 0;
        for (int i = 0; i < 3; i++) {
            firstHalf += arr[i];
        }
        
        int secondHalf = 0;
        for (int i = 3; i < 6; i++) {
            secondHalf += arr[i];
        }

        if (firstHalf == secondHalf) {
            System.out.println("LUCKY NUMBER :)");
        } else {
            System.out.println("try again :(");
        }
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // inputs a 6-digit integer
        System.out.println("Please enter a 6-digit number");
        int number = keyboard.nextInt();

        // check if it is a lucky number
        int[] digitsOfTheNum = new int[6];
        for (int i = 0; i < digitsOfTheNum.length; i++) {
            digitsOfTheNum[i] = number % 10;
            number = number / 10;
        }

        IsLucky(digitsOfTheNum);
        
    }
}