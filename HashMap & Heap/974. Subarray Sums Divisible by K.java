class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        
        int count=0, sum=0;
        for(int val: nums){
            sum += val;
            int remainder = (sum % k +k)%k;
            count += hm.getOrDefault(remainder , 0);
            hm.put(remainder, hm.getOrDefault(remainder , 0)+1);
        }
        return count;
    }
}
