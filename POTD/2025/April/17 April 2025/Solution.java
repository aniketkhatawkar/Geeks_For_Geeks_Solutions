class Pair implements Comparable<Pair> {
	int node, weight;
	Pair(int node, int weight) {
	    this.node = node;
	    this.weight = weight;
	}
	
	static Pair of(int node, int weight) {
	    return new Pair(node, weight);
	}
	
	@Override
	public int hashCode() {
	    return this.node * 31 + this.weight;
	}
	
	@Override
	public boolean equals(Object o) {
	    if(o == null) return false;
	    
	    if(!(o instanceof Pair)) return false;
	    
	    Pair p = (Pair)o;
	    
	    return this.node == p.node && this.weight == p.weight;
	    
	}
	
	@Override
	public int compareTo(Pair p) {
	    return this.weight - p.weight;
	}
 }
 
 class Solution {
	public int findMinCycle(int V, int[][] edges) {
	    // code here
	    List<Set<Pair>> adj = new ArrayList<>();
	    
	    for(int i=0; i<V; i++) {
		   adj.add(new HashSet<>());
	    }
	    
	    for(int edge[] : edges) {
		   int u = edge[0];
		   int v = edge[1];
		   int w = edge[2];
		   adj.get(u).add(Pair.of(v, w));
		   adj.get(v).add(Pair.of(u, w));
	    }
	    
	    int ans = Integer.MAX_VALUE;
	    
	    for(int edge[] : edges) {
		   int u = edge[0];
		   int v = edge[1];
		   int w = edge[2];
		   
		   adj.get(u).remove(Pair.of(v, w));
		   adj.get(v).remove(Pair.of(u, w));
		   
		   int minDist = dijkstra(u, v, V, adj);
		   if(minDist + w < ans) {
			  ans = minDist + w;
		   }
		   
		   adj.get(u).add(Pair.of(v, w));
		   adj.get(v).add(Pair.of(u, w));
		   
	    }
	    
	    return ans;   
	}
	
	private int dijkstra(int src, int dest, int V, List<Set<Pair>> adj) {
	    int dist[] = new int[V];
	    int MAX = 100000000;
	    Arrays.fill(dist, MAX);
	    
	    dist[src] = 0;
	    
	    PriorityQueue<Pair> pq = new PriorityQueue<>();
	    
	    pq.add(Pair.of(src, 0));
	    
	    while(!pq.isEmpty()) {
		   Pair p = pq.poll();
		   for(Pair nei : adj.get(p.node)) {
			  if(dist[nei.node] > dist[p.node] + nei.weight) {
				 dist[nei.node] = dist[p.node] + nei.weight;
				 pq.add(Pair.of(nei.node, dist[nei.node]));
			  }
		   }
	    }
	    
	    return dist[dest];
	    
	}
 };