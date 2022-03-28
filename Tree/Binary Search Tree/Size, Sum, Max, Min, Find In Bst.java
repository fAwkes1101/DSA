
  public static int size(Node node) {
       if(node == null) return 0;

       int left = size(node.left);
       int right = size(node.right);

       return left+right+1;

       }

  public static int sum(Node node) {
    // write your code here
    if(node == null) return 0;

       int left = sum(node.left);
       int right = sum(node.right);

       return left+right+node.data;
  }

  public static int max(Node node) {
    // write your code here
    if(node.right==null) return node.data;

     return max(node.right);
  }

  public static int min(Node node) {
    // write your code here
    if(node.left==null) return node.data;

     return min(node.left);
  }

  public static boolean find(Node node, int data){
    // write your code here
    if(node==null) return false;
    
    if(node.data==data) return true;
     boolean left=false,right=false;
    if(node.data>data){
       left =find(node.left,data);
    }else{
       right =find(node.right,data);
    }
   
   return left|| right;

  } 
