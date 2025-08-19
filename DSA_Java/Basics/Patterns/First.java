package Basics.Patterns;

public class First {
    public static void main(String[] args) {
        int n = 6; // Size of the pattern

        //pattern1(n);
        //pattern2(n);
        //pattern3(n);
        //pattern4(n);
        //pattern5(n);
        //pattern6(n);
        pattern7(n);
        
    }

    private static void pattern7(int n) {
        // TODO Auto-generated method stub
        for (int i = 0; i <= n; i++) {
            for (int j =0; j<n-i-1; j++)
            {
                System.out.print(" ");
            }
            for(int j = 0;j<2*i+1;j++){
                System.out.print("*");
            }
            for (int j =0; j<n-i-1; j++)
            {
                System.out.print(" ");
            }
            
            System.out.println();
        }
    }

    private static void pattern6(int n) {
        // TODO Auto-generated method stub
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    private static void pattern5(int n) {
        // TODO Auto-generated method stub
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern4(int n) {
        // TODO Auto-generated method stub
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    private static void pattern3(int n) {
        // TODO Auto-generated method stub
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    private static void pattern2(int n) {
        // TODO Auto-generated method stub
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }

    private static void pattern1(int n) {
        // TODO Auto-generated method stub
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
