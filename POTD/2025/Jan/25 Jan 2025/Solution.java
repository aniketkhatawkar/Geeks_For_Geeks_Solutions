class Solution {
    public static Node findFirstNode(Node head) {
        // code here
        Node temp=head;
        Set<Node> set=new HashSet<>();
        
        while(temp!=null){
            if(set.contains(temp)){
                return temp;
                
            }
            else{
                set.add(temp);
            }
            temp=temp.next;
        }
        
        return null;
    }
}