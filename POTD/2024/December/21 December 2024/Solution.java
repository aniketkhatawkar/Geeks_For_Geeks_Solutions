class Solution {
    // Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int mat[][]) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        int[][] temp=new int[n][m];
         
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                temp[i][j] = mat[i][j];
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=temp[j][n-1-i];
            }
        }
    }
}