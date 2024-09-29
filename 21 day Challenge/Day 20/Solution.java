class Solution {
    int totalCount(int k, int[] arr) {
        // code here
        int sum=0;
        
        for(int i:arr){
            if(i%k!=0){
                sum++;
            }
            
            sum+=i/k;
        }
        
        return sum;
    }
}