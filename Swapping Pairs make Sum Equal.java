class Solution {
    long findSwapValues(long a[], int n, long b[], int m) {
        long sumA = 0, sumB = 0;
        
        for (int i = 0; i < n; i++) {
            sumA += a[i];
        }
        for (int i = 0; i < m; i++) {
            sumB += b[i];
        }
        
        long diff = sumB - sumA;
        if (diff % 2 != 0) {
            return -1;
        }
        
        long target = diff / 2;
        
        HashSet<Long> setB = new HashSet<>();
        for (int i = 0; i < m; i++) {
            setB.add(b[i]);
        }
        
        for (int i = 0; i < n; i++) {
            long valA = a[i];
            long neededValB = valA + target;
            if (setB.contains(neededValB)) {
                return 1;
            }
        }
        
        return -1;
    }
}
