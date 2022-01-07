public static void insertionSort(int[] arr) {
    for(int i=1; i<arr.length ;i++){
        for(int j=i;j>0;j--){
            if(isGreater(arr,j-1,j)){
                swap(arr,j-1,j);
            }
            else{
                break;
            }
        }
    }
}
