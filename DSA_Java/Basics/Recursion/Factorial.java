package Basics.Recursion;

public class Factorial {
    static int factorial(int n) {
        // Base Condition.
        if (n == 0) return 1;
        
        // Recursive call to calculate factorial.
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        // Here, let's take the value of n to be 5.
        int n = 6;
        int result = factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }
    
}
