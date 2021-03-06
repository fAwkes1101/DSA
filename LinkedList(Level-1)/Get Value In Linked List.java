public int getFirst(){
      if(size==0){
        System.out.println("List is empty");
        return -1;
      }
      return head.data;
    }

    public int getLast(){
      if(size==0){
        System.out.println("List is empty");
        return -1;
      }
      return tail.data;
    }

    public int getAt(int idx){
      if(size==0){
        System.out.println("List is empty");
        return -1;
      }
      if(idx<0 || idx>=size){
        System.out.println("Invalid arguments");
        return -1;
      }
      if(idx==0) return getFirst();
      if(idx== size-1) return getLast();
      Node temp = head;
      for(int i=0;i<idx;i++){
        temp =temp.next;
      }
      return temp.data;
    }
  }
