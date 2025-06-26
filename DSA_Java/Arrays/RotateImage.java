package DSA_Java.Arrays;



public class RotateImage {
    public static void main(String[] args) {
        int[][] arr1 = {
                        {12, 34, 7},
                        {45, 22, 9},
                        {3, 18, 50}};
        ;
        int[][] ans = rotate(arr1);
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < ans.length; j++) {
                    System.out.print(ans[i][j] + " ");
                }}



    }

    // Brute Force

    private static int[][] rotate(int[][] arr1) {
        int n = arr1.length;
        int rotated[][] = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0; j<n;j++){
                rotated[j][n-1-i] = arr1[i][j];
            }
        }
        return rotated;
    }
    
}
