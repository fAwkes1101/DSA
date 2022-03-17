static int tilt = 0;
 
  public static int tilt(Node node){
    // write your code here to set the tilt data member
    if(node==null) return 0;
    
    int leftsum = tilt(node.left);
    int rightsum = tilt(node.right);
   // System.out.println(leftsum+ " "+ rightsum);
    tilt += Math.abs(leftsum-rightsum);
    
    return leftsum+rightsum+node.data;
  }
