/*
    5. (10 points) Write a Java program that inputs the daily temperatures for one month (30
    days) and outputs the following information:
    • the hottest and the coldest days of the month (both days and the corresponding
    temperatures);
    • the average temperature of the month;
    • the temperature difference between the hottest and coldest days of the month.

    Similar to Task 1, your program should consist of two source files: one with a corresponding
    class definition to represent the daily temperatures for one month and another file with
    the demo program.
*/

import java.util.Scanner;

public class Temperature {
    private int[] temperatures = new int[30];

    public void inputTemperatures() {
        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < temperatures.length; i++) {
            System.out.println("Please enter the temperature of the " + (i+1) + " day of the month");
            this.temperatures[i] = keyboard.nextInt();
        }
    }

    public int coldest() {
        // int[] coldest = new int[2];
        int coldestTemperature = this.temperatures[0];
        int coldestDay = 1;
        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] < coldestTemperature) {
                coldestTemperature = temperatures[i];
                coldestDay = i + 1;
            }
        }
        // coldest[0] = coldestTemperature;
        // coldest[1] = coldestDay;
        System.out.println("The coldest day of the month is " + coldestDay + " which was " + coldestTemperature + " degrees");
        return coldestTemperature;
    }

    public int hotest() {
        // int[] coldest = new int[2];
        int hotestTemperature = this.temperatures[0];
        int hotestDay = 1;
        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] > hotestTemperature) {
                hotestTemperature = temperatures[i];
                hotestDay = i + 1;
            }
        }
        // coldest[0] = coldestTemperature;
        // coldest[1] = coldestDay;
        System.out.println("The hotest day of the month is " + hotestDay + " which was " + hotestTemperature + " degrees");
        return hotestTemperature;
    }

    public int hottestColdesDifference() {
        return hotest() - coldest();
    }

    public double averageTemperature() {
        double sumOfTemperatures = 0;
        for (int i = 0; i < temperatures.length; i++) {
            sumOfTemperatures += temperatures[i];
        }

        return sumOfTemperatures / temperatures.length;
    }
}