public void addFirst(int val) {
       Node temp = new Node();
       temp.data = val;
       if(size==0){
         head =temp;
         tail =temp;
       }
       else{
          temp.next = head;
          head = temp;

       }
       size++;
    }
