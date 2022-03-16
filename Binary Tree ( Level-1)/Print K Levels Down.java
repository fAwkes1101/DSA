public static void printKLevelsDown(Node node, int k){
     if(node==null) return;

     if(k==0){
       System.out.println(node.data);
     }
     k--;
     printKLevelsDown(node.left, k);
     printKLevelsDown(node.right,k);
  }
