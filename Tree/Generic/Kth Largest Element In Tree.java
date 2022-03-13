static int floor;
  public static void ceilAndFloor(Node node, int data) {
      
       if(node.data<data){
        floor = Math.max(node.data,floor);
      }

    for(Node child: node.children){
       ceilAndFloor(child, data);
    }

  }
  public static int kthLargest(Node node, int k){
      int ans = Integer.MAX_VALUE;

      for(int i=1;i<=k; i++){
          floor = Integer.MIN_VALUE;
          ceilAndFloor(node,ans);
          ans =floor;
      }
      return ans;
  }
