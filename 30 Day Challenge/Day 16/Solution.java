class Solution {

    int Maximize(int arr[]) {
        // Complete the function
        int mod = 1000000007;
        
        Arrays.sort(arr);
        
        long max=0;
        
        for(int i=0;i<arr.length;i++){
            max = (max + (long)i*arr[i])%mod;
        }
        
        return (int)max;
    }
}
