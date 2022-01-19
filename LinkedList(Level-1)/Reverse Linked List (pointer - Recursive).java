private void reversePRHelper(Node curr, Node prev){
      if(curr==null){
        Node temp = head;
        head = tail;
        tail = temp;
        return;
      }

      Node ahead = curr.next;
      curr.next = prev;
      prev= curr;
      curr = ahead;

      reversePRHelper(curr,prev);

      
      
    }

    public void reversePR(){
      Node curr = head;
      Node prev = null;
      reversePRHelper(curr,prev);
    }
