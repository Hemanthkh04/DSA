package BS_ON_Answers;

import java.util.Arrays;

public class KokoEatingBananas {
    public boolean isPossible(int[] piles,int h,int k){
        long sum = 0;
        for(int pile:piles){
            sum += pile/k;
            if(pile%k!=0) //ceil
               sum++; 
        }
        
        return sum <= h;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Arrays.stream(piles).max().getAsInt();
        int ans = right;
 
        
        while(left<=right){
            int mid = left + (right - left)/2;
            if(isPossible(piles,h,mid)){
                ans = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }

        return ans;  
    }
}
