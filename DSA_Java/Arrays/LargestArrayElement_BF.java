package DSA_Java.Arrays;

import java.util.*;

public class LargestArrayElement_BF{
    public static void main(String[] args) {
        int arr1[] = {2,5,1,3,0};
        System.out.println("largest element is: "+ sort(arr1));
    }

    static int sort(int[] arr) {
        Arrays.sort(arr);
        // TODO Auto-generated method stub
        return arr[arr.length - 1];
    }
    
}