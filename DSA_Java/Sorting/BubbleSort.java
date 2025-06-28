package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
         int arr1[] = {13,46,24,52,20,9};
         int sorted[] = Bubble(arr1); 
            for (int i = 0; i < sorted.length; i++) {
            System.out.print(sorted[i] + " ");
    }
    
}

    private static int[] Bubble(int[] arr1) {

        int n = arr1.length;
        for (int i = n-1;i>=1;i--){
            for(int j = 0; j<=i-1;j++){
                if(arr1[j] >arr1[j+1]){
                    int temp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = temp; 
                }
            }
        }
        return arr1;
    }
}
