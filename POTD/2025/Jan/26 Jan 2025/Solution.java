class Solution {
    // Function to remove a loop in the linked list.
    public static void removeLoop(Node head) {
        // code here
        HashSet<Node> ar=new HashSet<>();
        
        while(head!=null){
            if(ar.contains(head.next)) {
                head.next=null;
                break;
            }
            else
                ar.add(head);
                
            head=head.next;
        }
    }
}