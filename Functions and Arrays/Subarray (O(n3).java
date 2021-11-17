import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i]= scn.nextInt();
    }
    int rt=0;
  //loop 1
    for(int l = 0 ; l<n ; l++){
    rt=l;
      //loop 2
    while(rt<n){ 
    //loop 3
      for(int i=l ; i<=rt;i++ )   System.out.print(arr[i] +"\t");
        
    rt++;System.out.println();}
  }
    }
}
