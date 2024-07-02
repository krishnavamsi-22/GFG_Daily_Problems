class Solution {
    public boolean compute(Node root) {
        StringBuilder sb = new StringBuilder();
        Node temp = root;
        while (temp != null) {
            sb.append(temp.data);
            temp = temp.next;
        }
        return isPalin(sb.toString());
    }

    public boolean isPalin(String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
