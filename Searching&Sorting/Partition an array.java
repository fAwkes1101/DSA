public static void partition(int[] arr, int pivot){
    int right = 0;
    int left = 0;
    while(right<arr.length){
      if(arr[right]>pivot){
        right++;

      }else{
        swap(arr,right, left);
        left++;
        right++;

      }
    }
    
  }
