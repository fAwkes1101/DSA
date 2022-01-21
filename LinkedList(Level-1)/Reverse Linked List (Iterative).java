public Node getNode(int idx) {
      Node curr = head;
      for(int i=0; i<idx ;i++){
        curr=curr.next;
      }
      return curr;
      }
    
    public void swap(Node left, Node right){
      int temp =left.data;
      left.data=right.data;
      right.data = temp;
    }
    public void reverseDI() {
      int left = 0, right =size-1;
      while(left<right){
        Node leftnode = getNode(left);
        Node rightNode = getNode(right);
        swap(leftnode,rightNode);
        left++;
        right--;      }
    }
