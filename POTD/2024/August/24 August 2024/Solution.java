class Solution {
    // Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[]) {
        // your code here
        int n = wt.length;
        int[][] mat = new int[n + 1][W + 1];
        
        for (int r = 0; r < W + 1; r++) {
            mat[0][r] = 0;
        }
        
        for (int c = 0; c < n + 1; c++) {
            mat[c][0] = 0;
        }
        
        for (int item = 1; item <= n; item++) {
            
            for (int capacity = 1; capacity <= W; capacity++) {
                
                int maxValWithoutCurr = mat[item - 1][capacity];
                int maxValWithCurr = 0;
                
                int weightOfCurr = wt[item - 1];
                if (capacity >= weightOfCurr) {
                    maxValWithCurr = val[item - 1];
                    
                    int remainingCapacity = capacity - weightOfCurr;
                    maxValWithCurr += mat[item - 1][remainingCapacity];
                }
                
                mat[item][capacity] = Math.max(maxValWithoutCurr, maxValWithCurr);
            }
        }
        
        return mat[n][W];
    }
}