// User function Template for Java

class Solution {
    public int findMissing(int[] arr) {
        // code here
        int d=arr[1]-arr[0];
        
        for(int i=1;i<arr.length;i++){
            
            if(arr[i]-arr[i-1]!=d){
                return arr[i-1]+d;
            }
        }
        
        return arr[arr.length-1]+d;
    }
}
