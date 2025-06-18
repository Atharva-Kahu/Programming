public class CheckArraySorted {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5}, n = 5;
        System.out.println("largest element is: "+ CheckArray(arr1,n));
    }

    static boolean CheckArray(int[] arr, int n) {
        for (int i = 0; i<n; i++){
            for (int j = i + 1; j<n;j++){
                if (arr[j] < arr [i]){
                    return false;
                }

            }
        }
        return true;
    }
    
}
