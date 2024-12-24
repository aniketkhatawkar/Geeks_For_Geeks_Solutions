class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int ind = 0;
        
        for(int i=0;i<mat.length;i++){
            
            if(x >= mat[i][0] && x <= mat[i][mat[i].length-1]){
                ind = i;
                break;
            }else
                continue;
        }
        
        int left = 0;
        int right = mat[ind].length-1;
        
        while(left <= right){
            int mid = left + (right - left)/2;
            if(mat[ind][mid] == x)
                return true;
            else if(mat[ind][mid] > x){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        
        return false;
    }
}