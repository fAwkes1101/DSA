class GfG
{
    int maxLen(int arr[], int n)
    {
        long sum = 0l;
        int max = 0;
        HashMap<Long, Integer> hm = new HashMap<>();
        hm.put(0l, -1);
        
        for(int i=0; i<n; i++){
            sum += arr[i];
            if(hm.containsKey(sum) == false){
                hm.put(sum,i);
            }
            
            max = Math.max(max, i-hm.get(sum));
            
        }
        return max;
    }
}
