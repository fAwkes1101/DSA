public static int[] inverse(int[] a){
   int[] b = new int[a.length];
   for(int i=0;i<a.length;i++){
    int j = a[i];
    b[j]=i;

   }
    return b;
  }
