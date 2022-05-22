//
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[] arr = new int[n];
        for(int i=0; i<n ;i++){
            arr[i]= scn.nextInt();
        }
        
        int target = scn.nextInt();

        boolean[] dp = new boolean[target+1];
        dp[0]=true;

        for(int i=1; i<n; i++){
            boolean[] newdp = new boolean[target+1];
            for(int j=0; j<target+1; j++){
               boolean no = dp[j];
               boolean yes = (j>=arr[i-1]) ? dp[j-arr[i-1]] : false;
               newdp[j]= yes||no;
            }
            dp = newdp;
        }
      
        System.out.println(dp[target]);
    }
}
