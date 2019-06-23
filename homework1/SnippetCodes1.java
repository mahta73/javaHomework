public class SnippetCodes1 {
    public static void main(String[] args) {
        // variables 'a' and 'b' are declared and initialized
        int a = 15;
        int b = -36;

        System.out.println("The value of a is " + a);
        System.out.println("The value of b is " + b);

        // we need one extra varialbe in order not to lose the value of 'a'
        int tmp = a; // the value of a is kept in tmp
        a = b; // now the value of a is changed to b
        b = tmp; // then, we store the value of tmp(which is the inital value of a) in b

        System.out.println("After switching");
        System.out.println("The value of a is " + a);
        System.out.println("The value of b is " + b);
    }
}