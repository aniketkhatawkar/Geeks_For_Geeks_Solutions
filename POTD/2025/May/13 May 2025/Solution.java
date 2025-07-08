class Solution {
    public int nCr(int n, int r) {
        // code here
        if (r==1) 
            return n;
            
        if (r==0) 
            return 1;
             
        if(n<r) 
            return 0;
            
        if (n==r) 
            return 1;
            
        if (n-r<r) 
            r=n-r;
            
        long number =n;
        long result=1;
        
        for(long i=1;i<=r;i++){
            result=((long) result*(number))/i;
            number =number -1;
        }
             
        return (int)result;
    }
}