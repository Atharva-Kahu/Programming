package BinarySearch;

public class LowerBound {
    public static void main(String[] args) {
        int arr1[] = {3,5,9,9,10,15,19};
        int target = 9;

        System.out.println(LBound(arr1,target));

    }

    private static int LBound(int[] arr1, int target) {
        int n = arr1.length;
        int low = 0;
        int high = n-1;
        int ans = n;
        while(low<=high){
            int mid = (low + high)/2;
            if (arr1[mid] >= target){
                ans =  mid;
                high = mid-1;
            } 
            else {
                low = mid +1;
            }
        }
        return ans;
    }
    
}
