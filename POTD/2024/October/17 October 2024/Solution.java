class Solution {
    // Function to append a new node with newData at the end of a linked list
    Node[] alternatingSplitList(Node head) {
        // code here
        Node head1 = null, head2 = null;
        Node tail1 = null, tail2 = null;

        Node temp = head;
        boolean toggle = true;
        
        while (temp != null) {
            if (toggle) {
                if (head1 == null) {
                    head1 = new Node(temp.data);
                    tail1 = head1;
                } else {
                    tail1.next = new Node(temp.data);
                    tail1 = tail1.next;
                }
            } else {
                if (head2 == null) {
                    head2 = new Node(temp.data);
                    tail2 = head2;
                } else {
                    tail2.next = new Node(temp.data);
                    tail2 = tail2.next;
                }
            }
            toggle = !toggle;
            temp = temp.next;
        }

        return new Node[] { head1, head2 };
    }
}