class Solution {
    public int pairWithMaxSum(int[] arr) {
        // code here
        int n = arr.length;
        if(n<2){
            return -1;
        }
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            int currSum = arr[i]+arr[i+1];
            if(currSum>maxSum){
                maxSum = currSum;
            }
        }
        return maxSum;
    }
}
