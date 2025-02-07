class Solution {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        Node newnode=null,tmp=null;
        while(head1!=null||head2!=null){
            if(head1!=null&&(head2==null||(head1.data<head2.data))){
                if(newnode==null){
                    newnode=head1;
                    tmp=head1;
                }
                else{
                    tmp.next=head1;
                    tmp=head1;
                }
                head1=head1.next;
            }
            else{
                if(newnode==null){
                    newnode=head2;
                    tmp=head2;
                }
                else{
                    tmp.next=head2;
                    tmp=head2;
                }
                head2=head2.next;
            }
        }
        tmp.next=null;
        return newnode;
    }
}