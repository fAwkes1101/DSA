public static ArrayList<Integer> nodeToRootPath(Node node, int data){
    if(node.data==data){
      ArrayList<Integer> base = new ArrayList<>();
      base.add(data);
      return base;
    }

   for(Node child: node.children){
     ArrayList<Integer> ans = nodeToRootPath(child,data);

     if(ans.size()>0){
       ans.add(node.data);
       return ans ;
     }
   }
   return new ArrayList<>();

 }
