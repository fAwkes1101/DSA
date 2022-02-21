public static Node getTail(Node node){
    while(node!=null && node.children.size()>0){
      node = node.children.get(0);
    }
    return node;  
  }
  
  public static void linearize(Node node){
    
    for(Node child: node.children){
      linearize(child);
    }

    for(int i = node.children.size()-1; i>0;i--){
      Node rightChild = node.children.get(i);
      Node leftChildTail = getTail(node.children.get(i-1));
      leftChildTail.children.add(rightChild);

      node.children.remove(i);
    }

  }
