package main.java.in.spotknack.s02;

public class JavaFundamentalsWithFunctions {
    public static void main(String[] args) {
        System.out.println("--- Java Fundamentals Demo ---");

        demonstrateDataTypes();
        
        demonstrateTypeCasting();
        
        demonstrateOperators();
        
        demonstrateOperatorPrecedence();
    }

    /**
     * Demonstrates primitive and non-primitive data types.
     */
    public static void demonstrateDataTypes() {
        System.out.println("\n--- 1. Data Types ---");
        
        // Primitive Types
        int myInt = 100;
        double myDouble = 3.14;
        boolean myBoolean = true;
        
        System.out.println("Primitive Types:");
        System.out.println("Integer: " + myInt);
        System.out.println("Double: " + myDouble);
        System.out.println("Boolean: " + myBoolean);
        
        // Non-Primitive (Reference) Type
        String myString = "Hello, Functions!";
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("\nNon-Primitive Type:");
        System.out.println("String: " + myString);
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
}