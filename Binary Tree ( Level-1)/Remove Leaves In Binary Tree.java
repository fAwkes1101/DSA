  // With return type Node
  public static Node removeLeaves(Node node){
     if(node==null ) return null;

      if(node.left== null && node.right==null) return null;

      node.left =  removeLeaves(node.left);
      node.right = removeLeaves(node.right);
      return node;
 
    
  }
  
  //Void return type
  public static void removeLeaves(Node node){
     if(node==null ) return; 
 
    if(node.left!=null ){
     if(node.left.left==null && node.left.right==null) node.left=null;}

    if(node.right!=null){ 
     if(node.right.left==null && node.right.right==null) node.right=null;}

     removeLeaves(node.left);
     removeLeaves(node.right);
    
  }

  
