class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        Arrays.sort(arr);
        int sum = 1 ;
        int temp = 1 ;
        
        for(int i = 0 ;i < arr.length-1 ;i++){
            if(arr[i] + 1 == arr[i+1] ) {
                temp++;
            }
            else if(arr[i]  == arr[i+1] ) {
                continue; 
            }
            else{
                sum = Math.max(sum, temp);
                temp = 1;
            }
            sum = Math.max(sum, temp);
            
        }
        return sum;
    }
}