class Solution {
    
    public int[] shortestPath(int[][] edges,int n,int m ,int src) {
        // Code here
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        
        for (int i = 0; i < m; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        
        int[] dist = new int[n];
        Arrays.fill(dist, -1);
        dist[src] = 0;
        
        Queue<Integer> queue = new LinkedList<>();
        queue.add(src);
        
        while (!queue.isEmpty()) {
            int node = queue.poll();
            
            for (int neighbor : adjList.get(node)) {
                if (dist[neighbor] == -1) {
                    dist[neighbor] = dist[node] + 1;
                    queue.add(neighbor);
                }
            }
        }
        
        return dist;
    }
}