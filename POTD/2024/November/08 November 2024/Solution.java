import java.util.* ;
import java.io.*; 
public class Solution {

    public static int maxXor(int L, int R) {
        
        // Write your Code here
        int count=L^R;
        int maxcount=1;

        while(count>0){
            maxcount<<=1;
            count>>=1;
        }

        return maxcount-1;
    }
}