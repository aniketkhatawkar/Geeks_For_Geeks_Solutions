class Solution {
    // Function to reverse a circular linked list
    Node reverse(Node head) {
        // code here
        Node tail=head;
        
        while(tail.next!=head ){
            tail=tail.next;
        }
        
        Node cur=head,prev=tail;
        
        do{
            Node temp= cur.next;
            cur.next=prev;
            prev=cur; 
            cur=temp;
        } while(cur!=head);
        
        return tail;
    }

    // Function to delete a node from the circular linked list
    Node deleteNode(Node head, int key) {
        // code here
        Node tail=head;
        
        while(tail.next!=head ){
            tail=tail.next;
        }
        
        Node cur=head,prev=tail;
        
        do{
            if(cur.data==key){
                Node temp=cur.next;
                cur.next=null;
                cur=temp;
                prev.next=cur;
                if(head.data==key) 
                    return cur;
                else 
                    return head;
            }
            prev=cur; cur=cur.next;
        } while (cur!=head);
        
        return head;
    }
}