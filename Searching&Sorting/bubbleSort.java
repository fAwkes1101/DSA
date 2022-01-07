public static void bubbleSort(int[] arr) {
    
    for(int j =  arr.length-1; j>=0;j--){
    for(int i=0; i<j;i++){
        
        if(isSmaller(arr, i+1, i)){
            swap(arr, i+1, i);
        }
        
    }
    
    }
    
  }
