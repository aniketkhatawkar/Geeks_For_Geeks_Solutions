class Solution {
    public static int kthLargest(int[] arr, int k) {
        // code here
        List<Integer> lis = new ArrayList<>();
        
        int maxSum = Integer.MAX_VALUE;
        int currSum = 0;
        int n = arr.length;
        
        for(int i = 0; i < n; i++){
            int sum = arr[i];
            lis.add(sum);
            
            for(int j = i+1; j < n; j++){
                sum += arr[j];
                lis.add(sum);
            }
        } 
        
        lis.sort((a,b)-> b-a);
        
        return lis.get(k-1);  
    }
}