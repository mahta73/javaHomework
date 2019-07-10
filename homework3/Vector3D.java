/*
    (20 points)  Write a Java program that reads the coordinates of two 3D vectors and prints
    the coordinates of their vector product.Your program should include a class Vector3D
    definition for representing 3D vectors and a method that finds the vector product of two
    3D vectors, i.e. it takes two parameters of type Vector3D and returns a Vector3D object
*/
public class Vector3D {
    private int[] vector = new int[3];

    public Vector3D(int x, int y, int z) {
        vector[0] = x;
        vector[1] = y;
        vector[2] = z;
    }

    public static void output(Vector3D v) {
        for (int i = 0; i < v.vector.length; i++) {
            System.out.print(v.vector[i] + " ");
        }
        System.out.println();
    }

    public static Vector3D vectorProdect(Vector3D v1, Vector3D v2) {
        Vector3D v3 = new Vector3D(0, 0, 0);

        for (int i = 0; i < 3; i++) {
            v3.vector[i] = v1.vector[i] * v2.vector[i];
        }
    
        return v3;
    }

    public boolean equals(Vector3D v) {
        for (int i = 0; i < 3; i++) {
            if (this.vector[i] != v.vector[i]) {
                return false;
            }
        } 
        return true;
    }

    public String toString() { 
        return (this.vector[0] + " " + this.vector[1] + " " + this.vector[2]);
    }
}