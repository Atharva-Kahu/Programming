package Arrays;

public class FindDuplicates {
    public static void main(String[] args) {
        int arr1[] = {1,3,4,2,2};

        int dup = duplicate1(arr1);
        System.out.println(dup);

        int dup2 = duplicate2(arr1);
        System.out.println(dup2);

    }
    
    //Brute Force
    private static int duplicate1(int[] arr1) {
        int n = arr1.length;
        int ans = -1;
        for(int i = 0; i<n;i++){
            for(int j = i+1; j<n; j++){
                if(arr1[i] == arr1[j]){
                    ans = arr1[i];
                }                
            }
        }
        return ans;
    }

    //Optimal Approach
    private static int duplicate2(int[] arr1) {
        int n = arr1.length;
        int freq[] = new int[n+1];
        for(int i = 0; i<n;i++){
            if(freq[arr1[i]] == 0){
                freq[arr1[i]] +=1;
            }
            else{
                return arr1[i];
            }
        }
        return -1;
    }    
}
