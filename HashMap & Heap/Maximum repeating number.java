class Solution {
    int maxRepeating(int[] nums, int n, int k) {
        // code here
        for(int i=0; i<n; i++){
            int val = nums[i]% (n+1);
            nums[val] += n+1 ;
            
        }
        int max= nums[0]/(n+1), maxNum=0;
        
        for(int i=0; i<n ; i++){
            int val =nums[i]/(n+1) ;
           if(val> max){
               max = val;
               maxNum =i;
           }
        }
        return maxNum;
    }
}
