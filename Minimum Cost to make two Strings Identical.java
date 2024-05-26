class Solution {
    public int findMinCost(String x, String y, int costX, int costY) {
        int [][] dp = new int[x.length()+1][y.length()+1];
        for(int i=dp.length-1; i>=0; i--){
            for(int j=dp[0].length-1; j>=0; j--){
                if(i == dp.length-1 && j == dp[0].length-1){
                    dp[i][j] = 0;
                }
                else if(i == dp.length-1){
                    dp[i][j] = 0;
                }
                else if(j == dp[0].length-1){
                    dp[i][j] = 0;
                }
                else if(x.charAt(i) == y.charAt(j)){
                    dp[i][j] = 1 + dp[i+1][j+1];
                }
                else{
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j+1]);
                }
            }
        }
        int lcs = dp[0][0];
        int x1 = x.length()-lcs;
        int y1 = y.length()-lcs;
        int cost = x1*costX + y1*costY;
        return cost;
    }
}

