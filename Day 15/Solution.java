class Solution {
    boolean isSumTree(Node root) {
        // Your code here
        return dfs(root)[1]==1;
    }
    
    public int[] dfs(Node root){
        int sumTree = 0;
        
        if(root==null)
            return new int[]{0,1};
            
        int[] left = dfs(root.left);
        int[] right = dfs(root.right);
        
        if(left[0]==0 && right[0]==0)
            sumTree = 1;
        else
            sumTree = (left[1]==1 && right[1]==1)?(left[0]+right[0]==root.data?1:0):0;
            
        return new int[]{left[0]+right[0]+root.data,sumTree};
    }
}