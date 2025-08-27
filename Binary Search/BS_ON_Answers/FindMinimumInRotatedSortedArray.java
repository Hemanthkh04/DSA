package BS_ON_Answers;

public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        int n=nums.length;

        int ans = Integer.MAX_VALUE;

        int left = 0,right = n-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[left]<=nums[mid]){
                ans = Math.min(ans,nums[left]);
                left = mid+1;
            }
            else{
                ans = Math.min(ans,nums[mid]);
                right = mid-1;
            }
        }
        return ans;
    }
}
