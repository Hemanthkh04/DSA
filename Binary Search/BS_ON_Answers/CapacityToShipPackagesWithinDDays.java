package BS_ON_Answers;

import java.util.Arrays;

public class CapacityToShipPackagesWithinDDays {
    public boolean isPossible(int[] weights,int days,int cap){
        int total = 0,count = 1;
        for(int weight:weights){
               if(total + weight > cap){
                  count++;
                  total = weight;
               }else{
                total += weight;
               }
        }
        return count <= days;
    }


    public int shipWithinDays(int[] weights, int days) {
        int left = Arrays.stream(weights).max().getAsInt();
        int right = Arrays.stream(weights).sum();
        int ans = -1;

        while(left<=right){
            int mid = left + (right - left)/2;
            if(isPossible(weights,days,mid)){
                ans = mid;
                right = mid - 1;
            }else{ 
                left = mid + 1;
            }
        }

        return ans;
    }
}
