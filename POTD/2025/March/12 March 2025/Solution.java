class Solution {
    static int minCostClimbingStairs(int[] cost) {
        // Write your code here
        int dp[] = new int[cost.length+2];
        Arrays.fill(dp,-1);
        return minCost(cost,dp,-1,cost.length);
    }
    
    static int minCost(int[] cost,int dp[],int pos,int len){
        if(pos >= len-2){
            return 0;
        }
        if(dp[pos+1]!=-1){
            return dp[pos+1];
        }
        return dp[pos+1] = Math.min(cost[pos+1] + minCost(cost,dp,pos+1,len)
                            , cost[pos+2] + minCost(cost,dp,pos+2,len));
    }
};