class Solution {
    public static int rotateDelete(ArrayList<Integer> arr) {
        // code here
        int size= arr.size();
        int n = size;
        for(int k=1;k<=size/2;k++){
            int l=arr.get(n-1);
            arr.add(0,l);
            arr.remove(n-k);
            n--;
        }
        return arr.get(0);
    }
}
