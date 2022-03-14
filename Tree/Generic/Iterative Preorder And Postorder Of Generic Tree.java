  public static class Pair{
    Node node;
    int state;

    Pair(Node node,int state){
      this.state= state;
      this.node = node;
    }
  }
  public static void IterativePreandPostOrder(Node node) {
      Stack<Pair> stk = new Stack<>();

      Pair rootPair = new Pair(node, -1);
      stk.push(rootPair);
      
      ArrayList<Integer> preOrder= new ArrayList<>();
      ArrayList<Integer> postOrder= new ArrayList<>();

      while(stk.size()>0){
         Pair parent =stk.peek();
        if(parent.state==-1){
          preOrder.add(parent.node.data);
          parent.state++;
        }
        else if(parent.state== parent.node.children.size()){
          postOrder.add(parent.node.data);
          stk.pop();
        }
        else{
          Pair child = new Pair(parent.node.children.get(parent.state),-1);
          stk.push(child);
          parent.state++;
        }
      


      }
      for(Integer data: preOrder){
      System.out.print(data+" ");
      }
      System.out.println();
      for(Integer data: postOrder){
      System.out.print(data+" ");
      }
      

  }
