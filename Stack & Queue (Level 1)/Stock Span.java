 public static int[] solve(int[] arr){
   
   int[] stock = new int[arr.length];
   Stack <Integer> stk = new Stack<>();

   for(int i=0; i<arr.length; i++){
     while(stk.size()>0 && arr[i]>=arr[stk.peek()]){
       stk.pop();
     }
     if(stk.size()>0){
       stock[i]= i-stk.peek();
     }else{ 
        stock[i] =i+1;}
        stk.push(i);
   } 
 return stock;
}
