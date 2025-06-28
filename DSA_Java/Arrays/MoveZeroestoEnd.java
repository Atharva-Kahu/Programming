package Arrays;

public class MoveZeroestoEnd {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,0,0,0,2,0,3};
        int n = arr1.length;
        int ans[] = MoveZero(arr1,n);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("");
    }

    private static int[] MoveZero(int[] arr1, int n) {
        int j = -1;
        for(int i=0;i<n;i++){
            if(arr1[i]==0){
                j = i;
                break;
            }
        }
        if (j == -1){
            return arr1;

        } 
// TODO Auto-generated method stub
        for (int i = j+1; i <n; i++){
            if(arr1[i]!=0){
                int temp = arr1[i];
                arr1[i] = arr1[j];
                arr1[j] = temp;
                j +=1;
            }


        }
        return arr1;

        
    }
    
}
