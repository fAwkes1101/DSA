class Solution {
    public int majorityElement(int[] nums) {
        int major = Integer.MIN_VALUE;
        int freq=0;
        
        for(int val : nums){
            if(major==val){
                freq++;
            }else{
                freq--;
                if(freq <=0 ){
                    major = val;
                    freq = 1;
                }
            }
        }
        return major;
    }
}
