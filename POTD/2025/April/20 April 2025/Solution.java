// User function Template for Java
class Solution {
    public int findDuplicate(int[] arr) {
        // code here
        int total=0;
        
        for(int i=0;i<arr.length;i++) {
            total^=arr[i];
            
            if(i>=1){
                total^=i;
            }
        }
        
        return total;
    }
}