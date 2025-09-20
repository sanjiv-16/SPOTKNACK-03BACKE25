package main.java.in.spotknack.s03;

/**
 * This program demonstrates various control structures in Java,
 * including conditional statements, loops, and jump statements.
 * Each function corresponds to a concept from the presentation to make it easy to follow.
 */
public class ControlStructures {

    /**
     * Demonstrates the use of a simple if-else statement.
     * @param score The student's score.
     */
    public void demonstrateIfElse(int score) {
        System.out.println("\n--- Demonstrating if-else ---");
        char grade;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'F';
        }
        System.out.println("A score of " + score + " gets a grade of " + grade);
    }

    /**
     * Demonstrates the use of a switch statement.
     * @param dayOfWeek An integer representing the day (1-7).
     */
    public void demonstrateSwitch(int dayOfWeek) {
        System.out.println("\n--- Demonstrating switch ---");
        String dayName;
        switch (dayOfWeek) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }
        System.out.println("The day corresponding to " + dayOfWeek + " is " + dayName);
    }

    /**
     * Demonstrates a simple for loop.
     */
    public void demonstrateForLoop() {
        System.out.println("\n--- Demonstrating for loop ---");
        System.out.println("Counting from 0 to 4:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Count: " + i);
        }
    }

    /**
     * Demonstrates a while loop.
     */
    public void demonstrateWhileLoop() {
        System.out.println("\n--- Demonstrating while loop ---");
        int countdown = 3;
        while (countdown > 0) {
            System.out.println("T-minus " + countdown);
            countdown--;
        }
        System.out.println("Lift off!");
    }

    /**
     * Demonstrates a do-while loop.
     */
    public void demonstrateDoWhileLoop() {
        System.out.println("\n--- Demonstrating do-while loop ---");
        int count = 0;
        do {
            System.out.println("This will run at least once. Current count: " + count);
            count++;
        } while (count < 0);
    }

    /**
     * Demonstrates the use of break and continue in a loop.
     */
    public void demonstrateBreakAndContinue() {
        System.out.println("\n--- Demonstrating break and continue ---");

        System.out.println("Loop with 'break' (stops at 5):");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // Exits the loop completely
            }
            System.out.println("i is " + i);
        }

        System.out.println("\nLoop with 'continue' (skips 5):");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; // Skips to the next iteration
            }
            System.out.println("i is " + i);
        }
    }

    /**
     * Demonstrates nested loops to create a pattern.
     */
    public void demonstrateNestedLoops() {
        System.out.println("\n--- Demonstrating nested loops ---");
        System.out.println("Creating a 4x4 box of asterisks:");
        // The outer loop handles the rows
        for (int i = 0; i < 4; i++) {
            // The inner loop handles the columns
            for (int j = 0; j < 4; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    /**
     * The main method to run all the demonstrations.
     */
    public static void main(String[] args) {
        ControlStructures demo = new ControlStructures();

        demo.demonstrateIfElse(85);
        demo.demonstrateIfElse(95);

        demo.demonstrateSwitch(3);
        demo.demonstrateSwitch(8);

        demo.demonstrateForLoop();

        demo.demonstrateWhileLoop();

        demo.demonstrateDoWhileLoop();

        demo.demonstrateBreakAndContinue();

        demo.demonstrateNestedLoops();
    }
}
