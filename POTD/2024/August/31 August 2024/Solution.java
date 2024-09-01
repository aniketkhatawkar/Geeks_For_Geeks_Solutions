class Solution {
    // Function to find three numbers such that arr[smaller[i]] < arr[i] <
    // arr[greater[i]]
    public List<Integer> find3Numbers(int[] arr) {
        // code here
        List<Integer> ans = new ArrayList<>();
        
        int len = arr.length;
        if(len < 3) return ans;
        int small[] = new int[len];
        int big[] = new int[len];
        small[0] = arr[0];
        
        for(int i =1;i<len;i++){
            if(arr[i]>small[i-1]){
                small[i] = small[i-1];
            } else{
                small[i] = arr[i];
            }
        }
        
        big[len-1] = arr[len-1];
        
        for(int i =len-2;i>=0;i--){
            if(arr[i]>big[i+1]){
                big[i] = arr[i];
            } else{
                big[i] = big[i+1];
            }
        }
        
        for(int i=0;i<len;i++){
            if(small[i]<arr[i] && arr[i]<big[i]){
                ans.add(small[i]);
                ans.add(arr[i]);
                ans.add(big[i]);
                return ans;
            }
        }
        
        return ans;
    }
}