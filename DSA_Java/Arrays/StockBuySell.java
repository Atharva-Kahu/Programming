package DSA_Java.Arrays;

public class StockBuySell {
    public static void main(String[] args) {
        int arr1[] = {20,50,10,30};

        int profit = BuySell(arr1);
        System.out.println(profit);

        int profit1 = maxProfit(arr1);
        System.out.println(profit1);
    }
// Brute Force
    static int BuySell(int[] arr1) {
        int n = arr1.length;
        int profit = 0;
        int temp = 0;
        // TODO Auto-generated method stub
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(i<j){
                    temp = arr1[j] - arr1[i];
                    if(temp>profit){
                        profit = temp;
                    }
                    
                }
            }

        }
        return profit;
    }
// Complex    
    static int maxProfit(int[] arr) {
    int maxPro = 0;
    int minPrice = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
        minPrice = Math.min(minPrice, arr[i]);
        maxPro = Math.max(maxPro, arr[i] - minPrice);
    }
    return maxPro;
    }
}
