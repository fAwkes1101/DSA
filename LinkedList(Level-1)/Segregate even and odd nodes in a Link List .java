//User function Template for Java

/* 
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution{
    Node divide(int N, Node head){
        Node  dummy1 = new Node(-1);
        Node  dummy2 = new Node(-1);
        Node head1 = dummy1, head2 = dummy2;
        
        while(head!=null){
            if(head.data%2==0){
                head1.next = head;
                head = head.next;
                head1 = head1.next;
            }
            if(head!=null && (head.data%2)==1){
                head2.next = head;
                head=head.next;
                head2=head2.next;
            }
        }
        head2.next=null; head1.next=null;
        head1.next = dummy2.next;
        return dummy1.next;
    }
}
