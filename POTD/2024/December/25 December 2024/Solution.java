class Solution {
    public void setMatrixZeroes(int[][] mat) {
        boolean[] row=new boolean[mat.length];
        boolean[] column=new boolean[mat[0].length];
        for(int i=0;i<mat.length;i++)
        
        for(int j=0;j<mat[0].length;j++) {
            if(mat[i][j]==0)
            {
                row[i]=true;
                column[j]=true;
            }
        }
        
        for(int i=0;i<mat.length;i++)
            for(int j=0;j<mat[0].length;j++)
                if(row[i]||column[j])
                    mat[i][j]=0;
                    
    }
}