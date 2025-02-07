class Solution {
    int diameter(Node root) {
        // Your code here
        int[]ans = {0};
        helper(root,ans);
        return ans[0];
    }
    
    public int helper(Node root,int[]ans){
        if(root==null)
            return 0;
            
        int left = helper(root.left,ans);
        int right = helper(root.right,ans);
        
        ans[0] = Math.max(ans[0],left+right);
        
        return Math.max(left,right)+1;
    }
}