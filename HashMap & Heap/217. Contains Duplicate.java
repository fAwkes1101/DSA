class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n= nums.length;
        
        HashSet<Integer> vis = new HashSet<>();
        
        for(int val : nums){
            if(vis.contains(val)==true) return true;
            vis.add(val);
        }
        return false;
    }
}
