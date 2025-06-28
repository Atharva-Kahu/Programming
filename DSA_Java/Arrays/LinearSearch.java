package Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take array size input
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        // Declare and take array input
        int[] arr1 = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        

        // Input number to search
        System.out.print("Enter number to search: ");
        int num = sc.nextInt();
        System.out.println("Element is present at: " + LSearch(arr1,n,num));
        sc.close();
    }

    private static int LSearch(int[] arr, int n,int num) {
        int index = 0;
        for (int i=0; i<n;i++){
            if (arr[i] == num){
                index = i;
                
            }

        }
        return index;
    }
}
