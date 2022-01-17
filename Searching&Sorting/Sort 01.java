public static void sort01(int[] arr){
   int right = 0;
    int left = 0;
    while(right<arr.length){
      if(arr[right]>0){
        right++;

      }else{
        swap(arr,right, left);
        left++;
        right++;

      }
    }
    
  }
