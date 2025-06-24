package DSA_Java.BinarySearch;

public class FloorCeilArray {
    public static void main(String[] args) {
        int arr1[] = {3,5,9,10,15,19};
        int target = 17;

        int[] fin = FloorCeil(arr1,target);
        System.out.println(fin[0]);
        System.out.println(fin[1]);
    }

    private static int[] FloorCeil(int[] arr1, int target) {
        // TODO Auto-generated method stub
        int n = arr1.length;
        int low = 0;
        int high = n-1;
        int floor = 0;
        int ceil = 0;

        while (low<=high) {
            int mid = (low + high)/2;
            floor = mid;
            ceil = mid + 1;            
            if(arr1[mid] == target){
                floor = mid;
                ceil = mid;
                return new int[]{floor, ceil};
            }
            else if (arr1[mid]>= target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }            
        }
        return new int[]{floor, ceil};
    }
    
}
