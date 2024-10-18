class Solution {
    int getSingle(int arr[]) {
        // code here
        int a = 0;
        for(int i=0; i<arr.length; i++) a = a ^ arr[i];
        return a;
    }
}
