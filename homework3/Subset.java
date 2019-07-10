/*
    (15 points) Write a Java program that reads two strings a and b (1 ≤ |b| ≤ |a| ≤
    100), and prints the number of substrings of a that are cyclic shifts of b. The cyclic
    shifts of a string b = c 1 c 2 . . . c n are c 1 c 2 . . . c n ; c 2 c 3 . . . c n c 1 ; c 3 . . . c n c 1 c 2 ; and so on until
    c n c 1 c 2 . . . c n−1 . The substrings of a string a = d 1 d 2 . . . d m are any d i d i+1 . . . d j−1 d j where
    1 ≤ i ≤ j ≤ m.
    For example, on input abcabc abc your program should output 4, while on input abcabc
    acb it should output 0.
*/

import java.util.Scanner;

public class Subset {
    public static void arrayOutPut(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static String[] cyclicShifts(String b) {
        String[] cyclicShifted = new String[b.length()];

        for (int i = 0; i < b.length(); i++) {
            b = b.substring(1) + b.charAt(0);
            cyclicShifted[i] = b;
        }
        

        return cyclicShifted;
    }

    public static String[] Createsubset(String s, int mod) {
       
        int size = s.length()-mod+1;
        String[] subsets = new String[size];
        for ( int i = 0; i < subsets.length; i ++) {
            subsets[i] = s.substring(i, i+mod);
        }

        return subsets;
    }

    public static int countSharedSubsets(String[] s1, String[] s2) {
        int count = 0;
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if (s1[i].equals(s2[j])) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Write a Java program that reads two strings a and b
        System.out.println("Please enter the string 'a'");
        String a = keyboard.next();

        System.out.println("Please enter the string 'b'");
        String b = keyboard.next();

        String[] c = cyclicShifts(b);
        arrayOutPut(c);
        
        String[] d = Createsubset(a, b.length());
        arrayOutPut(d);

        // prints the number of substrings of a that are cyclic shifts of b
        int count = countSharedSubsets(c, d);
        System.out.println(count);
    }
}