import java.util.Scanner;

public class Vector3DDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the coordinates of a 3D vector");
        int x = keyboard.nextInt();
        int y = keyboard.nextInt();
        int z = keyboard.nextInt();

        Vector3D vector1 = new Vector3D(x, y, z);

        System.out.println("Please enter the coordinates of the second 3D vector");
        int x2 = keyboard.nextInt();
        int y2 = keyboard.nextInt();
        int z2 = keyboard.nextInt();

        Vector3D vector2 = new Vector3D(x2, y2, z2);

        System.out.println(vector1.equals(vector2));

        Vector3D vector3 = Vector3D.vectorProdect(vector1, vector2);
        Vector3D.output(vector3);

        System.out.println(vector3);        
    }
}