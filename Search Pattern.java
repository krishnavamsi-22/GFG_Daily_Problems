class Solution {

    ArrayList<Integer> search(String pat, String txt) {
        // your code here
         ArrayList<Integer> arr = new ArrayList<>();
        int length = pat.length() - 1;
        for (int i = 0; i < txt.length() - length; i++) {
            if (txt.substring(i,(i + pat.length())).equals(pat)) {
                arr.add(i);
            }
        }
        return arr;
    }
}
