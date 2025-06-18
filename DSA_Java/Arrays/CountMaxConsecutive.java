public class CountMaxConsecutive {
    public static void main(String[] args) {
        int arr1[] = {0,1,1,0,0,1,1,1,1,0};
        int n = arr1.length;
        System.out.println("Max count is: "+ MaxCount(arr1,n));
    }

    private static int MaxCount(int[] arr, int n) {
        
        int count = 0;
        int max_count = 0;

        for (int i=0; i< n-1; i++){
            if (arr[i]==1){
                count +=1;
                
            }
            else{
                count = 0;
            }

            if (count > max_count){
                    max_count = count;
                }
        }
        return max_count;
    }
    
}
