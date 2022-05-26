//Greedy O(N)->Time and O(1)->Space
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int curr=1;
        int max= 1;
        for(int i=1; i<nums.length; i++){
            
            if(nums[i]>nums[i-1]){
                curr++;
            }else{
                curr=1;
            }
            max= Math.max(curr, max);
        }
        return max;
    }
}
