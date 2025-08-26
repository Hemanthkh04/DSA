package BS_ON_Answers;

import java.util.Arrays;

public class MinimumDaysToMakeMBouquets {
    public boolean isBlooming(int[] bloomDay,int m , int k , int day){
        
        for(int i=0;i<bloomDay.length;i++){
            int count = 0;

            while(i<bloomDay.length && count<k && bloomDay[i]<=day){
                count++;
                i++;
            }

            if(count == k){
                m--;
                i--;
            }

            if(m<=0)
              return true;   
        }
        return false;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        int left = Arrays.stream(bloomDay).min().getAsInt();
        int right = Arrays.stream(bloomDay).max().getAsInt();
        int ans = -1;

        while(left<=right){
            int mid = left + (right - left)/2;
            if(isBlooming(bloomDay,m,k,mid)){
                ans = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return ans;
    }
}
