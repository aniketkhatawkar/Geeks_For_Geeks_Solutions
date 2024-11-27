class Solution {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        // Your code here
        int n=arr.length;
        int hash[]=new int[n+1];
        
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>=1 && arr[i]<=n) {
                 hash[arr[i]-1]++;
            }
        }
        
        for(int i=0;i<hash.length;i++) {
            if(hash[i]==0)
                return i+1;
        }
        
        return n+1;
    }
}