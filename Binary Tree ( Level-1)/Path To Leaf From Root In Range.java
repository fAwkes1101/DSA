public static void pathToLeafFromRoot(Node node, String path, int sum, int lo, int hi){
    if(node==null ) return;
    sum +=node.data;
    if(node.left==null && node.right == null  ){
      if(sum>=lo && sum<=hi){
      System.out.println(path+node.data);
      }
      return;
    }
    
    
    pathToLeafFromRoot(node.left, path+node.data+ " " , sum, lo, hi );
    pathToLeafFromRoot(node.right, path+node.data+ " " , sum, lo, hi );

  }
