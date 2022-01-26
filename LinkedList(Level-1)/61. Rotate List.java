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
    public int sizeOf(ListNode head){
      
        int count =0;
        while(head!=null){
            head=head.next;
            count++;
        }
        return count;
    }
    public ListNode tail(ListNode head){
       ListNode prev=null;
        while(head!=null){
           prev = head;
            head=head.next;
            
        }
        return prev;
        
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        
       
        ListNode  head1 = head;
        ListNode prev = null;
        
        ListNode tail = tail(head);
        
        int size = sizeOf(head);
        int rotate = k%size;
        if(rotate==0){
            return head;
        }else{
            rotate = size-rotate;
            while(rotate>0 && head!=null){
                prev = head;
                head = head.next;
                rotate--;
            }
        }
       ListNode temp = head;
    
        prev.next=null;  
        tail.next = head1;
        return  temp;
    }
}
