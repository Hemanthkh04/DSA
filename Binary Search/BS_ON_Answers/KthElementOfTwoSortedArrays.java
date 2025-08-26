package BS_ON_Answers;

public class KthElementOfTwoSortedArrays {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int count = 0;
        int i = 0,j = 0;
        int ele = -1;
        int n1 = a.length,n2 = b.length;
        
        while(i<n1 && j<n2){
            if(a[i]<b[j]){
                if(count == k-1) ele = a[i];
                i++;
                count++;
            }else{
                if(count == k-1) ele = b[j];
                j++;
                count++;
            }
        }
        
        while(i<n1){
            if(count == k-1) ele = a[i];
            i++;
            count++;
        }
        
        while(j<n2){
            if(count == k-1) ele =  b[j];
            j++;
            count++;
        }
        
        return ele;
    }
    
}
