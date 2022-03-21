   public static ArrayList<Node> nodeToRootPath(Node node, int data){
    // write your code here
     if(node==null) return new ArrayList();
     
     if(node.data == data){
       ArrayList<Node> base = new ArrayList<Node>();  
       base.add(node);   
        return base;
     }
     ArrayList<Node> leftans = nodeToRootPath(node.left,data);
     if(leftans.size() > 0){
       leftans.add(node);
       return leftans;
     }
     ArrayList<Node> rightans = nodeToRootPath(node.right,data);
     if(rightans.size() > 0){
       rightans.add(node);
       return rightans;
     }
     return new ArrayList();
     
  }
  public static void printKLevelsDown(Node node,  Node prev, int k){
     if(node==null || node==prev) return;

     if(k==0){
       System.out.println(node.data);
     }
     k--;
     printKLevelsDown(node.left,prev, k);
     printKLevelsDown(node.right,prev,k);
  }

  public static void printKNodesFar(Node node, int data, int k) {
    ArrayList<Node> path = nodeToRootPath(node,data);
    
    for(int i=0; i<path.size();i++){
     Node prev = null;
      if(i>0){
        prev =path.get(i-1);
      }
      printKLevelsDown(path.get(i),prev,k);
      k--;
    }

  }
