public class SqrtOfNumber {
    public int mySqrt(int x) {
        int low =0,high=x;
        int res = 0;

        while(low<=high){
            int mid = low + (high-low)/2;
            long sq = mid*mid;
            if(sq == x){
                return mid;
            }else if(sq<x){
                low = mid+1;
                res = mid;
            }else{
                high = mid-1;
            }
        }
        return res;
    } 
}
