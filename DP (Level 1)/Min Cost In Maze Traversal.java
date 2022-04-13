import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                 arr[i][j]=scn.nextInt();
            }
        }

       int[][] dp = new int[n][m];
       

       for(int i = n-1;i >=0; i--){

           for(int j= m-1; j>=0;j--){
               if(i==n-1 && j==m-1) {dp[n-1][m-1] = arr[n-1][m-1];}
               
               else if(i+1<n && j+1<m){
                 dp[i][j]= Math.min(dp[i+1][j], dp[i][j+1])+ arr[i][j];
                   
               }
               else if(i+1>=n){
                 dp[i][j]= dp[i][j+1]+ arr[i][j];
               }else{
                   dp[i][j]= dp[i+1][j]+ arr[i][j];
               }
           }
       }

           System.out.println(dp[0][0]);

       
       
    }
    


}
