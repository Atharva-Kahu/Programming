package Arrays;

public class KadaneAlgorithm {
    public static void main(String[] args) {
        int arr1[] = {-2,1,-3,4,-1,2,1,-5,4};

        int sub = Kadane1(arr1);
        System.out.println(sub);

    }


    //Brute Force
    private static int Kadane1(int[] arr1) {
        int n = arr1.length;
        int maxsum = Integer.MIN_VALUE;

        for (int i=0; i<n;i++){
            for(int j = i;j<n;j++){
                int tempsum = 0;
                for(int k=i; k<=j;k++){
                    tempsum += arr1[k];
                }
                maxsum = Math.max(maxsum, tempsum);
            }
        }
        return maxsum;
    }    
}
