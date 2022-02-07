// Approach 1: left to right traveral in given array while checking the element can be ans of prev left ele in stack
public static int[] solve(int[] arr){
    int[] nge = new int[arr.length];

    Stack<Integer> stk = new Stack<>();
    Arrays.fill(nge, -1);

    for(int i=0; i<arr.length; i++){
      while(stk.size()>0 && arr[stk.peek()]<arr[i]){
        nge[stk.pop()] = arr[i];
      }
      stk.push(i);
    }
    return nge;
  
 }

}

// Approach 2: right to left traversal in given array, getting its own greater while traversing
 public static int[] solve(int[] arr){
    int[] nge = new int[arr.length];

    Stack<Integer> stk = new Stack<>();
    Arrays.fill(nge, -1);

    for(int i=arr.length-1; i>=0; i--){
      while(stk.size()>0 && arr[i]>=arr[stk.peek()]){
        stk.pop();
      }
      if(stk.size()>0){
        nge[i]= arr[stk.peek()];
        
      }
      stk.push(i);
    }
    return nge;
  
 }

}
