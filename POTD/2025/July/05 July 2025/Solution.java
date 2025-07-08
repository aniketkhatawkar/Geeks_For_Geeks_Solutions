class Solution {
    public int maxSum(int arr[]) {
        // code here
        int sum = Integer.MIN_VALUE;
        
        for(int i=0; i<(arr.length-1); i++){
            sum = Math.max(arr[i] + arr[i+1], sum);
        }
        
        return sum;
    }
}