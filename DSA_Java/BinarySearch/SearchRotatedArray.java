package BinarySearch;

public class SearchRotatedArray {
    public static void main(String[] args) {
        int arr1[] = {4,5,6,7,0,1,2,3};
        int target = 0;

        int ans = SearchRotate(arr1,target);
        System.out.println(ans);
    }

    private static int SearchRotate(int[] arr1, int target) {
        int ans = -1;
        int n = arr1.length;
        int low = 0;
        int high = n - 1;

        while (low<=high) {
            int mid = (low + high) / 2;
            if (arr1[mid] == target){
                ans = mid;
                return ans;
            }
            else if(arr1[low] <= target && target <= arr1[mid]){
                high = mid - 1;
            }
            else if(arr1[high] >= target && target >= arr1[mid]) {
                low = mid + 1;

            }
            
        }
        return ans;
    }
    
}
