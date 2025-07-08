class Solution {
    int missingNum(int arr[]) {
        // code here
        int n = arr.length + 1;
        long totalSum = (long) n * (n + 1) / 2;
        long actualSum = 0;
        
        for (int num : arr) {
            actualSum += num;
        }
        
        return (int)(totalSum - actualSum);
    }
}