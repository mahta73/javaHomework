public class SnippetCodes2 {
    public static void main(String[] args) {
        // a and b are declared and initialized
        int a = 45;
        int b =  10;

        System.out.println("The value of a is " + a);
        System.out.println("The value of b is " + b);

        // Switiching the values of a and b
        // ^ is bitwise exclusive or
        // ^ returns true only of one of the values are true
        // if either both are true or false it returns fals
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After switching");
        System.out.println("The value of a is " + a);
        System.out.println("The value of b is " + b);

        // Again we are switching the values of a and b one more time
        a = a + b; // add the value of b to a
        b = a - b; // (a + b) - b, therefore, the initial value of a is being stored at b 
        a = a - b; // (a + b) -a , therefore, the initial value of b is being stored at a

        System.out.println("After reswitching");
        System.out.println("The value of a is " + a);
        System.out.println("The value of b is " + b);
    }
}