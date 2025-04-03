class Solution {
    // Function to check whether a Binary Tree is BST or not.
    List<Integer> inOrderList = new ArrayList<>();
    boolean isBST(Node root) {
        // code here.
        inOrder(root);
        
        for (int i = 1; i < inOrderList.size(); i++) {
            if (inOrderList.get(i) <= inOrderList.get(i - 1)) {
                return false;
            }
        }
        
        return true;
    }
    
    void inOrder(Node root){
        if (root != null) {
            inOrder(root.left);
            inOrderList.add(root.data);
            inOrder(root.right);
        }
    }
}