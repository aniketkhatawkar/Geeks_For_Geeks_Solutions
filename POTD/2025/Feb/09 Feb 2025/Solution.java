class Solution {
    // Function to return maximum path sum from any node in a tree.
    int findMaxSum(Node node) {
        // your code goes here
        int maxi[]= new int[1];
        
        maxi[0]= Integer.MIN_VALUE;
        maxSum(node, maxi);
        
        return maxi[0];
    }
    
    public int maxSum(Node node, int maxi[]) {
        if(node== null) 
            return 0;
            
        int leftSum= Math.max(maxSum(node.left, maxi), 0);
        int rightSum= Math.max(maxSum(node.right, maxi), 0);
        
        maxi[0]= Math.max(maxi[0], leftSum+ rightSum+ node.data);
        
        return node.data+ Math.max(leftSum, rightSum);
    }
}
