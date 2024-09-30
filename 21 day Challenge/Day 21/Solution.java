class Solution {
    // Function to return a list of integers denoting the node
    // values of both the BST in a sorted order.
    public List<Integer> merge(Node root1, Node root2) {
        // Write your code here
        List<Integer>ls1=new ArrayList<>();
        List<Integer>ls2=new ArrayList<>();
        inorder(root1,ls1);
        inorder(root2,ls2);
        List<Integer>ls=new ArrayList<>();
        int i=0,j=0;
        
        while(i<ls1.size()&&j<ls2.size()){
            if(ls1.get(i)<ls2.get(j)){
                ls.add(ls1.get(i));
                i++;
            }
            else{
                ls.add(ls2.get(j));
                j++;
            }
        }
        
        while(i<ls1.size()){
            ls.add(ls1.get(i));
                i++;
        }
        
        while(j<ls2.size()){
            ls.add(ls2.get(j));
            j++;
        }
        
        return ls;
    }
    
    public void inorder(Node root,List<Integer>ls){
        if(root==null)
            return;
            
        inorder(root.left,ls);
        ls.add(root.data);
        inorder(root.right,ls);
    }
}