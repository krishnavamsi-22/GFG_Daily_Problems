
class Solution {
    public int kthMissing(int[] arr, int k) {
        // code here
        int l = 0;
        int h = arr.length-1;
        int res = arr.length+k;
        while(l<=h){
            int m = l+(h-l)/2;
            if(arr[m]>m+k){
                res = m+k;
                h = m-1;
            }else{
                l = m+1;
            }
        }
        return res;
    }
}
