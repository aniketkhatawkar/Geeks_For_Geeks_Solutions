class Solution {
    static int totalCost = 0;
    
    public static int treePathsSum(Node root) {
        // add code here.
        totalCost = 0;
        explorePaths(root, 0);
        
        return totalCost;
    }
    
    public static void explorePaths(Node root, int currCost) {
        currCost = (currCost * 10) + root.data;
        if (root.right == null && root.left == null) {
            totalCost += currCost;
            return;
        }
        if (root.left != null)
            explorePaths(root.left, currCost);
        if (root.right != null)
            explorePaths(root.right, currCost);
    }
}