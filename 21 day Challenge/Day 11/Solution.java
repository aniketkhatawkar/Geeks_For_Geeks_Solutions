class Solution {
    // Returns count buildings that can see sunlight
    public int countBuildings(int[] height) {
        // code here
        int ans=1;
        int curr=height[0];
        int n=height.length;
        
        for(int i=0; i<n; i++){
            if(height[i]>curr){
                curr=height[i];
                ans++;
            }
        }
        
        return ans;
    }
}