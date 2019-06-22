import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter a length 7 sting");
        String s = keyboard.next();

        boolean isPalindrome = 
            s.charAt(0) == s.charAt(6) &&
            s.charAt(1) == s.charAt(5) && 
            s.charAt(2) == s.charAt(4);

        System.out.println(isPalindrome);
    }
}