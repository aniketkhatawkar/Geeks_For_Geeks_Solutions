// User function Template for Java

class Solution {
    public int findMaximum(int[] arr) {
        // code here
        int n=arr.length,l=0,h=n-1,res=-1;
        
        while(l<=h) {
            int mid=(l+h)/2;
            
            if(arr[mid]>arr[mid+1]) {
                res=arr[mid];
                h=mid-1;
            }
            else {
                l=mid+1;
            }
        }
        
        return res;
    }
}