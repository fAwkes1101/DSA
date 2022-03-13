 public static int lca(Node node, int d1, int d2) {
    ArrayList<Integer> path1= nodeToRootPath(node,d1);
    ArrayList<Integer> path2= nodeToRootPath(node, d2);
    
    int val =-1;
    int i = path1.size()-1; int j= path2.size()-1;
    while(i>=0 && j>=0){

      if(path1.get(i)!=path2.get(j)){
        break;
      }
      val = path1.get(i);
      i--; j--;
    }
    return val;
  }
