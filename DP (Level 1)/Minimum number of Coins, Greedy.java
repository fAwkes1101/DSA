//Minimum number of Coins, Greedy solution possible as Indian coin system 

class Solution{
    
    static List<Integer> minPartition(int target)
    {
      int[] coins= { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };
      ArrayList<Integer> ans= new ArrayList<>();
      
      for(int i= coins.length-1; i>=0; i-- ){
         while(target-coins[i] >= 0){
             ans.add(coins[i]);
             target -= coins[i];
         }
         if(target==0) break;
          
      }
       return  ans;
    }
}
