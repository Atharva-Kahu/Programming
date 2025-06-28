package BinarySearch;

public class LastOccurenceArray {
    public static void main(String[] args) {
        int arr1[] = {3,4,13,13,13,20,40};
        int target  = 13;

        int ans1 = solution1(arr1,target);
        System.out.println("Last Occurence Found at: " + ans1);
        int ans2 = solution2(arr1,target);
        System.out.println("Last Occurence Found at: " + ans2);
        
    }
    // Brute Force -- Running loop backwards
    private static int solution1(int[] arr1, int target) {
        int n = arr1.length;
        int ans = -1;

        for (int i= n-1; i>=0;i--){
            if(arr1[i] == target){
                ans = i;
                return ans;
            }

        }
        return ans;
    }
    // Binary Search Approach
    private static int solution2(int[] arr1, int target) {
        int ans = -1;
        int n = arr1.length;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (low + high)/2;
            if(arr1[mid] == target){
                ans = mid;
                low = mid + 1;
            }
            else if(arr1[mid]>target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
    
}
