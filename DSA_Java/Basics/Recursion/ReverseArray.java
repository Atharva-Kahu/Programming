package Basics.Recursion;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int r = arr.length - 1;
        int l = 0; 

        int[] arr2 = Reverse(arr,r,l);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

    private static int[] Reverse(int[] arr,int r,int l) {
        if(l>=r) {
            return arr;
            
        }
        int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            return Reverse(arr, r - 1, l + 1);

        // TODO Auto-generated method stub
    }
    
}
