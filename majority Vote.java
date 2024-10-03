class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(List<Integer> nums) {
        // Your code goes here.
        
        Map<Integer, Integer> freqMap = new HashMap<>();
        
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        
        int k = nums.size()/3;
        TreeSet<Integer> res = new TreeSet<>();
        
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if(entry.getValue()>k){
                res.add(entry.getKey());
            }
        }
        List<Integer> res1 = new ArrayList<>(res);
        if(res.size()==0){
            return new ArrayList<>(Collections.singletonList(-1));
        }
        return res1;
    }
}
