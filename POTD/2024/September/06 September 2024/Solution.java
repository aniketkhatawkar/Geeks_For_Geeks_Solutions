class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {

        // Your code here
        int n = arr.length;
        int maxh = 0, maxf = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            maxh = Math.max(arr[i], maxh + arr[i]);
            maxf = Math.max(maxf, maxh);
        }

        return maxf;
    }
}