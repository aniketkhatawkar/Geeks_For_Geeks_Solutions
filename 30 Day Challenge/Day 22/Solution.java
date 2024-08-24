class Solution {
    public Node addOne(Node head) {
        // code here.
        head = reversell(head);
        Node temp = head;
        while(temp != null){
            if(temp.data == 9){
                 temp.data = 0;
                if(temp.next == null){
                    Node newNode = new Node(1);
                    temp.next = newNode;
                    break;
                }
            }else if(temp.data < 9){
                temp.data = temp.data+1;
                break;
            }
            temp = temp.next;
        }
        return reversell(head);
    }
    
    public Node reversell(Node head){
        Node curr = head; 
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}