class Solution {
    long findNth(long n) {
        // code here
        long res = 0;
        int i = 0;
        
        while(n>0) {
            res += (n % 9) * (Math.pow(10, i++));
            n/=9;
        }
        
        return res;
    }
}