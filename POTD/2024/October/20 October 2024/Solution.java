class Solution {
    public DLLNode sortAKSortedDLL(DLLNode head, int k) {
        // Code here
        if(head==null){
            return null;
        }
        PriorityQueue<DLLNode>pq=new PriorityQueue<>(k+1,(a,b)->a.data-b.data);
        DLLNode newHead=null;
        DLLNode last=null;
        for(int i=0;i<=k && head!=null ;i++){
            pq.add(head);
            head=head.next;
        }
        while(!pq.isEmpty()){
            if(newHead==null){
                newHead=pq.poll();
                last=newHead;
                last.prev=null;
            }
            else{
                last.next=pq.poll();
                last.next.prev=last;
                last=last.next;
            }
            if (head != null) {
                pq.add(head);
                head = head.next;
            }
        }
        last.next=null;
        return newHead;
    }
}