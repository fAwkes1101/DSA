public static class BSTPair{
    int max= Integer.MIN_VALUE;

    int min = Integer.MAX_VALUE;
   boolean result =true;
  }

  public static BSTPair isBST(Node node){
     if(node== null) return new BSTPair();

     BSTPair left = isBST(node.left);
     BSTPair right = isBST(node.right);
     BSTPair curr = new BSTPair();
     if(left.max<node.data && right.min>node.data && left.result && right.result){
        curr.result = true;
     }else{
       curr.result = false;
     }
     
    curr.max = Math.max(node.data, Math.max(left.max,right.max));
    curr.min = Math.min(node.data, Math.min( left.min, right.min));

  return curr;
  }
