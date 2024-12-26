
class Solution {
    boolean twoSum(int arr[], int x) {
        // code here
        int n = arr.length;
        HashSet<Integer> hash = new HashSet<>();
        for(int i = 0;i<n;i++){
            int temp = x-arr[i];
            if(hash.contains(temp)){
                return true;
            }
            hash.add(arr[i]);
            
        }
        return false;
    }
}
