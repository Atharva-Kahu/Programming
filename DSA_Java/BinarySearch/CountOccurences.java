package DSA_Java.BinarySearch;

public class CountOccurences {
    public static void main(String[] args) {
        int arr1[] = {3,4,13,13,13,20,20,40};
        int target  = 20;

        //int ans1 = solution1(arr1,target);
        //System.out.println("Occurence Count is: " + ans1);

        int LOcc = LowerOccurence(arr1,target);
        int HOcc = HigherOccurence(arr1,target);

        int total = HOcc - LOcc + 1;

        System.out.println("Total Occurences are: " + total);
    }


    //Brute force Approach
    static int solution1(int[] arr1, int target) {
        int ans =0;
        int n = arr1.length;
        for(int i = 0; i<n; i++){
            if (arr1[i] == target) {
                ans += 1;                
            }
        }
        return ans;
    }

    //Binary Search
     static int LowerOccurence(int[] arr1, int target) {
        int ans = 0;
        int n = arr1.length;
        int low = 0;
        int high = n - 1;

        while (low<=high) {
            int mid = (low + high)/2;
            if(arr1[mid] == target){
                ans = mid;
                high = mid -1;
            }
            else if(arr1[mid] >= target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
            
        }
        return ans;
    }

    static int HigherOccurence(int[] arr1, int target) {
        int ans = 0;
        int n = arr1.length;
        int low = 0;
        int high = n - 1;

        while (low<=high) {
            int mid = (low + high)/2;
            if(arr1[mid] == target){
                ans = mid;
                low = mid + 1;
            }
            else if(arr1[mid] >= target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
            
        }
        return ans;
    }
    
}
