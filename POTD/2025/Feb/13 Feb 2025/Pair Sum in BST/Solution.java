class Solution {
    boolean findTarget(Node root, int target) {
        // Write your code here
        boolean flag[] = new boolean[1];
        HashSet<Integer> hash = new HashSet<>();
        dfs(root,hash,target,flag);
        
        return flag[0];
    }
    
    public static void dfs(Node root,HashSet<Integer> hash,int target,boolean flag[]){
        if(root == null)
            return;
            
        if(flag[0])
            return;
            
        if(hash.contains(target-root.data))
            flag[0] = true;
        else 
            hash.add(root.data);
            
        dfs(root.left,hash,target,flag);
        dfs(root.right,hash,target,flag);
    }
}
