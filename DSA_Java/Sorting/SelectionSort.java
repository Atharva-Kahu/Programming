package Sorting;



public class SelectionSort {
    public static void main(String[] args) {
            int arr1[] = {13,46,24,52,20,9};

            int sorted[] = Selection(arr1); 
            for (int i = 0; i < sorted.length; i++) {
            System.out.print(sorted[i] + " ");
        }
    }

    private static int[] Selection(int[] arr1) {
        int n = arr1.length;

        for(int i = 0; i<=n-2;i++){
            int min = i;
            for(int j = i; j<=n-1;j++){
                if(arr1[j]<arr1[min]){
                    min = j;
                }
                int temp = arr1[min];
                arr1[min] = arr1[i];
                arr1[i] = temp;
            }
        }
        return arr1;
    }
    
}
