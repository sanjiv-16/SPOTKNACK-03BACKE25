package main.java.in.spotknack.s02;

import java.util.Scanner;

public class JavaFundamentalsWithFunctions {

    public static void main(String[] args) {
        System.out.println("--- Java Fundamentals Demo ---");

        gettingInput();
         //demonstrateDataTypes();
        
        //demonstrateTypeCasting();
        
        //demonstrateOperators();
        
        //demonstrateOperatorPrecedence();
    }


    /**
     * Demonstrates primitive and non-primitive data types.
     */
    public static void demonstrateDataTypes() {
        System.out.println("\n--- 1. Data Types ---");
        
        // Primitive Types
        short snum = 1;
        int myInt = 100;
        double myDouble = 3.14;
        boolean myBoolean = true;
        long lnum = 1234567890123456789l;
        
        System.out.println("Primitive Types:");
        System.out.println("Integer: " + myInt);
        System.out.println("Double: " + myDouble);
        System.out.println("Boolean: " + myBoolean);
        
        // Non-Primitive (Reference) Type
        String myString = "Hello, Functions!";
        Integer myInteger = 200;
        Double myDouble2 = 3.14159;
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Array iteration : "+ arr[4]);
        String[] strArr = {"a", "b", "c", "d", "e"};
        System.out.println("\nNon-Primitive Type:");
        System.out.println("String: " + myString);
        //return "printed";
    }
    
    //-------------------------------------------------------------------------

    /**
     * Demonstrates widening and narrowing type casting.
     */
    public static void demonstrateTypeCasting() {
        System.out.println("\n--- 2. Type Casting ---");
        
        // Widening Casting (Implicit)
        int myIntForCast = 10;
        double myDoubleFromInt = myIntForCast; // Automatic
        System.out.println("Widening (int -> double): " + myIntForCast + " -> " + myDoubleFromInt);
        
        // Narrowing Casting (Explicit)
        double myDoubleForCast = 9.78;
        int myIntFromDouble = (int) myDoubleForCast; // Manual
        System.out.println("Narrowing (double -> int): " + myDoubleForCast + " -> " + myIntFromDouble + " (Data Loss)");
    }
    
    //-------------------------------------------------------------------------

    /**
     * Demonstrates arithmetic, relational, and logical operators.
     */
    public static void demonstrateOperators() {

        /**
         *
         *
         * 2 - 0010
         * 6 - 0110
         *     0110
         */

        int tmp = 5;
        int tmp2 =  6;
        System.out.println("Ans : " + (tmp==tmp2) + "sample");

        System.out.println("\n--- 3. Operators ---");
        int a = 20, b = 5;

        // Arithmetic Operators
        System.out.println("Arithmetic: a + b = " + (a + b));
        
        // Relational Operators
        System.out.println("Relational: a > b is " + (a > b));
        
        // Logical Operators
        boolean isTrue = (a > 10) && (b < 10);
        System.out.println("Logical AND: (a > 10) && (b < 10) is " + isTrue);

        // Bitwise operators (a brief example)
        int x = 8; // Binary: 1000
        int y = 4; // Binary: 0100
        System.out.println("Bitwise AND (&): " + (x | y)); // Result is 0
    }
    
    //-------------------------------------------------------------------------

    /**
     * Demonstrates the concept of operator precedence.
     */
    public static void demonstrateOperatorPrecedence() {
        System.out.println("\n--- 4. Operator Precedence ---");

        // Multiplication has higher precedence than addition
        int result1 = 10 + 5 * 2;
        System.out.println("Expression '10 + 5 * 2' evaluates to: " + result1);

        // Parentheses override precedence
        int result2 = (10 + 5) * 2;
        System.out.println("Expression '(10 + 5) * 2' evaluates to: " + result2);
    }

    public static void gettingInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String a = sc.nextLine();
        System.out.println("Enter a number : ");
        int b = sc.nextInt();
        System.out.println(a + b);
    }
    /**
     *
     *
     * bill calculator
     * String array of food items
     * int array of quantity
     * int array of price
     *
     * calculate price of the item with 18% GST and 5% service charge
     *
     *
     */

}