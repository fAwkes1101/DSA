class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Boolean> hm= new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            hm.put(nums[i], true);
        }
        int maxChain=0;
        int startPoint=0;
        for(Integer key: hm.keySet()){
            if(hm.containsKey(key-1)==false){
                int length=1;
                while(hm.containsKey(key+length)==true){
                    length++;
                }
                if(length>maxChain){
                    maxChain = length;
                    startPoint =key;
                }
            }
        }
        return maxChain;
        
        
    }
}
