class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchRowMatrix(int[][] mat, int x) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        int left=0;
        
        while(left<n){
           int row=0;
           int col=m-1;
           
            while(row<=col){
                int mid=row+(col-row)/2;
                if(mat[left][mid]<x){
                    row++;
                }
                else if(mat[left][mid]>x){
                    col--;
                }
                else {
                    return true;
                }
            }
            left++;
        }
        
        return false;
    }
}