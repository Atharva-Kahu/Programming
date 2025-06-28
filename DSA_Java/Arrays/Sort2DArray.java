package Arrays;

public class Sort2DArray {
    public static void main(String[] args) {
        int[][] arr1 = {
                        {12, 34, 7},
                        {45, 22, 9},
                        {3, 18, 50}};
        int target = 8;
        SearchBF(arr1,target);
    }


// Brute Force Approach
    private static void SearchBF(int[][] arr1, int target) {
        int n = arr1.length;
        int m = arr1[0].length;
        int a = -1;
        int b = -1;
        for(int i = 0; i<n;i++){
            for(int j=0;j<m;j++){
                if(arr1[i][j] == target){
                    a = i;
                    b = j;
                }
            }         
        }
        if (a>-1 && b>-1){
                System.out.println("Found at: [" + a +","+b+"]");
                }
        else{
                System.out.println("Not Found");
                }
    }
    
}
