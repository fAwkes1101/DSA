class Solution {
    int kadane(int C, int[] arr){
        int currSum=0, maxSum= Integer.MIN_VALUE;
        
        for(int i=0; i<C; i++){
            currSum= Math.max(currSum+arr[i], arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
    int maximumSumRectangle(int R, int C, int M[][]) {
        // code here
        int maxSum= Integer.MIN_VALUE;
        for(int i=0; i<R ;i++){
            int[] arr = new int[C];
            for(int j=i ;j<R; j++){
                for(int k=0; k<C; k++){
                    arr[k] += M[j][k];
                }
             maxSum = Math.max(maxSum, kadane(C, arr));
            }
        }
        return maxSum;
    }
};
