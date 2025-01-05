class Solution {
    int countPairs(int arr[], int target) {
        // Your code here
        int n=arr.length;
        int left=0,right=n-1;
        
        Arrays.sort(arr);
        
        int res=0;
        
        for(int i=0;i<n&&left<right;i++){
            left=i;
            right=n-1;
            
            while(left<right){
                int sum=arr[left]+arr[right];
                
                if(sum<target){
                    res+=(right-left);
                    left++;
                }
                else if(sum>=target){
                    right--;
                }
            }
        }
        
        return res;
    }
}