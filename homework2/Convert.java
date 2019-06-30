public class Convert {
    public static void main(String[] args) {
        // int grade = 22;
        // int a, b;
        // if (grade == 10) {
        //     a = 1;
        //     b = 2;
        // } else if (grade == 9 || grade == 8) {
        //     a = 6;
        //     b = 7;
        // } else {
        //     b = 5;
        // }

        int grade = 22;
        int a, b;

        switch(grade) {
            case 10:
                a = 1;
                b = 2;
                break;
            case 9:
                a = 6;
                b = 7;
                break;
            case 8:
                a = 6;
                b = 7;
                break;
            default:
                b =5;
                break;
        }

        // int sum = 0;
        // int power = 1;
        // for (int i = 0; i < 25; i++)
        // {
        // sum += power;
        // power = power << 1;
        // }

        // What value is computed in sum? Explain the calculations.

        int sum = 0;
        int power = 1;
        int i = 0;
        while(i < 25) {
            sum += power; // sum = sum + power
            power = power << 1; // power = power * 2
            i++;
        }

        // sum = 1 + 2 + 4 + 8 + 16 + 32 + ...

        System.out.println("The value of sum is " + sum); // the value of sum is 33554431

        // Express the resulting while loop from the previous task by using a do-while loop.

        int sum2 = 0;
        int power2 = 1;
        int j = 0;
        do {
            sum2 += power2; // sum = sum + power
            power2 = power2 << 1; // power = power * 2
            j++;
        } while (j < 25);

        System.out.println("The value of sum2 is " + sum2); // the value of sum is 33554431
    }
}