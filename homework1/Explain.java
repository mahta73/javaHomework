public class Explain {
    public static void main(String[] args) {
        /*
            *** VARIABLE DECLARATION AND INITIALIZATION   ***

            1. What is a variable? 
                Variable is a name given to a memory location(unit of storage in program).
                All the operations done on the variable effects that memory location.
            POINT: In java, all the variables must be declared before use.

            For declaring a variable in java first we need to indicate the type of it.
            type variable_name;
        
            NOTE: x, y, and z are local variables
            LOCAL VARIABLES:
            A variable defined within a block or method or constructor is called local variable.
            1. These variable are created when the block in entered or the function is called 
               and destroyed after exiting from the block or when the call returns from the 
               function.
            2. The scope of these variables exists only within the block in which the variable 
                is declared. i.e. we can access these variable only within that block.

            ***   INCREMENT AND DECREMENT OPERATORS IN JAVA ARE:   ***
                -- Arithmetic 
                -- Unary (One Operand)

                Increament Operator is used to increment value of variable by 1
                Decrement Operator is used to decrement value of variable by 1

                PRE INCREMENT(++NUMBER): Increments the value and immediately returns it.
                POST INCREMENT(NUMBER++): also increments the value but returns unchanged value of the variable
        */

        // The data type is int (4 bytes)
        int x, y; // 'x' and 'y' are two names given to some memory location, in other words x and y are being declared
        int z = 98; //Declaring and initializing the integer variable 'z', z is being declared and 98 is being stored as its value
        // ++z is pre increament which means the value of the z gets increamented by 1 and the new value get returned
        // therefore ++z is 98 + 1 or 99, and then 99 is assigned to the variable x
        // as a result of this, the value of x is 99
        x = ++z; 
        // x++ is pos increament, hence eventhough it increments the value of x by 1 but returns the unchanged value of the variable
        // therefore 99 is assigned to y
        y = x++; 
        // the variable first with the boolean datatype is being both declared and initialized
        // Point: boolean type occupies 1 byte of the RAM, and its value is either true or false
        // (y == x) checks if x and y are equal or not, if they are equal it returns true otherwise it returns false
        // (99 == 100) 99 is not equa to 100, therefore it returns false 
        // false is stored in first 
        boolean first = (y == x);
        // for && operator both of the conditions must be true to get true
        // at this point ot the program x = 100, y = 99 and z = 99 
        // therefore x == y + 1 returns true and 7 == z + 1 returns false
        // since true && false returns false, the value of the 'second' variable will be false
        boolean second = x == y + 1 && y == z + 1;
        // the value of z is 99, ~99 is -100
        // x = -100 + 1 = -99
        x = ~ z + 1;
        // the variable third which is a boolean type is being declared and initialized
        // x is a negative number, therefore the first part is false
        // x + z is equal to 0, therefore the second part is true
        // true or false is true
        // as a result the value of third is true
        boolean third = x >= 0 || x + z == 0;
        // Not(third) is NOT(true) which flase, so the value of the fourth is false
        boolean fourth = !third;
        // the values of x, y and z are being printed at console
        System.out.println("x = " + x + "; y = " + y + "; z = " + z + ";");
        // the values of first and second are being printed at console
        System.out.println("first = " + first + "; second = " + second + ";");
        // the values of third and forth are being printed at console
        System.out.println("third = " + third + "; fourth = " + fourth + ";");
        y = z | x; // | is bitwise or
        z >>= 2; // z = z >> 2; -> right shifting
        // (99 * 100) = 9900
        // 9900 % 24 -> % returns the remainder of the division
        x = y * 1000 % z;   
        // the values of x, y and z are being printed at console
        System.out.println("x = " + x + "; y = " + y + "; z = " + z + ";");
    }
}