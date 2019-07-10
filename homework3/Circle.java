/** 
    (10 points) Write a Java program that inputs the radius of a circle and outputs its
    circumference and its area. Your program should consist of two files:
    • Circle.java, containing the definition of the Circle class with corresponding instance variables, constructors and methods;
    • CircleDemo.java, containing the demo class with the main method that illustrates
    the use of the Circle class.
    If both files are put in the same directory (folder) compiling and running CircleDemo.java
    in the usual way, i.e. javac CircleDemo.java; java CircleDemo should work.
*/

import java.util.Scanner;

public class Circle {
    private final double EPSILON = 0.00000001;
    private double radius;

    public Circle(int radius) {
        this.radius = toDouble(radius);
    }

    private double toDouble(int radius) {
        return new Double(radius);
    }

    public double circumference() {
        return Math.PI * 2 * this.radius;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }

    public boolean equals(Circle c) {
        return (Math.abs(this.radius-c.radius) < EPSILON);
    }

    public String toString() {
        return ("The radius of the circle is " + this.radius);
    }
}