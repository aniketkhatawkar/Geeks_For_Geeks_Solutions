// User function Template for Java
class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer>al=new ArrayList<>();
        int vis[]=new int[adj.size()];
        Queue<Integer>q=new LinkedList<>();
        q.offer(0);
        vis[0]=1;
        while(!q.isEmpty()){
            int node=q.poll();
            al.add(node);
            for(int i:adj.get(node)){
                if(vis[i]!=1){
                    vis[i]=1;
                    q.offer(i);
                }
            }
        }
        return al;
    }
}