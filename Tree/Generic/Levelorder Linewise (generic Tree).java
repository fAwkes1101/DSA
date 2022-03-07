public static void levelOrderLinewise(Node node){
    Queue<Node> mq= new ArrayDeque<>();
    Queue<Node> tempq= new ArrayDeque<>();
    mq.add(node);
      
    while(mq.size()>0){
      
      Node node1 = mq.remove();
      System.out.print(node1.data+" ");
      for(Node child: node1.children){
        tempq.add(child);
      }
     if(mq.size()==0){
        mq=tempq;
        tempq= new ArrayDeque<>();
        System.out.println();
     }
    }
    }
