class Solution {
    // Function to find maximum number of consecutive steps
    // to gain an increase in altitude with each step.
    public int maxStep(int arr[]) {
        // Your code here
        int high =0;
        int len =arr.length;
        int count =0;
        
        for(int j=0;j<len-1;j++){
            if(arr[j+1]>arr[j]){
                count++;
            }
            else {
                high = Math.max(high, count);
                count = 0;
            } 
        }
        
        high = Math.max(high, count);
        
        return high;
    }
}