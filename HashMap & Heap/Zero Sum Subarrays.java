
class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) 
    {
        HashMap<Long, Long> freq = new HashMap<>();
        freq.put(0l, 1l);
        
        long sum=0, count=0;
        for(long val : arr){
            sum += val;
            count += freq.getOrDefault(sum, 0l);
            
            freq.put(sum, freq.getOrDefault(sum,0l)+1l);
        }
        return count;
    }
}
