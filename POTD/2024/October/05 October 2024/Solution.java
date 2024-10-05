class Solution {
    public long findSmallest(int[] arr) {
        // Your code goes here
        int ans =1;
        
        for(int i : arr) {
            if(i>ans) {
                return ans;
            }else{
                ans+=i;
            }
        }
        
        return ans;
    }
}