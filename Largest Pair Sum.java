
class Solution {
    public static int pairsum(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length-1]+arr[arr.length-2];
        // code here
    }
}
