class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] ptr = new int[primes.length];
        ArrayList<Integer> ugly = new ArrayList<>();
        ugly.add(1); 
        
        
        for(int i=1; i<n; i++){
            int min= Integer.MAX_VALUE;
            for(int j=0; j<ptr.length; j++){
                min = Math.min(min, ugly.get(ptr[j])*primes[j]);           
            }
            
            for(int inc=0; inc<ptr.length; inc++){
                if(min== ugly.get(ptr[inc])*primes[inc]){
                    ptr[inc]++;
                }
            }
            ugly.add(min);
        }
        return ugly.get(n-1);
    }
}
