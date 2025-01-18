
class Solution {
    Node reverseList(Node head) {
        // code here
        if(head==null||head.next==null) {
            return head;
        }
            
        Node back=null;
        Node curr=head;
        Node temp=head.next;
        
        while(temp!=null){
            curr.next=back;
            back=curr;
            curr=temp;
            temp=temp.next;
        }
        
        curr.next=back;
        head=curr;
        
        return head;
    }
}