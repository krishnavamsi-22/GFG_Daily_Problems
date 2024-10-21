class Solution {

    public static int countgroup(int arr[]) {
        // Complete the function
        int res = 0;
        int count = 0;
        int n = arr.length;
        for(int i=0;i<arr.length;i++){
            count = count ^ arr[i];
        }
        if(count==0){
            res = (1 << (n - 1)) - 1;
        }
        return res%1000000007;
    }
}
