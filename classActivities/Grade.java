/*
    Write a program to input marks of five subjects Physics, Chemistry,
    Biology, Mathematics and Computer Science. Calculate percentage and
    grade according to the following:
    Percentage >= 90% : Grade A
    Percentage >= 80% : Grade B
    Percentage >= 70% : Grade C
    Percentage >= 60% : Grade D
    Percentage >= 40% : Grade E
    Percentage < 40% : Grade F
*/
import java.util.Scanner;

public class Grade {
    public static final double EPSILON = 0.0000001;
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int[] grades = new int[5];
        for (int i = 0; i < grades.length; i++) {
            switch(i) {
                case 0:
                    System.out.println("Physics grade: ");
                    break;
                case 1:
                    System.out.println("Chemistry grade: ");
                    break;
                case 2:
                    System.out.println("Biology grade: ");
                    break;
                case 3:
                    System.out.println("Mathematicss grade: ");
                    break;
                case 4:
                    System.out.println("Computer Science grade: ");
                    break;
            }
            grades[i] = keyboard.nextInt();
        }

        // summation of the grades
        double gradesSum = 0;
        for (int i = 0; i < grades.length; i++) {
            gradesSum += grades[i];
        }

        // calculate percentage
        double percentage = (gradesSum * 100) / 500;

        System.out.println(percentage + " %");

        if (percentage >= 90) {
            System.out.println("A");
        } else if (percentage >= 80) {
            System.out.println("B");
        } else if (percentage >= 70) {
            System.out.println("C");
        } else if (percentage >= 60) {
            System.out.println("D"); 
        } else if (percentage >= 40) {
            System.out.println("E"); 
        } else {
            System.out.println("F");
        }
    }
}