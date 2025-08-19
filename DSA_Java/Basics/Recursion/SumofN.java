package Basics.Recursion;

public class SumofN {
    static int sum(int i, int n) {
        // Base Condition.
        if (i > n) return 0;
        
        // Recursive call to get the sum of the next number.
        return i + sum(i + 1, n);
    }

    public static void main(String[] args) {
        // Here, let's take the value of n to be 5.
        int n = 5;
        int result = sum(1, n);
        System.out.println("Sum of first " + n + " natural numbers is: " + result);
    }
    
}
