public class FifthQuestion {
    public static void main(String[] args) {
        // (a) 510 & -2050

        // a = 00000000 00000000 00000001 11111110
        double a = 510;

        // b = 00000000 00000000 00001000 00000010
        // -b = 
        // 11111111 11111111 11110111 11111101 
        // + 1
        //  11111111 11111111 11110111 11111110
        double b = 2050;

        // 00000000 00000000 00000001 11111110
        // &
        // 11111111 11111111 11110111 11111110 
        // 00000000 00000000 00000001 11111110
        double c = a & -b;


        // (b) -500 | 12345

        //      11111111 11111111 11111110 00001100
        // |
        //      00000000 00000000 00110000 00111001
        //      11111111 11111111 11111110 00111101

        // (c) 15 ^ (~70)
        // 70 = 00000000 00000000 00000000 01000110

        // c =   00000000 00000000 00000000 00001111
        // ~70 = 11111111 1111111 11111111 10111001
        //       11111111 11111111 11111111 10111111

        // (d) -201 >> 3

        // d = 11111111 11111111  11111111 00110111
        // >> 3 11111111 11111111 11111111 11100110

        // (e) -201 >>> 4

        // e = 11111111 11111111  11111111 00110111
        // >>> 4
        // 00001111 11111111 11111111 11110011
    }
}