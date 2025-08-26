package BS_ON_Answers;

import java.util.Arrays;

public class AggressiveCows {
        public boolean isPossible(int[] stalls,int dist,int cows){
        int cntCows = 1,last = stalls[0];
        for(int i=1;i<stalls.length;i++){
            if(stalls[i]-last >= dist){
                cntCows++;
                last = stalls[i];
            }
            
            if(cntCows >= cows)
               return true;
        }
        return false;
    }
    
    public int aggressiveCows(int[] stalls, int k) {
        // code here
        int min = Arrays.stream(stalls).min().getAsInt();
        int max = Arrays.stream(stalls).max().getAsInt();
        Arrays.sort(stalls);
        
        for(int i=1;i<=(max-min);i++){
            if(!isPossible(stalls,i,k))
                return i-1;
        }
        return max-min;
    }
}
