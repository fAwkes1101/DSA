 public static void levelOrder(Node node){
    Queue<Node> q = new ArrayDeque<>();
    q.add(node);
    
    while(q.size()>0){
      
      Node node1 = q.remove();
      System.out.print(node1.data+" ");
      for(Node child: node1.children){
        q.add(child);
      }

    }
System.out.print(".");
  }
