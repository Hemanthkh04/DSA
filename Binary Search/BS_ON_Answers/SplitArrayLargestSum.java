package BS_ON_Answers;

import java.util.Arrays;

//Same as Allocate Minimum Pages
public class SplitArrayLargestSum {
    public boolean isPossible(int[] nums,int k,int val){
        int s=1,total=0;
        for(int i=0;i<nums.length;i++){
            total += nums[i];
            if(total > val){
                s++;
                total = nums[i];
            }
            if(s>k)
              return false;
        }
        return true;
    }

    public int splitArray(int[] nums, int k) {
        int left = Arrays.stream(nums).max().getAsInt();
        int right = Arrays.stream(nums).sum();
        int res = -1;

        while(left<=right){
            int mid = left + (right-left)/2;
            if(isPossible(nums,k,mid)){
                res = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return res;
    }
}
