// Write a Java program that finds and prints the average of four integers. I
public class Average {
    public static void main(String[] args) {
        // declare and initialise four variables of integer type
        int numberOne = 4;
        int numberTwo = 10;
        int numberThree = 80;
        int numberFour = 23;

        // calculate and store their sum in a fifth variable named sum,
        double sum = numberOne + numberTwo + numberThree + numberFour;

        // divide the value of sum by 4 and store it in a sixth variable average
        double average = (double)sum / 4;
        /*
            double average = sum / 4.0;
            double average = sum / (double)4;
            double average = (double)(sum / 4);
        */

        // print the resulting value with a corresponding message.
        String resultMessage = "The average of " + numberOne + ", " + numberTwo + ", " + numberThree + ", " + numberFour + " is " + average;
        System.out.println(resultMessage);
    }
}