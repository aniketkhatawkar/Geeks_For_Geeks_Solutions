class Solution {
    public int maxValue(int[] arr) {
        // code here
        int n = arr.length;
        if (n == 1) return arr[0];

        return Math.max(rob(arr, 0, n - 2), rob(arr, 1, n - 1));
    }

    private int rob(int[] nums, int l, int r) {
        int prev2 = 0, prev1 = 0;
        for (int i = l; i <= r; i++) {
            int curr = Math.max(prev1, prev2 + nums[i]);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}