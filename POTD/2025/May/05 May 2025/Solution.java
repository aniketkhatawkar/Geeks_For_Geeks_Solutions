// User function Template for Java
class Solution {
    public int findTarget(int arr[], int target) {
        // code here
        int n=arr.length;
        int l=0;
        int r=n-1;
        
        while(l<=r){
            int mid=(l+r)>>1;
            
            if(arr[mid]==target){
                return mid;
            }
            if(mid<r && arr[mid+1]==target){
                return mid+1;
            }
            
            if(mid>l && arr[mid-1]==target){
                return mid-1;
            }
            
            if(arr[mid]<target){
                l=mid+2;
            }else {
                r=mid-2;
            }
        }
        
        return -1;
    }
}