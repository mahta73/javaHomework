public class Comparison {
    public static final double EPSILON = 0.0000001;

    public static void main(String[] args) {
        double firstNumber = 1.0000001;
        double secondNumber = 0.0000001;

        double differenceOfNumbers = firstNumber - secondNumber;

        if (Math.abs(differenceOfNumbers - 0.1) < EPSILON) {
            System.out.println("YES");
        }

        System.out.println(Math.abs(-10));

        // strings in java
        String myName = "Mahta";
        String mySurname = new String("Rezayazdi");

        // bad comparison of strings
        // never compare with ==
        // instead

        System.out.println(myName.equals(mySurname));
    }
}