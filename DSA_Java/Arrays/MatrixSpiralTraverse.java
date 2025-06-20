import java.util.ArrayList;
import java.util.List;

public class MatrixSpiralTraverse {
    public static void main(String[] args) {
        int mat[][] = { { 1, 2, 3, 4 },
                        { 5, 6, 7, 8 },
		                { 9, 10, 11, 12 },
	                    { 13, 14, 15, 16 } };
        List<Integer> trav  = traversed(mat);
        for(int i = 0;i<trav.size();i++){
            System.out.print(trav.get(i) + " ");
        }

    }

    static List<Integer> traversed(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        List<Integer> temp = new ArrayList<>();
        int top = 0;
        int right = m - 1;
        int bottom = n - 1;
        int left = 0;

        while (top<=bottom && left<=right) {
            for(int i= left; i<= right;i++){
                temp.add(mat[top][i]);

            }
            top++;

            for(int i= top; i<=bottom;i++){
                temp.add(mat[i][right]);
            }
            right--;

            if(top<=bottom){
                for(int i=right; i>=left;i--){
                temp.add(mat[bottom][i]);
                }
            bottom--;
            }
            if(left<=right){
                for(int i=bottom; i>=top;i--){
                    temp.add(mat[i][left]);

                }
                left++;
            } 
        }
        return temp;
    }
}
