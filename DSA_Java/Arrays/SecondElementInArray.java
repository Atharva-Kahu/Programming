package Arrays;

public class SecondElementInArray {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,7,7,5}, n = 7;
        System.out.println("Second largest element is: "+ CheckSecondLargest(arr1,n));
        System.out.println("Second Smallest element is: "+ CheckSecondSmallest(arr1,n));
        
    }


    static int CheckSecondLargest(int[] arr,int n) {
        int largest = arr[0];
        int sLargest = -1;
        for (int i=0; i<n; i++){
            if (arr[i]>largest){
                largest = arr[i];
            }
        }

        for (int i = 0;i<n;i++){
            if (arr[i]>sLargest && arr[i] != largest){
                sLargest = arr[i];
            }
        }
        return sLargest;
    }

    static int CheckSecondSmallest(int[] arr,int n) {
        int largest = arr[0];
        int sSmallest = Integer.MAX_VALUE;
        
        for (int i=0; i<n; i++){
            if (arr[i]>largest){
                largest = arr[i];
            }
        }

        for (int i = 0;i<n;i++){
            if (arr[i]<sSmallest && arr[i] != largest){
                sSmallest = arr[i];
            }
        }
        return sSmallest;
    }

    
    
}
