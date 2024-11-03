class Solution {
    public boolean isLengthEven(Node head) {
        // code here
        Node h = head;
        int cnt = 0;
        
        while(h != null) {
            cnt++;
            h = h.next;
        }
        return cnt % 2 == 0;
    }
}