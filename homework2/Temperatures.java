import java.util.Scanner;

public class Temperatures {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int[] temperatures = new int[30];

        // Write a Java program that inputs the daily temperatures for one month (30days)
        for (int i = 0; i < temperatures.length; i++) {
            System.out.println("Please enter the temperature");
            temperatures[i] = keyboard.nextInt();
        }

        // the hottest and the coldest days of the month 
        int hottest = temperatures[0];
        int hottestDay = 0;
        int coldest = temperatures[0];
        int coldestDay = 0;
        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] > hottest) {
                hottest = temperatures[i];
                hottestDay = i;
            }
            if (temperatures[i] < coldest) {
                coldest = temperatures[i];
                coldestDay = i;
            }
        }

        System.out.println("The hottest day was: " + hottestDay + ", which was " + hottest);
        System.out.println("The coldest day was: " + coldestDay + ", which was " + coldest);

        // the average temperature of the month
        int sum = 0;
        for (int i = 0; i < temperatures.length; i++) {
            sum += temperatures[i];
        }

        double average = sum / 30.0;

        System.out.println("The average temperature is " + average);

        // the temperature difference between the hottest and coldest days of the month
        int difference  = hottest - coldest;
        System.out.println("the temperature difference between the hottest and coldest days of the month is " + difference);
    }
}