
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */
public class GuessGame{
    int pick = 0;
    public int guess(int n){
        if(n == pick)
           return 0;
        else if(n>pick)
           return -1;
        else
           return 1;
    }
}

public class GuessNumberHigherOrLower extends GuessGame {
    public int guessNumber(int n) {
        int low = 1,high = n;

        while(true){
            int mid = low + (high-low)/2;
            int val = guess(mid);
            if(val==0){
                return mid;
            }else if(val>0){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }

    }
}
