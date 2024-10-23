class Solution {

    // Return the sum of last k nodes
    public int sumOfLastN_Nodes(Node head, int n) {
        // write code here
        Node fast = head;
        Node slow = head;
        
        for(int i=0;i<n;i++){
            fast = fast.next;
        }
        
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        
        int sum = 0;
        
        while(slow != null){
            sum += slow.data;
            slow = slow.next;
        }
        return sum;
    }
}