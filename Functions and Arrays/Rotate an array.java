 public static void swap(int[] arr, int left, int right){

    int temp = arr[left];
    arr [left]= arr[right];
    arr[right]=temp;
  }
  public static void reverse(int[] a, int left, int right){
    
    while(left<right){
      swap(a,left,right);
      left++; right--;
    }
  }  
    public static void rotate(int[] a, int k){
        int n = a.length;
       k= k % n;
       
       if(k<0){ 
          k =k + n ;
       }
     
       
        reverse(a,0,n-k-1);
        reverse(a, n-k,n-1);
        reverse(a, 0,n-1);
    }
