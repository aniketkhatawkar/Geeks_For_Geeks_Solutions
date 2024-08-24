class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
        // Your code here
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            int sz = queue.size();
            
            for(int i=0;i<sz;i++){
                Node curr = queue.remove();
                if(i==0)
                    res.add(curr.data);
                    
                if(curr.left!=null)
                    queue.add(curr.left);
                    
                if(curr.right!=null)
                    queue.add(curr.right);
            }
        }
        return res;
    }
}