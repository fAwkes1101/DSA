class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n; i++){
            int val = nums[i] %(n+1); //When ith index value is update by n+1 and our we are visiting ith                                           //index later then we have to get the original value 
            if(val<n) nums[val] += n+1;
        }
        
        for(int i=0; i<n ;i++){
            if(nums[i]<n+1){
                return i;
            }
        }
        return n; // if 0 to n-1 number was not missing and WKT given size is 1 less than total number
                  // so missing would be nth number
    }
}
