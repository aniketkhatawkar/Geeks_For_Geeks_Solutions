class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> ans = new ArrayList<>();
        helper(root, ans);
        return ans;
    }
    void helper(Node root, ArrayList<Integer> ans){
        if(root == null){
            return;
        }
        helper(root.left, ans);
        ans.add(root.data);
        helper(root.right, ans);
    }
}