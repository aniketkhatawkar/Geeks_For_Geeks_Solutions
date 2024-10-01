class Solution {
    public long multiplyTwoLists(Node first, Node second) {
        // Code here
        long mod = 1000000007;
        long f = getNum(first);
        long s = getNum(second);
        
        return (f * s)%mod;
    }
    private long getNum(Node node){
        long mod = 1000000007;
        long res = 0;
        
        while(node != null){
            res = ((res * 10) + node.data)%mod;
            node = node.next;
        }
        
        return res;
    }
}