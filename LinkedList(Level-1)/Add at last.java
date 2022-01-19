  public static class LinkedList {
    Node head;
    Node tail;
    int size;

    void addLast(int val) {
      Node temp = new Node();
      temp.data=val;
      
      if(size==0){
        head = temp;
        tail = temp;
      }else{
        tail.next = temp;
        tail = temp;
      }
      size++;
  }}
