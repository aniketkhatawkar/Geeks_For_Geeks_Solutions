class Solution {
    public int findUnique(int[] arr) {
        // code here
        int n = arr.length;
        int ans = 0;
        
        for(int i = 0; i < n; i++) {
            ans ^= arr[i];
        }
        
        return ans;
    }
}