/*
    Write a program to input basic salary of an employee and calculate its
    Gross salary according to the following:
    Basic Salary <= 10000 : HRA = 20%
    Basic Salary <= 20000 : HRA = 25%
    Basic Salary > 20000 : HRA = 30%
*/

import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter your basic salary");
        double salary = keyboard.nextDouble();
    }
}