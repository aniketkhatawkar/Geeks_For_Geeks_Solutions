class Solution{
       
    static int countMin(String str)
    {
        // code here
        int n = str.length();
        int[][] dp = new int[n][n];
        
        for (int[] arr: dp)
            Arrays.fill(arr, -1);
            
        return minCount(str, 0, n-1, dp);
    }
    
    static int minCount(String S, int i, int j, int[][] dp){
        if (i >= j) 
            return 0;
            
        if (dp[i][j] != -1) 
            return dp[i][j];
            
        if (S.charAt(i) == S.charAt(j)) 
            return dp[i][j] = minCount(S, i+1, j-1, dp);
            
        return dp[i][j] = 1 + Math.min(minCount(S, i+1, j, dp), minCount(S, i, j-1, dp));
    }
}