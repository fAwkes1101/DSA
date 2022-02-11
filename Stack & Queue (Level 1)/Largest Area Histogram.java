import java.io.*;
import java.util.*;

public class Main{

public static int[] nsr(int arr[]){

   int[] nsr = new int[arr.length];
   Arrays.fill(nsr, arr.length);
   Stack<Integer> stk = new Stack<>();

   for(int i= arr.length-1; i>=0;i--){
      while(stk.size()>0 && arr[i]<=arr[stk.peek()]){
         stk.pop();
      }
      if(stk.size()>0)
         nsr[i]= stk.peek();
         stk.push(i);
      
      
   }return nsr;

}
public static int[] nsl(int arr[]){
    int[] nsl = new int[arr.length];
    Arrays.fill(nsl,-1);
    Stack<Integer> stk = new Stack<>();
    
    for(int i=0;i<arr.length;i++){
        while(stk.size()>0 && arr[i]<=arr[stk.peek()]){
           stk.pop();
        }
        if(stk.size()>0)
           nsl[i]=stk.peek();
           stk.push(i);
        
      
}return nsl;
}

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
   int [] nsl = nsl(a);
   int [] nsr = nsr(a);

   int maxArea = 0;
   for(int i=0 ;i<a.length;i++){
      int currArea = (nsr[i]-nsl[i]-1)*a[i];
      maxArea = Math.max(currArea, maxArea);
   }
   System.out.println(maxArea);
 }
}
