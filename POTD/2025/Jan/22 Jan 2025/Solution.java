class Solution {
    public Node cloneLinkedList(Node head) {
        // code here
        Node temp = head;
        while(temp != null){
            Node clone = new Node(temp.data);
            clone.next = temp.next;
            temp.next = clone;
            temp = clone.next;
        }
        temp = head;
        while(temp!= null){
            if(temp.random != null){
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }
        Node c = new Node(0), ans = c;
        temp = head;
        while(temp != null){
            c.next = temp.next;
            c = c.next;
            temp.next = c.next;
            temp = temp.next;
        }
        return ans.next;
    }
}