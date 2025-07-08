/*
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        // code here.
        Set<Node> set = new HashSet<>();
        Node curr = null;
        
        while(head != null){
            if(set.contains(head)){
                curr = head;
                break;
            }
            set.add(head);
            head = head.next;
        }
        
        if(curr == null){
            return 0;
        }
        
        Node temp = curr;
        curr = curr.next;
        
        int count = 0;
        while(curr != temp){
            count++;
            curr = curr.next;
        }
        
        return count+1;
    }
}