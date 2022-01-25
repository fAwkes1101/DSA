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
    public ListNode merge(ListNode l1 , ListNode l2){
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
       
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                tail.next = l1;
                l1 = l1.next;
               
            }else {
                tail.next= l2;
                l2 = l2.next; 
            }
             tail = tail.next;
        }
        if(l1!=null) tail.next= l1;
        if(l2!=null) tail.next =l2;
        return dummy.next;
        
    }
    public ListNode helper(ListNode[] lists, int left, int right){
      if(left> right) return null;
        if(left==right) return lists[left];
      int mid = (left+right)/2;
        
       ListNode l1 = helper(lists, left, mid);
       ListNode l2 =  helper(lists, mid+1, right);
       
        return merge(l1,l2);
        
        
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)
            return null;
            
         return helper(lists, 0, lists.length-1);
        
    }
}
