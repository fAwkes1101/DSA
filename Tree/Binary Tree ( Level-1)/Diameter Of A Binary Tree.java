 //Travel and change
 
 public static int dia = Integer.MIN_VALUE;
  public static int diameter1(Node node) {
    if(node==null) return -1;

    int leftheight = diameter1(node.left);
    int rightheight = diameter1(node.right);
    
    int th = Math.max(leftheight,rightheight)+1;
    dia = Math.max(dia, leftheight+ rightheight +2);
    
    return th;
  }
