package BS_ON_Answers;

import java.util.Arrays;

//Same type as Koko Eating  Bananas
public class FindSmallestDivisor {
    public boolean isPossible(int[] nums,int threshold,int k){
        long sum = 0;
        for(int num:nums){
            sum += num/k;
            if(num%k!=0)
               sum++; 
        }
        
        return sum <= threshold;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int right = Arrays.stream(nums).max().getAsInt();
        int ans = right;
 
        
        while(left<=right){
            int mid = left + (right - left)/2;
            if(isPossible(nums,threshold,mid)){
                ans = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return ans;
    }
}
