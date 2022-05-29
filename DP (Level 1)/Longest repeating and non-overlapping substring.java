 static String longestSubstring(String s, int N) {
       int[][] dp = new int[N+1][N+1];
       int len=0, idx=s.length();
       for(int i= N-1; i>=0; i--){
           for(int j= N-1; j>=0; j--){
               char ch1= s.charAt(i);
               char ch2= s.charAt(j);
               
               if(ch1==ch2 && i!=j){
                   dp[i][j]= 1+ dp[i+1][j+1];
               }
               if(Math.min(i, j)+ dp[i][j] >= Math.max(i, j)){
                   dp[i][j]=0;
               } 
              if(dp[i][j] >= len){
                  idx=i;
                  len= dp[i][j];
              }
           }
       }
       if(len==0) return "-1";
       return s.substring(idx, idx+len);
    }
