class Solution {
    public static String oddEven(String s) {
        Hashtable<Character, Integer> freq = new Hashtable<>();
        int x = 0, y = 0;
        
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (freq.containsKey(c))
                freq.put(c, freq.get(c)+1);
            else
                freq.put(c, 1);
        }
        
        for (char c: freq.keySet()){
            if ((c + 1 - 'a')%2 == 1 && freq.get(c)%2 == 1)
                x += 1;
            else if ((c + 1 - 'a')%2 == 0 && freq.get(c)%2 == 0)
                y += 1;
        }
        
        return ((x+y)%2 == 1) ? "ODD" : "EVEN";
    }
}
