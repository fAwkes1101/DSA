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
