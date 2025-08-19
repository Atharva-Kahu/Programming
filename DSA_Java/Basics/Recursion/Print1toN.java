package Basics.Recursion;

public class Print1toN {
    static void print(int i, int n) {
        // Base Condition.
        if (i > n) return;
        
        // Print the current number.
        System.out.println(i);
        
        // Recursive call to print the next number.
        print(i + 1, n);
    }

    public static void main(String[] args) {
        // Here, let's take the value of n to be 5.
        int n = 5;
        print(1, n);
    }
    
}
