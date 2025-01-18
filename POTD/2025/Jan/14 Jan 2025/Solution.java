class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        int n=arr.length;
        int leftPrefix[]=new int[n];
        int rightPrefix[]=new int[n];
        
        leftPrefix[0]=arr[0];
        rightPrefix[n-1]=arr[n-1];
        
        for(int i=1;i<n;i++) 
            leftPrefix[i]=leftPrefix[i-1]+arr[i];
            
        for(int i=n-2;i>=0;i--) 
            rightPrefix[i]=rightPrefix[i+1]+arr[i];
            
        for(int i=0;i<n;i++){
            if(leftPrefix[i]==rightPrefix[i]) 
                return i;
        }
        
        return -1;
    }
}