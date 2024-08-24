class Solution {
    // Function to find if there is a celebrity in the party or not.
    public int celebrity(int mat[][]) {
        // code here
        int top = 0;
        int bottom  = mat.length - 1;
        
        while(top < bottom) {
            if(mat[top][bottom] == 1) 
                top++;
            else if(mat[bottom][top] == 1) 
                bottom--;
            else {
                bottom--;
                top++;
            }
        }
        
        if(top > bottom) 
            return -1;
            
        for(int i = 0; i < mat.length; i++) {
            if(i == top) 
                continue;
            if(mat[i][top] == 1 && mat[top][i] == 0)
                continue;
            else 
                return -1;
        }
        return top;
    }
}