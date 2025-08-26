package BS_ON_Answers;

import java.util.Arrays;

public class PaintersPartition2 {
    public boolean isPossible(int[] arr,int k,int time){
        int painter = 1,totalTime = 0;
        for(int i=0;i<arr.length;i++){
            totalTime += arr[i];
            if(totalTime > time){
                painter++;
                totalTime = arr[i];
            }
            if(painter > k)
              return false;
        }
        return true;
    }
    
    public int minTime(int[] arr, int k) {
        // code here
        int left = Arrays.stream(arr).max().getAsInt();
        int right = Arrays.stream(arr).sum();
        int res = -1;
        
        while(left<=right){
            int mid = left + (right-left)/2;
            if(isPossible(arr,k,mid)){
                res = mid;
                right = mid-1;
            }else{
                left = mid + 1;
            }
        }
        return res;
    }
    
}
