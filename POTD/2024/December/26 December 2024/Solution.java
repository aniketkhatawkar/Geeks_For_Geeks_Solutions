class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        int i = 0;
        int j = arr.length-1;
        
        Arrays.sort(arr);
        
        while ( i < j ) {
            int ans = arr[i] + arr[j];
            
            if(ans==target) {
                return true;
            }else if ( ans < target ) {
                i++;
            }else {
                j--;
            }
        }
        
        return false ;
    }
}