import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m =scn. nextInt();
        int[][] arr= new int[n][m];
        for(int i=0;i<n;i++){
         for(int j=0;j<m;j++){
            arr[i][j] = scn.nextInt();
         }
        }
    int total =n+m-1;
        int count=0;
       for(int k=0;k<n;k++){
        for(int i=k, j=0; i>=0&&j<m;i--,j++){     
                System.out.print(arr[i][j]+" ");
        }            
           System.out.println();
           count++;
      }
        count =total-count;
        for(int k=1;k<=count;k++){
            for(int i=n-1, j=k; j<m &&i>=0;j++,i--){
                System.out.print(arr[i][j]+" ");
            }
           System.out.println(); 
        }
   
    
    
    }
 
}
