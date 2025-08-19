package Arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int arr1[] = {2,2,1,1,1,2,2};
        System.out.println("Majority Element BF: "+ FindMajority_BF(arr1));
        System.out.println("Majority Element BA: "+ FindMajority_BA(arr1));
        System.out.println("Majority Element OA: "+ FindMajority_OA(arr1));
    }
    
    

    //BruteForce
    private static int FindMajority_BF(int[] arr1) {
        int n = arr1.length;
        for(int i=0;i<n;i++){
            int cnt = 0;
            for(int j=0; j<n;j++){
                if (arr1[i] == arr1[j]){
                    cnt += 1;
                }                
            }
            if (cnt > n/2){
                    return arr1[i];
                }
        }
        return -1;
    }

    //Better Approach
    private static int FindMajority_BA(int[] arr1) {
        //Using Hashmap 
        int n = arr1.length;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        // Storing elements with occurence
        for(int i=0; i<n; i++){
            int v = mpp.getOrDefault(arr1[i],0);
            mpp.put(arr1[i], v+1);
        }

        for(Map.Entry<Integer, Integer> it : mpp.entrySet()){
            if(it.getValue() > n/2){
                return it.getKey();
            }
        }
        return -1;
    }

    //Optimal Approach
    private static int FindMajority_OA(int[] arr1) {
        int n = arr1.length;
        int j=0;
        int cnt = 1;

        for(int i=1;i<n;i++){
            if(arr1[j] == arr1[i]){
                cnt +=1;
            }
            if(arr1[j] != arr1[i]){
                cnt -=1;
            }
            if(cnt == 0){
                j = i;
                cnt = 1;
            }

        }
        if(cnt>0){
            return arr1[j];
        }

        return -1;
    }
}
