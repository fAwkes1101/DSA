class Solution {
    public int subarraySum(int[] nums, int k) {
       int n = nums.length;
        
       long sum=0;
       int count=0;
       HashMap<Long, Integer> hm = new HashMap<>();
       hm.put(0l,1);
       for(int val: nums){
           sum += val;
           
           count = count + hm.getOrDefault(sum-k, 0);
           hm.put(sum, hm.getOrDefault(sum, 0)+1);
           
       }
      return count;
    }
}
