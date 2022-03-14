static Node maxNode;
  static int maxSum;
  public static int maxSumSubtree(Node node){
    int sum = node.data;

    for(Node child: node.children){
      int childSum = maxSumSubtree(child);
      sum +=childSum;
    }
    if(sum>maxSum){
      maxSum =sum;
      maxNode=node;
    }
    return sum;

  }
