//1. Using Deque
import java.io.*;
import java.util.*;

public class Main {


  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = scn.nextInt();
    }
    int k = scn.nextInt();
    
    int[] res = new int[a.length-k+1];
    Deque<Integer> q = new ArrayDeque<>();
    
    for(int i=0; i<a.length ;i++){
        //checking for window of k size
        if(q.size()>0 && q.getFirst()<= i-k){
            q.removeFirst();
        }
        while(q.size()>0 && a[q.getLast()]<a[i]){
            q.removeLast();
        }
        q.addLast(i);
        if(i>=k-1){
            res[i-k+1]=a[q.getFirst()];
        }
    }
    for(int i=0; i<res.length; i++){
        System.out.println(res[i]);
    }
  }
}

//2.Using Stack-> next greater element concept
import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
       arr[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    // code

    // nge begin
   int[] nge= new int[arr.length];
   Stack<Integer> st = new Stack<>();
   st.push(arr.length-1); 
   nge[arr.length-1] = arr.length;
   
   for(int i=arr.length-2; i>=0; i--){
       while(st.size()>0 && arr[i]>=arr[st.peek()]){
           st.pop();
       }
       if(st.size()==0){
           nge[i]=arr.length; // sabko pop kra diya apne se phle wale elements ko to hamara next greater exit nhi karta
       }
       else{
           nge[i]= st.peek();
       }       
       st.push(i);
   }
   
   int j=0; //nge in window pe jump lagaega
   for(int i=0; i<=arr.length-k;i++){
       if(j<i){
           j=i;
       }
       
       while(nge[j]<i+k){
           j = nge[j];
       }
       System.out.println(arr[j]);
   }
   
 }
}
                        
                                
                                
