class Solution {
    public static long[] productExceptSelf(int nums[]) {
        // code here
        int n = nums.length;
        long[] result = new long[n];

        long prefixProduct = 1;
        for (int i = 0; i < n; i++) {
            result[i] = prefixProduct;
            prefixProduct *= nums[i];
        }

        long suffixProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffixProduct;
            suffixProduct *= nums[i];
        }

        return result;
    }
}