import java.io.*;
import java.util.*;

public class Main{

public static int fib(int n){
    if(n==0|| n==1) return n;

    return fib(n-1)+fib(n-2);
}

public static int MemFib(int n, int[] dp){
     if(n==0||n==1){
         return n;
     }
     if(dp[n]!=-1){
         return dp[n];
     }

     int fibn1 = MemFib(n-1, dp);
     int fibn2 = MemFib(n-2, dp);

     dp[n] = fibn1+fibn2;

     return dp[n];
 }

 public static int TabFib(int n){
     int[] dp = new int[n+1];

     dp[0]=0; dp[1]=1;

     for(int i=2; i< dp.length; i++){
         dp[i]= dp[i-1]+dp[i-2];
     }
     return dp[n];
 }


public static void main(String[] args) throws Exception {
    // write your code here
     Scanner scn = new Scanner(System.in);

      int n = scn.nextInt();
      int[] dp = new int[n+1];
      
      Arrays.fill(dp, -1);
      System.out.println(fib(n));
      System.out.println(MemFib(n, dp));
      System.out.println(TabFib(n));


 }

}
