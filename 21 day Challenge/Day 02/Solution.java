class Solution {
    // Function to return the minimum cost of connecting the ropes.
    public long minCost(long[] arr) {
        // code here
        if(arr.length<=1){
            return 0;
        }
        
        long ans=0;
        PriorityQueue<Long>pq = new PriorityQueue<>();
        
        for(long i:arr){
            pq.offer(i);
        }
        
        while(!pq.isEmpty()){
            long a = pq.poll();
            long b = pq.poll();
            ans += (a+b);
            if(!pq.isEmpty())
            pq.offer(a+b);
        }
        
        return ans;
    }
}