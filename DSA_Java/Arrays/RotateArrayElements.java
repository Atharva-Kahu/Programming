package DSA_Java.Arrays;

public class RotateArrayElements {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6,7};
        int n = arr1.length;
        int k = 2;
        String side = "left";
        int pos=0;
        if (side=="left"){
            pos = 0;
        }
        else if (side == "right"){
            pos = -1;

        }

        int fin[] = LeftorRight(arr1,n,k);
        for (int i = 0; i < fin.length; i++) {
            System.out.print(fin[i] + " ");
        }
        System.out.println("");

    }

    static int[] LeftorRight(int[] arr1, int n, int k) {
        int j =0;
        int[] temp = new int[k];

        for (int i = 0; i < k; i++) {
            temp[i] = arr1[i];
        }

        for (int i=j; i<n;i++){
            arr1[i] = arr1[k+1];
            k += 1;
        }

        for (int i=0;i<temp.length;i++){
            int t = n-k;
            arr1[t] = temp[i];
            t+=1;

        }

        return temp;
    }
}
