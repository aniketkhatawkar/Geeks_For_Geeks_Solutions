class Solution {
    // function should insert the data to the front of the list
    static Node insert(Node head, int data) {
        // Code Here.
        Node t1=new Node(data);
        t1.npx=head;
        
        return t1;
    }

    // function to print the linked list
    static ArrayList<Integer> getList(Node head) {
        // Code Here.
        ArrayList<Integer> arr=new ArrayList<>();
        
        while(head!=null){
            arr.add(head.data);
            head=head.npx;
        }
        
        return arr;
    }
}