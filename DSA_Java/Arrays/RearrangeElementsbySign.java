package DSA_Java.Arrays;

public class RearrangeElementsbySign {
    public static void main(String[] args) {
        int arr1[] = {1,2,-3,-1,-2,3};

        int ans[] = Rearrange1(arr1);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        

        
    }
    //Optimized
    private static int[] Rearrange1(int[] arr1) {
        int n = arr1.length;
        int ans[] = new int[n]; 
        int p = 0;
        int q = 1;

        for (int i = 0; i < n; i++) {
        if (arr1[i] > 0 && p < n) {
            ans[p] = arr1[i];
            p += 2;
        } else if (arr1[i] < 0 && q < n) {
            ans[q] = arr1[i];
            q += 2;
        }
    }


        return ans;
    }
    
}
