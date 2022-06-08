class Solution {
    public int maxProduct(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int minProd = 1;
        int maxProd = 1;
        
        for(int i=0; i<nums.length; i++){
            int newMax = Math.max(nums[i], Math.max(maxProd*nums[i], minProd*nums[i]));
            int newMin = Math.min(nums[i], Math.min(minProd*nums[i], maxProd*nums[i]));
            
            minProd = newMin;
            maxProd = newMax;
            ans = Math.max(ans, maxProd);
        }
        return ans;
    }
}
