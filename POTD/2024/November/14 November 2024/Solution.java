class Solution {
    // Non-static method, so you need to call it on an instance of the class
    public void nearlySorted(int[] arr, int k) {
        // code
        Arrays.sort(arr);
     
        int n = arr.length;
        for(int i = 0; i<n; i++){
            if(arr[i] == k){
                Arrays.sort(arr);
            }
        }
    }
}