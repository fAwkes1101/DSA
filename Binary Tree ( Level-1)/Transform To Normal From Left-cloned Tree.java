public static void transBackFromLeftClonedTree(Node node){
     if(node==null) return;

     if(node.left!=null){
       node.left = node.left.left;
     }

     transBackFromLeftClonedTree(node.left);
     transBackFromLeftClonedTree(node.right);
     
     return;
  }
