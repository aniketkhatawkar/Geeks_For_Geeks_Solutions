class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        // Add your code here.
        if(head.next == null) 
            return 0;
            
        Node slow = head;
        Node fast = head.next;
        boolean check = false;
        int count =0;
        
        while(fast.next != null && fast.next.next != null){
            
            if(slow != fast && check == false){
                slow = slow.next;
                fast = fast.next.next;
            }else{
                check = true;
                slow = slow.next;
                count++;
                if(slow == fast){
                    return count;
                }
                
            }
        }
        return 0;
    }
}