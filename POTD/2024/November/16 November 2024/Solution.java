class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int n = arr.length;
        int idx = 0;
        int i = 0;
        while(i<n){
            if(arr[i]!=0){
                arr[idx]=arr[i];
                idx++;
            }
            i++;
        }
        
        while(idx<n){
            arr[idx] = 0;
            idx++;
        }
    }
}