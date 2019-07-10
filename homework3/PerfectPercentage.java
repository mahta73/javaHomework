/*
    (15 points) Write a Java program that approximates the percentage of perfect numbers
    in some range 1..N. First of all, your program should include a method that checks if a
    given number is perfect. Your program should follow the procedure below:
    (a) Read in the integer N
    (b) For K equalling each of 100, 200, . . . , 900, 1000, do
    (c) Generate K random numbers in the range 1..N, check how many of them are perfect
    and output the corresponding percentage.
    Thus, your program should output ten approximations (one for each value of K) for the
    accurate percentage. What is the advantage of this approach over checking every single
    number in the range 1..N and finding the accurate percentage? How does the accuracy
    of the calculation change when we move from K = 100 to K = 1000?
*/
import java.util.Scanner;
import java.util.Random;

public class PerfectPercentage {

    // First of all, your program should include a method that checks if a given number is perfect.
    public static int[] properDivisors(int number) {
        int size = 0;
        for(int i = 1; i < number; i++) {
            if (number % i == 0) {
                size++;
            }
        }

        int[] divisors = new int[size];
        int index = 0;
        for(int i = 1; i < number; i++) {
            if (number % i == 0) {
                divisors[index++] = i;
            }
        }

        return divisors;
    }

    public static boolean isPerfect(int number) {
        int[] arr = properDivisors(number);
        int sumOfDivisors = 0;
        for (int i = 0; i < arr.length; i++) {
            sumOfDivisors += arr[i];
        }

        if (sumOfDivisors == number) {
            return true;
        } else {
            return false;
        }
    }

    // Generate K random numbers in the range 1..N
    public static int[] randomGenerator(int number, int k) { 
        Random random = new Random();
        int[] random_numbers = new int[k];

        for (int i = 0; i < k; i++) {
            random_numbers[i] = random.nextInt(number) + 1;
        }

        return random_numbers;
    }

    public static String percent(int[] randomNumbers) {
        int numberofPerfectElements = 0;
        for (int i = 0; i < randomNumbers.length; i++) {
            if (isPerfect(randomNumbers[i])) {
                numberofPerfectElements++;
            }
        }

        double percent = (numberofPerfectElements * 100) / (double)randomNumbers.length;

        return percent + " %";
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        // Read in the integer N
        System.out.println("Please enter the integer N");
        int number = keyboard.nextInt();

        // For K equalling each of 100, 200, . . . , 900, 1000
        int[] k = new int[10];
        for (int i = 0; i < k.length; i++ ) {
            k[i] = (i+1) * 100;;
        }

        for (int i = 0; i < k.length; i++) {
            int[] arr = randomGenerator(number, k[i]);
            System.out.println(percent(arr));
        }

    }
}

/*
    What is the advantage of this approach over checking every single
    number in the range 1..N and finding the accurate percentage?
    I think since the numbers are being taken randomly, we can find the chance of getting 
    a perfect number at random. While by checking every single number in the range 1,..,N
    we find the accurate percentage whiout considering the chance of getting it randomly, which
    is not very realistic.
    
    How does the accuracy of the calculation change when we move from K = 100 to K = 1000?
    As we are considering larger amount of numbers, therefore I think it gets more accurate
*/