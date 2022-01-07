

  public static void selectionSort(int[] arr) {
    
    for(int i=0; i<arr.length-1;i++){
        int idx=i;
        for(int j = i+1 ;j<arr.length;j++){
            if(isSmaller(arr,j,idx)){
                idx = j;
            }
            
           
        }
         swap(arr, i, idx);
        
    }
  }

  
