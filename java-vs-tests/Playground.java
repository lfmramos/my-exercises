import java.util.Arrays;

import io.codeforall.bootcamp.exercise.Ai;

public class Playground {

    public static void main(String[] args) {
        
        Ai ai = new Ai("29/09/2024", "Luis Ramos");

        // Test doubleArray
        int[] array = {1, 2, 3, 4, 5};
        int[] doubledArray = ai.doubleArray(array);
        System.out.println("Doubled array: " + Arrays.toString(doubledArray));

        // Test factorialIterative
        System.out.println("Factorial (iterative): " + ai.factorialIterative(5));

        // Test factorialRecursive
        System.out.println("Factorial (recursive): " + ai.factorialRecursive(5));

        // Test palindromeReplace
        String inpuString = "race car level radar";
        System.out.println("Palindrome replaced: " + ai.palindromeReplace(inpuString));

        // Test emailValidator
        System.out.println("Email validator regex: " + ai.emailValidator());
    }
}