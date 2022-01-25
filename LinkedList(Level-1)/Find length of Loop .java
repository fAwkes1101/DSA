class Solution
{
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
       if(head==null || head.next==null) return 0;
       Node slow =head,fast=head ;
       int count=1;
       while(fast!=null && fast.next!=null){
           
           slow = slow.next;
           fast=fast.next.next;
           
           if(slow==fast){
               
               break;
           }
       }
      
       if(fast==null || fast.next==null) return 0;
       Node curr1 = head, curr2=slow;
     
       while(curr1!=curr2){
           curr1= curr1.next;
           curr2 = curr2.next;
       }
       curr1= curr1.next;
       while(curr1!= curr2){
           curr1= curr1.next;
           count++;
       }
       return count;
    }
}
