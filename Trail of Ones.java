class Solution {
    static final int MOD = 1000000007;
    static int numberOfConsecutiveOnes(int n) {
        if (n == 1) return 0;
        if (n == 2) return 1;
        
        long f1 = 2;  
        long f2 = 1;  
        long fn = 0;

        for (int i = 2; i <= n; i++) {
            fn = (f1 + f2) % MOD;
            f2 = f1;
            f1 = fn;
        }

        long totalBinaryStrings = modExp(2, n, MOD);
        long result = (totalBinaryStrings - fn + MOD) % MOD;

        return (int) result;
    }
    
     public static long modExp(int base, int exp, int mod) {
        long result = 1;
        long power = base % mod;

        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * power) % mod;
            }
            power = (power * power) % mod;
            exp >>= 1;
        }

        return result;
    }
}
