import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
 Scanner scn = new Scanner(System.in);
// MATRIX 1 INPUT
 int n1 = scn.nextInt();
 int m1 = scn.nextInt();
 int[][] arr1 =new int[n1][m1];
 for(int i=0; i<n1;i++){
     for(int j=0; j<m1; j++){

     arr1[i][j]= scn.nextInt();

     }
 }
  //MATRIX 2 INPUT
 int n2 = scn.nextInt();
 int m2 = scn.nextInt();
 int[][] arr2 =new int[n2][m2];
 for(int i=0; i<n2;i++){
     for(int j=0; j<m2; j++){
     arr2[i][j]= scn.nextInt();
     }
 }
  //INVALID ROW COLUMN CONDITION
 if(m1!=n2){
     System.out.println("Invalid input");
     return;
 }
 //RESULTANT MATRIX DECLARATION
int[][] res = new int[n1][m2];

//CALCULATIONS
for(int i=0 ;i<n1 ;i++){
    for(int j=0; j<m2; j++){ int result=0;
      for(int k=0; k<m1; k++){
         result += arr1[i][k] * arr2[k][j];
      }
       res[i][j]=result;
    }
}
  //PRINTING RESULTANAT MATRIX
for(int i=0;i<n1;i++){
    for(int j=0; j<m2; j++){
        System.out.print(res[i][j]+" ");
    }System.out.println();
}

 }

}
