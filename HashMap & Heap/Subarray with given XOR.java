public class Solution {
    public int solve(int[] A, int B) {
          HashMap<Integer, Integer> freq = new HashMap<>();
   freq.put(0, 1);
   
   int count = 0, pref = 0;
   for(int val : A){
   pref = pref ^ val;
   count = count + freq.getOrDefault((pref ^ B), 0);
   freq.put(pref, freq.getOrDefault(pref, 0) +1);
  }
  return count;
    }
}
