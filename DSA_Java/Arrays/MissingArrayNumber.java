public class MissingArrayNumber {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6,8};
        int n = arr1.length;
        int missing = MissingArray(arr1,n);
        System.out.println(missing);
    }

    private static int MissingArray(int[] arr1, int n) {

        for (int i = 0; i<n-1; i++){
            int mis = 0;
            if(arr1[i+1] - arr1[i] !=1){
                mis = arr1[i] + 1;
                return mis;
                
            }
        }
        return 0;
            
    }
    
}
