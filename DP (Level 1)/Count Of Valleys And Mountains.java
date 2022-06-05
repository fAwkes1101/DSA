import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
     Scanner scn = new Scanner(System.in);

     int n= scn.nextInt();
     int[] dp= new int[n+1];

     dp[0]=dp[1]=1;

     for(int i=2; i<=n; i++){
         for(int j =0; j<i; j++){
             if(i-j-1>=0)
             dp[i] += dp[j] * dp[i-j-1];
         }
     }
     System.out.println(dp[n]);
 }

}
