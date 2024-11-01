class Solution {
    public long maxSum(Long[] arr) {
        // code here
        Arrays.sort(arr);
        
        int n = arr.length;
        
        if (n < 2) {
            return 0;
        }
        
        if (n == 2) {
            return 2 * Math.abs(arr[0] - arr[1]);
        }
        
        Long[] nums = new Long[n];
        int left = 0, right = n - 1;
        
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                nums[i] = arr[left++];
            } else {
                nums[i] = arr[right--];
            }
        }
        
        long result = 0;
        for (int i = 1; i < n; i++) {
            result += Math.abs(nums[i] - nums[i - 1]);
        }
        
        result += Math.abs(nums[n - 1] - nums[0]);
        
        return result;
    }
}