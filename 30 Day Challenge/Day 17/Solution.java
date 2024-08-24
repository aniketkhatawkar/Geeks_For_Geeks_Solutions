class Solution {
    // Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        // add code here
        Node curr = head;
        Node temp = head;
        
        int t = k-1;
        while(t > 0) {
            temp = temp.next;
            t--;
        }
        
        curr = temp;
        while(curr.next != null) 
            curr = curr.next;
        
        curr.next = head;
        Node ans = temp.next;
        temp.next = null;
        
        return ans;
    }
}