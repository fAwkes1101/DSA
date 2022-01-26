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
    public ListNode mid (ListNode head){
        ListNode slow=head,fast=head, prev=null;
        
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast==null) return prev;
        return slow;
    }
    public ListNode reverse(ListNode head){
        ListNode curr =head, prev=null;
        
        while(curr!=null){
            ListNode ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return;
        }
        ListNode dummy = new ListNode(-1);
        ListNode tail =dummy;
        
        ListNode mid = mid(head);
        ListNode rhead = reverse(mid.next);
        mid.next = null;
        
       while(head != null || rhead!=null){
          if(head!=null){
              tail.next = head;
              tail =head;
              head=head.next;
              
          }
           if(rhead!=null){
               tail.next = rhead;
               tail = rhead;
               rhead = rhead.next;
           }
       }
        tail.next=null;
        head = dummy.next;
        
        
    }
}
