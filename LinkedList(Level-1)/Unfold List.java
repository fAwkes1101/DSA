public static ListNode reverse(ListNode head){
        ListNode curr =head, prev=null;
        
        while(curr!=null){
            ListNode ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }
        return prev;
    }
    public static void unfold(ListNode head) {
        if(head==null || head.next==null) return;
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
         
         ListNode secound = reverse(dummy2.next);
         
        head1.next = secound;
         

    }
