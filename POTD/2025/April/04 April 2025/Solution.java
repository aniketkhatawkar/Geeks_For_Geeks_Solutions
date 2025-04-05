class Solution {
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        List<Integer>[] adj = new ArrayList[V];
        for (int i = 0; i < V; i++) adj[i] = new ArrayList<>();
        
        for (int[] edge : edges) {
            adj[edge[0]].add(edge[1]);
            adj[edge[1]].add(edge[0]); 
        }
        
        boolean[] vis = new boolean[V];
        
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                if (dfs(i, -1, adj, vis)) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    boolean dfs(int node, int parent, List<Integer>[] adj, boolean[] vis) {
        vis[node] = true;
        
        for (int it : adj[node]) {
            if (!vis[it]) {
                if (dfs(it, node, adj, vis)) {
                    return true;
                }
            } else if (it != parent) {
                return true;
            }
        }
        return false;
    }
}