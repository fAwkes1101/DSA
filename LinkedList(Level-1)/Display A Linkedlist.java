public void display(){
      if(size==0){
        System.out.println();
        return;
      }
      Node temp  = head;
      while(temp!=null){
        System.out.print(temp.data + " ");
        temp=temp.next;
      }
      System.out.println();
    }
