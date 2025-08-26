package BS_ON_Answers;

import java.util.Arrays;

//Same type as Aggressive cows
public class AllocateMinimumPages {
    public boolean isAllocationPossible(int[] arr,int k,int pages){
        int n = arr.length; // size of array
        int students = 1;
        long pagesStudent = 0;
        for (int i = 0; i < n; i++) {
            pagesStudent += arr[i];
            if (pagesStudent > pages) {
                students++;
                pagesStudent = arr[i];
            } 
            
            if(students > k)
               return false;
        }
        return true;
    }
    
    public int findPages(int[] arr, int k) {
        // code here
        if(arr.length < k)
           return -1;
           
        int left = Arrays.stream(arr).max().getAsInt();
        int right = Arrays.stream(arr).sum();
        int res = -1;
        
        while(left<=right){
            int mid = left + (right-left)/2;
            if(isAllocationPossible(arr,k,mid)){
                res = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        
        return res;
    }
}
