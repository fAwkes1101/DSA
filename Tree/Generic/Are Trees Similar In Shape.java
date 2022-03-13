public static boolean areSimilar(Node n1, Node n2) {
    if(n1.children.size()!=n2.children.size()){
      return false;
    }

    for(int i=0; i<n1.children.size();i++){
      boolean similarChild= areSimilar(n1.children.get(i),n2.children.get(i));

      if(!similarChild){
        return false;
      }
    }
    return true;
  }
