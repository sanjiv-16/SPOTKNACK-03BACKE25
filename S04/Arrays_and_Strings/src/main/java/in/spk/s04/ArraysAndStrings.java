package main.java.in.spk.s04;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysAndStrings {

    public static void main(String[] args) {
        ArraysAndStrings explainer = new ArraysAndStrings();

        System.out.println("\n--- 1. 1D Arrays (One-Dimensional Arrays) ---\n");
        explainer.demonstrateOneDArray();
        System.out.println("\n" + "-".repeat(80) + "\n");

        System.out.println("--- 2. 2D Arrays (Two-Dimensional Arrays) ---\n");
        explainer.demonstrateTwoDArray();
        System.out.println("\n" + "-".repeat(80) + "\n");

        System.out.println("--- 3. Array Utility Methods (java.util.Arrays) ---\n");
        explainer.demonstrateArrayMethods();
        System.out.println("\n" + "-".repeat(80) + "\n");

        System.out.println("--- 4. String Operations ---\n");
        explainer.demonstrateStringOperations();
        System.out.println("\n" + "-".repeat(80) + "\n");

        System.out.println("--- 5. String Immutability ---\n");
        explainer.explainImmutability();
        System.out.println("\n" + "-".repeat(80) + "\n");

        System.out.println("--- 6. StringBuilder vs. StringBuffer ---\n");
        explainer.demonstrateStringBuilderAndBuffer();
        System.out.println("\n" + "=".repeat(80));




    }

    /**
     * Demonstrates the creation, initialization, and iteration of a 1D array.
     * 1,2,3,4,5
     * 0,1,2,3,4
     */
    private void demonstrateOneDArray() {
        int[] scores = new int[4];

        scores[0] = 85;
        scores[1] = 92;
        scores[2] = 78;
        scores[3] = 95;

        System.out.println("Array 'scores' created with size 4. Accessing index 1: " + scores[1]);
        String[] fruits = {"Apple", "Banana", "Cherry", "Date"};
        System.out.println("Array 'fruits' created. Size: " + fruits.length);

        System.out.println("\nIterating 'fruits' (Standard For Loop):");
        for (int i = 0; i < fruits.length-1; i++) {
            System.out.println("Index " + i + ": " + fruits[i]);
        }

        System.out.println("\nIterating 'scores' (Enhanced For Loop):");
        int sum = 0;
        for (int score : scores) {
            System.out.print(score + " ");
            sum += score;
        }
        System.out.println("\nTotal Sum: " + sum);
    }

    /**
     * Demonstrates the creation, initialization, and iteration of a 2D array (matrix).
     *                      j=0 j=1 j=2
     *                 i=0 {10, 20, 30},
     *                 i=1 {40, 50, 60},
     *                 i=2 {70, 80, 90}
     */
    private void demonstrateTwoDArray() {
        int[][] matrix = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };


        System.out.println("2D Array dimensions: " + matrix.length + " rows x " + matrix[0].length + " columns");
        System.out.println("Accessing element at [0][1]: " + matrix[0][1]);

        System.out.println("\nMatrix elements:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nJagged Array Example:");
        int[][] jaggedArray = {
                {1, 2},
                {3, 4, 5, 6},
                {7}
        };
        System.out.println("Row 1 length: " + jaggedArray[1].length);
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + "\t");
            }
            System.out.println();
        }
    }

    /**
     * Demonstrates useful utility methods from the java.util.Arrays class.
     */
    private void demonstrateArrayMethods() {
        int[] numbers = {5, 2, 8, 1, 9};
        System.out.println("Original Array: " + Arrays.toString(numbers));

        // 1. Sort
        Arrays.sort(numbers);
        System.out.println("1. Sorted: " + Arrays.toString(numbers));

        // 2. Binary Search (must be sorted)
        int searchResult = Arrays.binarySearch(numbers, 8);
        System.out.println("2. Index of 8: " + searchResult);

        // 3. Equals
        int[] numbersCopy = {1, 2, 5, 8, 9};
        System.out.println("3. Arrays equal? " + Arrays.equals(numbers, numbersCopy));

        // 4. Copy Of
        int[] partialCopy = Arrays.copyOf(numbers, 3);
        System.out.println("4. Partial Copy (length 3): " + Arrays.toString(partialCopy));

        // 5. Fill
        int[] filledArray = new int[3];
        Arrays.fill(filledArray, 77);
        System.out.println("5. Array Filled with 77: " + Arrays.toString(filledArray));
    }

    /**
     * Demonstrates common and important String manipulation operations.
     */
    private void demonstrateStringOperations() {
        String s1 = "  Java Programming ";
        String s2 = "is Awesome";

        System.out.println("Initial string s1: '" + s1 + "'");

        // 1. length()
        System.out.println("1. Length: " + s1.length());

        // 2. trim()
        String s1Trimmed = s1.trim();
        System.out.println("2. Trimmed: '" + s1Trimmed + "'");

        // 3. concat()
        String combined = s1Trimmed.concat(" and ").concat(s2);
        System.out.println("3. Concatenated: " + combined);

        // 4. substring()
        System.out.println("4. Substring (5, 16): " + combined.substring(5, 16));

        // 5. toUpperCase()
        System.out.println("5. Uppercase: " + combined.toUpperCase());

        // 6. charAt(index)
        System.out.println("6. Char at index 3: " + combined.charAt(3));

        // 7. indexOf(string)
        System.out.println("7. Index of 'Program': " + combined.indexOf("Program"));

        // 8. replace()
        System.out.println("8. Replace 'o' with '0': " + combined.replace('o', '0'));

        // 9. startsWith()
        System.out.println("9. Starts with 'Java'? " + combined.startsWith("Java"));

        // 10. split(regex)
        String colors = "Red;Green,Blue,Yellow";
        String[] colorArray = colors.split(";");
        System.out.println("10. Split into array: " + Arrays.toString(colorArray));
    }

    /**
     * Explains the concept of String immutability in Java.
     */
    private void explainImmutability() {

        String original = "Hello";
        System.out.println("1. Original String: '" + original + "'");
        System.out.println("   Hash Code Before: " + System.identityHashCode(original));

        original = original.concat(" World");
        System.out.println("2. After Concatenation: '" + original + "'");
        System.out.println("   Hash Code After:  " + System.identityHashCode(original));

        System.out.println("-> The Hash Codes are DIFFERENT, proving a NEW object was created.");
    }

    /**
     * Demonstrates and contrasts StringBuilder and StringBuffer.
     */
    private void demonstrateStringBuilderAndBuffer() {

        // --- 1. StringBuilder (Faster, Non-synchronized) ---
        System.out.println("\n[A] StringBuilder (Single-Threaded Use)");
        StringBuilder sb = new StringBuilder("Start");
        System.out.println("Hash Code Before: " + System.identityHashCode(sb));

        sb.append(" and ").insert(0, "NEW ").delete(4, 9);
        System.out.println("Modified value: " + sb);
        System.out.println("Hash Code After:  " + System.identityHashCode(sb));

        System.out.println("-> Hash Code is the SAME (MUTABLE).");

        // --- 2. StringBuffer (Slower, Synchronized / Thread-safe) ---
        System.out.println("\n[B] StringBuffer (Multi-Threaded Use)");
        StringBuffer sbf = new StringBuffer("Initial");
        sbf.reverse();
        System.out.println("Reversed value: " + sbf);

          }
}
