package DSA_Java.Arrays;

public class RemoveDuplicates {
    
    public static void main(String[] args) {
        int arr1[] = {1,1,2,3,3,3,4,4,5,5,7};
        int n = arr1.length;
        int arr2[] = Duplicates(arr1,n);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
    private static int[] Duplicates(int[] arr1, int n) {
        int i = 0;
        for(int j=1; j<n; j++){
            if(arr1[j] != arr1[i]){
                arr1[i+1] = arr1[j];
                i+=1;

            }          
        }
        return arr1;
    }
}
