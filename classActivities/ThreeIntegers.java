import java.util.Scanner;

public class ThreeIntegers {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter three integers");
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        int c = keyboard.nextInt();

        boolean additionRule = a + b == c;
        boolean subtractionRule = a - b == c;
        boolean multiplationRule = a * b == c;
        boolean divisionRule = (a / b) == c && a % b == 0;

        boolean isAcceptable = additionRule || subtractionRule || multiplationRule || divisionRule;

        System.out.println(isAcceptable);
    }
}