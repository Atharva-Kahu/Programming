package BinarySearch;

public class BinarySearchBasic {
    public static void main(String[] args) {
        int arr1[] = {3,4,6,7,9,12,16,17};
        int target = 9;
        int n = arr1.length;
        int low = 0;
        int high = n-1;

        System.out.println("Found at: "+ BSIterative(arr1,target,n));
        System.out.println("Found at: "+ BSRecursive(arr1,low,high,target));
        
    }

    static int BSIterative(int[] arr1, int target,int n) {
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (low + high)/2;
            if (arr1[mid] == target){
                return mid;
            }
            else if(arr1[mid]>target){
                high = mid-1;
            } 
            else if(arr1[mid]< target){
                low = mid +1;
            }
        }
        return -1;
    }
    
    

    static int BSRecursive(int[] arr1, int low, int high, int target) {

        if (low>high){
            return -1;
        }
        int mid = (low + high)/2;
        if(arr1[mid] == target){
            return mid;
        }
        else if(arr1[mid]>target){
            return BSRecursive(arr1, low, mid - 1, target);
        }
        else{
            return BSRecursive(arr1, mid + 1, high, target);
        }
    }    
}
