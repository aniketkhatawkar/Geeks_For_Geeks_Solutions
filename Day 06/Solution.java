class Solution {
    public ArrayList<String> findPath(int[][] mat) {
        // Your code here
        int n = mat.length;
        ArrayList<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        boolean[][] visited = new boolean[n][n];
        
        findRoute(0, 0, ans, sb, mat, n, visited);
        
        return ans;
    }
    
    public void findRoute(int i, int j, ArrayList<String> ans, StringBuilder sb, int[][] mat, int n, boolean[][] visited){
        
        if(mat[i][j] == 0 || visited[i][j])
            return;
        
        if(i == n - 1 && j == n - 1){
            
            ans.add(sb.toString());
            return;
        }
        
        visited[i][j] = true;
        
        if(i + 1 < n){
            
            sb.append('D');
            findRoute(i + 1, j, ans, sb, mat, n, visited);
            sb.deleteCharAt(sb.length() - 1);
        }
        
        if(i - 1 >= 0){
            
            sb.append('U');
            findRoute(i - 1, j, ans, sb, mat, n, visited);
            sb.deleteCharAt(sb.length() - 1);
        }
        
        if(j + 1 < n){
            
            sb.append('R');
            findRoute(i, j + 1, ans, sb, mat, n, visited);
            sb.deleteCharAt(sb.length() - 1);
        }
        
        if(j - 1 >= 0){
            
            sb.append('L');
            findRoute(i, j - 1, ans, sb, mat, n, visited);
            sb.deleteCharAt(sb.length() - 1);
        }
        
        visited[i][j] = false;
    }
}