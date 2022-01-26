/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
          if(head==null || head.next==null) return head;
         ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);
        ListNode head1 =dummy1, head2=dummy2;

         while(head!=null){
            if(head!=null){
                head1.next = head;
                head=head.next;
                head1=head1.next;
            }
            if(head!=null){
                head2.next = head;
                head=head.next;
                head2 = head2.next;
            }
         }
         head1.next =null;
         head2.next=null;
         
         
        head1.next = dummy2.next;
        return dummy1.next;
        
    }
}
