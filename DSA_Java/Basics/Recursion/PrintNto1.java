package Basics.Recursion;

public class PrintNto1 {    
    static void print(int i, int n) {
        // Base Condition.
        if (i < 1) return;
        
        // Print the current number.
        System.out.println(i);
        
        // Recursive call to print the previous number.
        print(i - 1,n);
    }

    public static void main(String[] args) {
        // Here, let's take the value of n to be 5.
        int n = 5;
        print(n,n);
    }
    
}
