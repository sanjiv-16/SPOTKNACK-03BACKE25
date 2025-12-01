package main.java.s07;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo {

    public static void demoUncheckedExceptions() {
        System.out.println("--- 1. Unchecked Exception Demo ---");
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught Unchecked Exception: ArithmeticException (e.g., divide by zero)");
            System.out.println("Error Message: " + e.getMessage());
        }

        try {
            String s = null;
            System.out.println("Length: " + s.length());
        } catch (NullPointerException e) {
            System.out.println("\nCaught Unchecked Exception: NullPointerException (e.g., calling method on null)");
        }
    }

    public static void demoCheckedException(String fileName) throws IOException {
        System.out.println("\n--- 2. Checked Exception Demo (using 'throws') ---");
        FileReader reader = new FileReader(fileName);
        System.out.println("File '" + fileName + "' opened successfully.");
        reader.close();
    }

    public static void demoTryCatchFinally() {
        System.out.println("\n--- 3. try-catch-finally Demo ---");
        try {
            System.out.println("=> In the 'try' block.");
            // Intentional NullPointerException
            String s = null;
            s.length();
            System.out.println("=> Code after exception (skipped).");
        } catch (NullPointerException e) {
            System.out.println("=> In the 'catch' block: Handled the NullPointerException.");
        } finally {
            System.out.println("=> In the 'finally' block: Always executes for cleanup/resource closing.");
        }
    }

    public static void demoTryWithResources(String fileName) {
        System.out.println("\n--- 4. try-with-resources Demo ---");

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine();
            System.out.println("Read from file: " + line);
        } catch (IOException e) {
            System.err.println("Error in try-with-resources: " + e.getMessage());
        }
    }

    public static void withdraw(double amount, double balance) throws InsufficientFundsException {
        System.out.println("\n--- 5. Custom Exception & 'throw' Demo ---");
        if (amount > balance) {
            throw new InsufficientFundsException("Transaction failed: Tried to withdraw $" + amount + " but balance is $" + balance);
        }
        System.out.println("Withdrawal successful. Remaining balance: " + (balance - amount));
    }

    public static void main(String[] args) {
//         Demo 1: Unchecked Exceptions
        demoUncheckedExceptions();

        // Demo 2: Handling Checked Exceptions
        try {
            // File does NOT exist -> throws FileNotFoundException
            demoCheckedException("non_existent_file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("\nCaught Checked Exception (FileNotFoundException): Please check the file path.");
        } catch (IOException e) {
            // General IO handler (should be after specific handler)
            System.out.println("\nCaught General Checked Exception: An IOException occurred.");
        }

//         Demo 3: try-catch-finally
        demoTryCatchFinally();

//         Demo 4: try-with-resources (Needs a valid file for success, or will catch error)
        try {
            demoTryWithResources("input.txt");
        } catch (Exception ignored) {
//             Just catching to prevent crash if file is missing (for the sake of the demo flow)
        }


        // Demo 5: Custom Exception
        try {
            withdraw(150.0, 100.0); // Will throw the custom exception
        } catch (InsufficientFundsException e) {
            e.printStackTrace();
            System.out.println("\nCaught Custom Unchecked Exception: " + e.getMessage());
        }
    }

}