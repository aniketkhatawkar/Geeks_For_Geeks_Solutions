class Solution {
    int ans;
    int c;
    
    // Return the Kth smallest element in the given BST
    public int kthSmallest(Node root, int k) {
        // Write your code here
        ans=0;
        c=k;
        
        if(find(root)){
            return ans;
        }
        
        return -1;
    }
    
    boolean find(Node t){
        if(t==null){
            return false;
        }
        
        if(find(t.left))
            return true;
            
        c--;
        
        if(c==0){
            ans=t.data;
            return true;
        }
        
        if(find(t.right)){
            return true;
        }
        
        return false;
    }
}
