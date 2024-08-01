class Solution {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int matrix[][]) {
        // code here
        int r= matrix.length;
        int c = matrix[0].length;
        ArrayList<Integer> result = new ArrayList<>();
        
        int top=0, left=0, right = c-1, bottom= r-1;
        
        while(top<=bottom && right>= left){
            
            for(int col= left; col<=right; col++)
                result.add(matrix[top][col]);

            top++; 
           
            for(int row=top; row<=bottom; row++)
                result.add(matrix[row][right]);
           
            right--;
           
            if(top<= bottom){
             
                for(int col= right; col>=left; col--)
                    result.add(matrix[bottom][col]);
              
                bottom--; 
            }
         
            if(left<=right){
             
                for(int row=bottom; row>=top; row--)
                    result.add(matrix[row][left]);
              
                left++; 
            }
           
            }
        
        return result;
    }
}