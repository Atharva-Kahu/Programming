package Arrays;

public class UnionofArrays {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6};
        int arr2[] = {3,4,6,8,9};
        int union[] = ArrayUnion(arr1,arr2);
    }

    private static int[] ArrayUnion(int[] arr1, int[] arr2) {
        int temp[] = {};
        int n = arr1.length;
        int m = arr2.length;

        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr1[i] == arr2[j]){

                }
            }
        }
        // TODO Auto-generated method stub
        return temp;
    }
    
}
