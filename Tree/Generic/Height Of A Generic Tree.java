public static int height(Node node) {
    int ht = -1;
    for(Node child: node.children){
      int childHt = height(child);
      ht = Math.max(ht, childHt);
    }
    ht = ht+1; 
     return ht;
    }
