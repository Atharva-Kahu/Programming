package Arrays;

public class SetMatrixZero {
    public static void main(String[] args) {
        
        int[][] matrix = {
                        {1, 1, 1},
                        {1, 0, 1},
                        {1, 1, 1}};
        
        int n = matrix.length; 
        int m = matrix[0].length;
        int[] row = new int[n];
        int[] col = new int[m];
        for(int i=0; i<n ; i++){
            for(int j =0; j<m; j++){
                if(matrix[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for(int i=0; i<n ; i++){
            for(int j =0; j<m; j++){
                if(row[i] == 1 || col[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }


        
}
}
}




//Brute Force
// int[][] arr2 = new int[n][m];
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 arr2[i][j] = matrix[i][j];
//             }
//         }

//         for(int i=0; i<n ; i++){
//             for(int j =0; j<m; j++){
//                 if(matrix[i][j] == 0){
//                     for(int k=0;k<m;k++){
//                         arr2[i][k] = 0;

//                     }

//                     for(int l = 0; l<n; l++){
//                         arr2[l][j] = 0;
//                     }
//                     System.out.println(i);
//                     System.out.println(j);
//                 }
//             }
//         }

//         for (int i = 0; i < arr2.length; i++) {
//             for (int j = 0; j < arr2[i].length; j++) {
//                 System.out.print(arr2[i][j] + " ");
//             }
    
// }