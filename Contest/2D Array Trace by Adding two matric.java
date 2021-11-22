import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) { Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
 int c = scn.nextInt();
 int[][] arr1 =new int[r][c];
 for(int i=0; i<r;i++){
     for(int j=0; j<c; j++){

     arr1[i][j]= scn.nextInt();

     }
 }
  int result=0;
 int[][] arr2 =new int[r][c];
 for(int i=0; i<r;i++){
     for(int j=0; j<c; j++){
     arr2[i][j]= scn.nextInt();
     }
    }
  for(int i=0,j=0;i<r &&j<c;i++,j++){
      
         result += arr1[i][j] +arr2[i][j];
          
      
  }
        
   System.out.println(result);     
        
        
}
}
