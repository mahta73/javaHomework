public class SnippetCodes5 {
    public static void main(String[] args) {
        int a = 1;
        int b = 128;

        // a = 1 = 00000000 00000000 00000000 00000001
        // a << 6 =  0000000 0000000 00000000 01000000 = (64)10

        // b = 128 =    00000000 00000000 00000000 10000000 
        // b << 2 =      0000000 00000000 00000010 00000000 = (2^9) = 512

        a <<= 6; // a = a << 6 (shift it 6 bits to the left, put 0)
        b <<= 2; // b = << 2
        System.out.println("The results are " + a + " and " + b);
    }
}