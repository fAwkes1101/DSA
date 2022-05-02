class Solution {
    public int nthUglyNumber(int n) {
        
        int ptr2=1, ptr3=1, ptr5=1;
        ArrayList<Integer> ugly= new ArrayList<>();
        ugly.add(-1);
        ugly.add(1);
        
        for(int i=2; i<n+1; i++){
            int a = ugly.get(ptr2)*2;
            int b = ugly.get(ptr3)*3;
            int c = ugly.get(ptr5)*5;
            
            int min =Math.min(a,Math.min(b, c));
            ugly.add(min);
            
            if(min==a) ptr2++;
            if(min==b) ptr3++;
            if(min==c) ptr5++;
        }
        
            return ugly.get(n);
        }

}
