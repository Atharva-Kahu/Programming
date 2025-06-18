public class LeftRotateArray {

    public static void main(String[] args) {
        int arr1[] = {1,3,4,5,6,2};
        int n = arr1.length;

        LeftRotate1(arr1,n);
    }

    static void LeftRotate1(int[] arr, int n) {
        int temp = arr[0];
        for (int i = 0; i<n -1 ; i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;

        for (int i = 0; i < n; i++) {
        System.out.print(arr[i]+" ");
        }
    }
    
}
