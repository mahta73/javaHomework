/*
    Does this sorting aproach have any limitations or is it applicable to any array of integers?
    Briefly explain your answer.

    I think the 100 iteration is not necessarily needed, maybe we could find another method which 
    doesn't need this much iteration. I believe it has negative effect on the performance.
*/

import java.util.Scanner;
import java.util.Random;

public class Arr {

    public static void fillOutArray(int[] arr, int range) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(range);
        }
    }

    public static void printArrayElements(int[] arr, String arrayName) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arrayName + "[ " + i + " ] = " + arr[i]);
        }
    }
    // Your program should contain separate methods for constructing the count array
    /*
        int[] count = new int[RANGE]; // default is 0
        for (int i = 0; i < n ; i++) {
            count[array[i]]++;
        }
    */

    // java api 8, arrays class fill
    public static int[] ConstructCountArr(int[] arr) {
        int [] count = new int[100];

        for (int i = 0; i < 100; i++) {
            int countOf_i= 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    countOf_i++;
                }
            }
            count[i] = countOf_i;
            countOf_i = 0;
        }
        return count;
    }
    
    public static void sortArr(int[] count, int[]intArr) {
        int index = 0;
        for (int i = 0; i < count.length; i++ ) {
            // if (count[i] != 0) {
                for (int j = 0; j < count[i]; j++ ) {
                    // intArr[index++] = i;
                    intArr[index] = i;
                    index++;
                }
            /// }
        }
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Your program should first read an integer n
        System.out.println("Please enter the lenght of the array");
        int arrLength = keyboard.nextInt();
        System.out.println("The length of the array is " + arrLength);

        // then it should read n numbers in the range from 0 to 99 and store them in an array array. 
        int[] intArr = new int[arrLength];

        // fill in the array with random numbers from 0 to 100
        fillOutArray(intArr, 100);

        // print the array
        printArrayElements(intArr, "intArr");

        // Next, it should construct a second array count of length 100
        int [] count = ConstructCountArr(intArr);

        // print the array
        printArrayElements(count, "count");

        // Finally, your program should put c[0]-many 0s into array, followed by c[1]-many
        // 1s, followed by c[2]-many 2s, etc
        sortArr(count, intArr);
        
        printArrayElements(intArr, "SortedArr");
    }
    // ruben_ashughyan@edu.aua.am
}