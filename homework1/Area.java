/*
Write a Java program that inputs the radius of a circle and outputs its
circumference and its area.
*/

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the radius of the circle");
        double radius = keyboard.nextInt();

        // (pi)(r)(r)
        double pi = 3.14;
        double area = pi * radius * radius;

        System.out.println("The area of a circle with the radius = " + radius + " is " + area);
    }
}