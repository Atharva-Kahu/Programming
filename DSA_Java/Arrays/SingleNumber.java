package Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        int arr1[] = {1,3,2,2,4,7,4,3,5,1};
        int n = arr1.length;
        int sin = single(arr1,n);
        System.out.println(sin);
    }

    static int single(int[] arr1, int n) {
        for (int i=0; i<n;i++){
            int tempcount = 0;
            for (int j=0;j<n;j++){
                if (arr1[i] == arr1[j]){
                    tempcount +=1;
                }
                
            }
            if(tempcount == 1){
                return arr1[i];
            }
        }
        return 0;
    }
    
}
