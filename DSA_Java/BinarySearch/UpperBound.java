package BinarySearch;

public class UpperBound {
    public static void main(String[] args) {
        int arr1[] = {3,5,9,9,10,15,19};
        int target = 9;

        System.out.println(UBound(arr1,target));
    }

    private static int UBound(int[] arr1, int target) {
        int n = arr1.length;
        int ans =n;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (low + high)/2;
            if(arr1[mid]<=target){
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }
    
}
