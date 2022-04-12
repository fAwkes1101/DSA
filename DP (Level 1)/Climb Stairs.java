import java.io.*;
import java.util.*;

public class Main {
    public static int countPaths(int n, int m){
        if(n==m) return 1;
        
        int nm1=0,nm2=0,nm3=0;
        if(n+1<=m){
         nm1 = countPaths(n+1,m);
        }
        if(n+2<=m){
           nm2 = countPaths(n+2,m);
        }
        if(n+3<=m){
           nm3 = countPaths(n+3,m);
                    }
       return nm1+nm2+nm3;
    }

     public static int MemocountPaths(int n, int m , int[] dp){
        if(n==m) return 1;
        if(n>m) return 0;
      
        if(dp[n] != -1){
           return dp[n];
        }
        int nm1=0,nm2=0,nm3=0;
        
           nm1 = countPaths(n+1,m);
           nm2 = countPaths(n+2,m);
           nm3 = countPaths(n+3,m);

       dp[n]= nm1+nm2+nm3;   
       return dp[n];
    }
    
    public static int TabcountPaths(int n){

       int[] dp = new int[n+1];
       dp[n]= 1;

       for(int i= n-1; i>=0;i--){

             dp[i]= dp[i+1];
          if(i+2<dp.length){
             dp[i]+=dp[i+2];
          }
          if(i+3<dp.length){
             dp[i]+= dp[i+3];
          }

       }
       return dp[0];
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
       
       int[] dp = new int[n+1];
       Arrays.fill(dp, -1);
       System.out.println(countPaths(0,n));
       System.out.println(MemocountPaths(0,n, dp));
       System.out.println(TabcountPaths(n));
    }



}
