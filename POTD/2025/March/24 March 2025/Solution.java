class Solution {
	static int matrixMultiplication(int arr[]) {
	    // code here
	    int n = arr.length;
	    int[][] dp = new int[n][n];
	    
	    for (int i = 1; i < n; i++) {
		   dp[i][i] = 0;
	    }
	    
	    for (int len = 2; len < n; len++) {
		   for (int i = 1; i < n - len + 1; i++) {
			  int j = i + len - 1;
			  dp[i][j] = Integer.MAX_VALUE;
			  for (int k = i; k < j; k++) {
				 int cost = dp[i][k] + dp[k+1][j] + arr[i-1] * arr[k] * arr[j];
				 if (cost < dp[i][j]) {
					dp[i][j] = cost;
				 }
			  }
		   }
	    }
	    
	    return dp[1][n-1];
	}
 }