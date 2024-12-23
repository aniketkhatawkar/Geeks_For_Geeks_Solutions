class Solution {
    public static boolean matSearch(int mat[][], int x) {
        // your code here
        int i = 0;
        int j = mat[0].length;
        int n = mat.length;
        
        while(i < n) {
            if(mat[i][0] <= x && x <= mat[i][j-1]) {
                int low = 0;
                int high = j-1;
                
                while(low<=high) {
                    int mid = low + (high - low) /2 ;
                    if(mat[i][mid] == x) 
                        return true;
                    else if(mat[i][mid] > x) 
                        high = mid -1;
                    else 
                        low = mid + 1;
                }
            }
            
            i++;
        }
        
        return false;
    }
}