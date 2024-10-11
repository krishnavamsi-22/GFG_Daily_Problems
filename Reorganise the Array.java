import java.util.HashSet;
class Solution {
    public List<Integer> rearrange(List<Integer> arr) {
        // Code here
        HashSet<Integer> hs = new HashSet<>();
        for(int it : arr) hs.add(it);
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            if(hs.contains(i)) l.add(i);
            else l.add(-1);
        }
        return l;
    }
    
}
