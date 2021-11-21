import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
          Scanner scn = new Scanner(System.in);
          int n = scn.nextInt();
          int[][] arr= new int[n][n]; 
    for(int i=0;i<n; i++){
        for(int j=0;j<n;j++){
            arr[i][j]= scn.nextInt();
        }
    }
for(int i=0 ; i<n ; i++){
   int min = Integer.MAX_VALUE; 
   int max =Integer.MIN_VALUE;
   int col =0; 
for(int j = 0; j<n ; j++){ //FINDING MIN IN ROW
 if(arr[i][j]<min){
   min =arr[i][j];
   col =j;
 }
}
for(int k=0 ;k<n ; k++){ //FINDING MAX IN THE MINIMUM VALUE'S ROW
  if(arr[k][col]>max){
    max=arr[k][col];
  }
}

if(max==min){
    System.out.println(arr[i][col]);
    return;
  }
}
System.out.println("Invalid input");
    
    }

}
