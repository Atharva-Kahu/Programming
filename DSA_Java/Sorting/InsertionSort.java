package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int arr1[] = {13,46,24,52,20,9};

        int sorted[] = Insertion(arr1); 
        for (int i = 0; i < sorted.length; i++) {
        System.out.print(sorted[i] + " ");
    }

    
}

    private static int[] Insertion(int[] arr1) {
        int n =arr1.length;
        for(int i=0;i<+n;i++){
            int j = i;
            while(j>0 && arr1[j-1]>arr1[j]){
                int temp = arr1[j];
                arr1[j] = arr1[j-1];
                arr1[j-1] = temp;
                j--;
            }
        }
        return arr1;
    }
}
