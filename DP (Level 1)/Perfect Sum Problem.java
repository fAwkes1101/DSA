   //Memoisation O(N*sum)Time, O(n*sum)Space, RCS= O(N)
   public int memo(int[] arr, int index, int sum, int[][]dp){
        if(index== arr.length){
            if(sum==0) return 1;
            return 0;
        }
        if(dp[index][sum]!=-1) return dp[index][sum];
        int yes = (sum-arr[index] >=0) ? memo(arr, index+1, sum-arr[index], dp): 0;
        int no = memo(arr, index+1, sum, dp);
        
        return dp[index][sum]=(yes+no)%1000000007;
    }
	public int perfectSum(int arr[],int n, int sum) 
	{   int[][] dp = new int[n+1][sum+1];
	    for(int i=0; i<n+1; i++){
	        for(int j=0; j<sum+1; j++){
	            dp[i][j]=-1;
	        }
	    }
	    return memo(arr, 0, sum, dp);
	} 

//Tabulation O(N*sum)Time, O(n*sum)Space
public int perfectSum(int arr[],int n, int sum) 
	{   int[][] dp = new int[n+1][sum+1];
	    dp[0][0]=1;
	    
	    for(int i=1; i<=n; i++){
	        for(int j=0; j<=sum; j++){
	            int no = dp[i-1][j];
	            int yes = (j>=arr[i-1]) ? dp[i-1][j -arr[i-1]]: 0;
	            dp[i][j] = (no+yes) % 1000000007;
	        }
	    }
	    return dp[n][sum];
	} 
//Space Optimisation O(N*sum)Time, O(sum)Space
public int perfectSum(int arr[],int n, int sum) 
	{   int[] dp = new int[sum+1];
	    dp[0]=1;
	    
	    for(int i=1; i<=n; i++){
	         int[] newDp = new int[sum+1];
	        for(int j=0; j<=sum; j++){
     
	            int no = dp[j];
	            int yes = (j>=arr[i-1]) ? dp[j -arr[i-1]]: 0;
	            newDp[j] = (no+yes) % 1000000007;
	        }
	        dp= newDp;
	    }
	    return dp[sum];
	} 

