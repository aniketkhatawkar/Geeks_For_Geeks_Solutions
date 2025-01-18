
class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
        // code here
        int n=arr.length;
        Arrays.sort(arr);
        int left=0;
        int  right=n-1;
        int minDiff =  Integer.MAX_VALUE;
        List<Integer>Li=new ArrayList<>();

        
        while(left<right){
            int sum=arr[left]+arr[right];
            int diff = Math.abs(target-sum);
            
            if(diff<minDiff){
               minDiff=diff;
               Li=Arrays.asList(arr[left],arr[right]);
                
            }if (sum>target){
                right--;
            }else if(sum<target){
                left++;
            }else{
                return Arrays.asList(arr[left],arr[right]);
            }
        }
        
        return Li;
    }
}