class Solution {
    public int count(int coins[], int sum) {
        // code here.
        int n = coins.length;
        int dp[][] = new int[n][sum+1];
        
        for(int arr[]:dp)
            Arrays.fill(arr,-1);
            
        return rec(coins,n-1,sum,dp);
    }
    
    public int rec(int coins[],int i,int sum,int dp[][]) {
        if(i==0) {
            if(sum%coins[0]==0)
                return 1;
                
            return 0;
        }
        
        if(dp[i][sum]!=-1)
            return dp[i][sum];
            
        int take = 0;
        
        if(coins[i]<=sum)
            take = rec(coins,i,sum-coins[i],dp);
            
        int not = rec(coins,i-1,sum,dp);
        
        return dp[i][sum] = not+take;
    }
}