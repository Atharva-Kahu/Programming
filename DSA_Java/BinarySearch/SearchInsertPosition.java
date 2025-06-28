package BinarySearch;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int arr1[] = {3,5,9,9,10,15,19};
        int target = 20;

        int fin = SearchInsert(arr1,target);
        System.out.println(fin);
    }

    static int SearchInsert(int[] arr1, int target) {        
        int n = arr1.length;
        int low = 0;
        int high = n-1;
        int ans = n;
        while (low<=high) {
            int mid = (low + high)/2;
            if (arr1[mid] == target){
                ans = mid;
                return ans;                
            }
            else if(arr1[mid]>= target){
                high = mid - 1;
                ans = mid;
            }
            else if(arr1[mid]<= target){
                low = mid + 1;
            }            
        }
        return ans;        
    }    
}
