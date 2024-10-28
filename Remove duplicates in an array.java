class Solution {
    ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        int n = arr.length;
        LinkedHashSet<Integer> arr1 = new LinkedHashSet<>(n);
        for(int i:arr){
            arr1.add(i);
        }
        ArrayList<Integer> list = new ArrayList<>(arr1);
        
        return list;
    }
}
