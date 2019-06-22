import java.util.Scanner;

public class Rearrange {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String s = keyboard.next();

        String firstHalf = s.substring(0, s.length()/2);
        String secondHalf = s.substring(s.length()/2);

        String c = firstHalf;
        firstHalf = secondHalf;
        secondHalf = c;

        String SwapedString = firstHalf + secondHalf;

        System.out.println(SwapedString);
    }
}