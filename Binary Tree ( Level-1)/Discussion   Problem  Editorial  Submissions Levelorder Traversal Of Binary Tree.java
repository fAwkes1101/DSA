public static void levelOrder(Node node) {
    Queue<Node> q = new ArrayDeque<>();
     
     q.add(node);
     
     while(q.size()>0){
       int counter = q.size();

       for(int i= 0; i<counter; i++){
         Node par = q.remove();
       
      
        System.out.print(par.data+" ");
        
        if(par.left!=null){
          q.add(par.left);
        }
        if(par.right!=null){
          q.add(par.right);
        }
    
      }
      System.out.println();


     }

  }

  
