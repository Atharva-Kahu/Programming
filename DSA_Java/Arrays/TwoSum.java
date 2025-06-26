package DSA_Java.Arrays;

import java.lang.classfile.TypeAnnotation.TargetInfo;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int arr1[] = {2,6,5,8,11};
        int target = 14;

        System.out.println(TSum(arr1,target));

    }

    private static String TSum(int[] arr1, int target) {
        int n = arr1.length;
        Arrays.sort(arr1);
        int left = 0, right = n - 1;
        while (left < right) {
            int sum = arr1[left] + arr1[right];
            if (sum == target) {
                return "Yes";
            } else if (sum < target) left++;
            else right--;
        }
        return "NO";
    }
    
}
