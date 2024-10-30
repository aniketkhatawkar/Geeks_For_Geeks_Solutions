class GfG {
    public static Node quickSort(Node node) {
        // Your code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        while(node!=null){
            pq.add(node.data);
            node = node.next;
        }
        
        Node curr = null;
        while(!pq.isEmpty()){
            Node nn = new Node(pq.poll());
            if(node==null){
                node = nn;
                curr = node;
            }
            else{
                curr.next = nn;
                curr = curr.next;
            }
        }
        
        return node;
    }
}