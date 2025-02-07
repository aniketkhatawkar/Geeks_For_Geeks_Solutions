class Solution {
    private static int preIndex = 0;
    private static HashMap<Integer, Integer> inorderMap;
    
    public static Node buildTree(int inorder[], int preorder[]) {
        // code here
        preIndex = 0;
        inorderMap = new HashMap<>();
        
        for(int i = 0; i< inorder.length; i++){
            inorderMap.put(inorder[i], i);
        }
        return constructTree(preorder, 0, inorder.length - 1);
    }
    
    private static Node constructTree(int preorder[], int inStart, int inEnd){
        if(inStart > inEnd) return null;
        
        int rootValue = preorder[preIndex++];
        Node root = new Node(rootValue);
        
        int inIndex = inorderMap.get(rootValue);
        
        root.left = constructTree(preorder, inStart, inIndex - 1);
        root.right = constructTree(preorder, inIndex + 1, inEnd);
        
        return root;
    }
    
    public static void postOrder(Node root){
        if(root == null) return ;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
}