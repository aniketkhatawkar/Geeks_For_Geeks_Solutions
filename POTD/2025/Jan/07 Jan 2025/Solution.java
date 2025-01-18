class Solution {

    int countPairs(int arr[], int target) {
        // Complete the function
        int i=0,j=arr.length-1;
        int ans = 0;
        while(i<j){
            int sum = arr[i]+arr[j];
            if(sum > target){
                j--;
            }else if(sum < target){
                i++;
            }else{
                ans++;
                int temp = j-1;
                while(temp>i && arr[temp]==arr[j]){
                    ans++;
                    temp--;
                }
                i++;
            }
        }
        return ans;
    }
}