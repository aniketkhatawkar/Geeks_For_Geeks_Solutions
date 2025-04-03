class Solution {
    static int countWays(String s) {
        // code here
        int n = s.length();
        int[][] dpTrue = new int[n][n];
        int[][] dpFalse = new int[n][n];
        
        for (int i = 0; i < n; i += 2) {
            if (s.charAt(i) == 'T') {
                dpTrue[i][i] = 1;
            } else {
                dpFalse[i][i] = 1;
            }
        }
        
        for (int len = 3; len <= n; len += 2) {
            for (int i = 0; i <= n - len; i += 2) {
                int j = i + len - 1;
                for (int k = i + 1; k < j; k += 2) {
                    char op = s.charAt(k);
                    int leftTrue = dpTrue[i][k - 1];
                    int leftFalse = dpFalse[i][k - 1];
                    int rightTrue = dpTrue[k + 1][j];
                    int rightFalse = dpFalse[k + 1][j];
                    if (op == '&') {
                        dpTrue[i][j] += leftTrue * rightTrue;
                        dpFalse[i][j] += leftTrue * rightFalse + leftFalse * rightTrue + leftFalse * rightFalse;
                    } else if (op == '|') {
                        dpTrue[i][j] += leftTrue * rightTrue + leftTrue * rightFalse + leftFalse * rightTrue;
                        dpFalse[i][j] += leftFalse * rightFalse;
                    } else if (op == '^') {
                        dpTrue[i][j] += leftTrue * rightFalse + leftFalse * rightTrue;
                        dpFalse[i][j] += leftTrue * rightTrue + leftFalse * rightFalse;
                    }
                }
            }
        }
        
        return dpTrue[0][n - 1];
    }
}