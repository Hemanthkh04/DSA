public class FirstLastOccurance {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1,-1};
        int left = binarySearch(nums,target,true); //First Occurance
        int right  = binarySearch(nums,target,false); //Last Occurance
        res[0] = left;
        res[1] = right;
        return res;
    }

    public int binarySearch(int[] nums,int target,boolean isSearchingLeft){
        int low = 0,high = nums.length-1;
        int ans = -1;

        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                ans = mid;
                if(isSearchingLeft){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else if(nums[mid]<target){
                low = mid+1;
            }else{
                high = mid-1;            }
        }
        return ans;
    }
}
