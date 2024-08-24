class Solution {
    public Node sortedArrayToBST(int[] nums) {
        // Code here
        return fn(nums,0,nums.length-1);
    }
    
    private Node fn(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        int mid = left + (right - left) / 2;
        Node root = new Node(nums[mid]);

        root.left = fn(nums, left, mid - 1);
        root.right = fn(nums, mid + 1, right);

        return root;
    }
}