public static void mirror(Node node){
      
      Collections.reverse(node.children);
      for(Node child: node.children){
        mirror(child);
      }
  }
