package BS_ON_Answers;

public class SearchInRotatedSortedArray2 {
    public boolean search(int[] nums, int target) {
        int low = 0,high = nums.length-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                return true;
            }

            //[1,0,1,1,1] => Below condition is for this test case
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low = low + 1;
                high = high - 1;
                continue;
            }

            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target<=nums[mid]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else{
                if(nums[mid]<=target && nums[high]>=target){
                     low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }
        return false;
    }
}
