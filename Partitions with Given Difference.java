class Solution {
    static int mod = (int)(1e9 + 7);
    public static int countPartitions(int n, int d, int[] arr) {
         int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        if ((sum - d) < 0 || (sum - d) % 2 != 0)
            return 0;
        int s2 = (sum - d) / 2;
        int dp[][] = new int[n][s2 + 1];
         if (arr[0] == 0)
            dp[0][0] = 2; 
        else
            dp[0][0] = 1;
        if (arr[0] != 0 && arr[0] <= s2)
            dp[0][arr[0]] = 1;
        for (int i = 1; i < n; i++) {
            for (int tar = 0; tar <= s2; tar++) {
                int not = dp[i - 1][tar];
                int take = 0;
                if (tar >= arr[i]) {
                    take = dp[i - 1][tar - arr[i]];
                }
                dp[i][tar] = (not + take) % mod;
            }
        }
        return dp[n - 1][s2];
    }
}
