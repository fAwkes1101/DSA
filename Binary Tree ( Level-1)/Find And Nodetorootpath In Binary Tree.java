 public static boolean find(Node node, int data){
     if(node==null) return false;
     
     if(node.data == data){
       return true;
     }
     boolean leftans = find(node.left,data);
     if(leftans==true) return true;
     boolean rightans = find(node.right,data);
     if(rightans==true) return true;

     return false;
  }

  public static ArrayList<Integer> nodeToRootPath(Node node, int data){
    // write your code here
     if(node==null) return new ArrayList();
     
     if(node.data == data){
       ArrayList<Integer> base = new ArrayList<Integer>();  
       base.add(data);   
        return base;
     }
     ArrayList<Integer> leftans = nodeToRootPath(node.left,data);
     if(leftans.size() > 0){
       leftans.add(node.data);
       return leftans;
     }
     ArrayList<Integer> rightans = nodeToRootPath(node.right,data);
     if(rightans.size() > 0){
       rightans.add(node.data);
       return rightans;
     }
     return new ArrayList();
     
  }
