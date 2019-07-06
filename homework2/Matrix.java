import java.util.Random;

public class Matrix {
    public static void main(String[] args) {
        Random rand = new Random();

        // Write a Java program that inputs an integer n (1 ≤ n ≤ 30)
        int n = 4;//rand.nextInt(30) + 1;

        System.out.println("n = " + n);
        // and outputs an n × n matrix with the numbers from 1 to n 2 arranged in a spiral order.
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n ; j++) {
                int topMost = 0;
                int rightMost = n - 1;
                int bottomMost = n -1;
                int leftMost = 0;

                int direction = 0;
                /*
                    0 -->


                       |
                    1 \|/
                       .


                    2  <--


                    3  .
                      /|\
                       |
                */
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n"); // Make sure that the output is nicely formatted.
        }
    }
}