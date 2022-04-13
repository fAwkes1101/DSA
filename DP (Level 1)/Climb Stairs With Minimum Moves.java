import java.util.*;

public class Main {

  public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);

     int n = scn.nextInt();
     int[] arr =  new int[n];
     int[] dp = new int[n];
     Arrays.fill(dp,-1);

     for(int i = 0 ; i<n;i++){
         arr[i]= scn.nextInt();
     }
   
     System.out.println(csmmMemo(0, arr, dp));
    
     System.out.println(csmmTab(arr));


  }
  // Memoisation
  public static int csmmMemo(int src, int[] arr, int[] dp){
     if(src>arr.length-1) return Integer.MAX_VALUE;
     
     if(src==arr.length-1){
         return 0;
     }
     if(dp[src]!=-1){
         return dp[src];
     }
     int minPath= Integer.MAX_VALUE;
     for(int jump=1; jump<=arr[src]; jump++){
         int xi = csmmMemo(src+jump, arr, dp);

         if(xi!=Integer.MAX_VALUE)
         minPath = Math.min(minPath, xi+1);
        
     }

     dp[src]= minPath; 

     return minPath;

  }

  public static int csmmTab(int[] arr){
      int n = arr.length;
      int[] dp = new int[n];
      
      dp[n-1]= 0;

      for(int i= n-2; i>=0;i--){
          int minPath = Integer.MAX_VALUE;

          for(int jumps =1 ; jumps<= arr[i]; jumps++){
              
              if(i+jumps<n && dp[i+jumps]!=Integer.MAX_VALUE)
              minPath = Math.min(minPath, dp[i+jumps]+1);

          }
          dp[i] = minPath;
      }

    return dp[0];

  }
}
