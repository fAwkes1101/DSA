
    public static int[] allIndices(int[] arr, int x, int idx, int count) {
        
        if(idx==arr.length){
            int[] base = new int[count];
            return base;
        }

        if(arr[idx]==x){
           int[] res = allIndices(arr, x ,idx+1, count+1 );
           res[count] = idx;
           return res;
       
       }
       else{
           int[] res = allIndices(arr, x, idx+1, count);
           return res;
       }


    }

}
