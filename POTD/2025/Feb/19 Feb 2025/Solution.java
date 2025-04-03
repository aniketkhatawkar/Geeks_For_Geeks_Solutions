// User function Template for Java
/*class Node
{
    int data;
    Node next;

    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

// arr is an array of Nodes of the heads of linked lists

class Solution {
    // Function to merge K sorted linked list.
    Node mergeKLists(List<Node> arr) {
        // Add your code here.
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0; i<arr.size(); i++) {
            Node node = arr.get(i);
            
            while(node != null) {
                pq.add(node.data);
                node = node.next;
            }
        }
        
        Node head = new Node(-1);
        Node prev = head;
        while(pq.size() > 0) {
            Node node = new Node(pq.remove());
            
            prev.next = node;
            prev = node;
        }
        
        return head.next;
    }
}