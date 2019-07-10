import java.util.Scanner;

public class CircleDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // input the radius of a circle
        System.out.println("Please enter the radius of the circle");
        int radius = keyboard.nextInt();

        Circle circle = new Circle(radius);
        System.out.println("The area of the circle is " + circle.area());
        System.out.println("The circumference of the circle is " + circle.circumference());
    }
}