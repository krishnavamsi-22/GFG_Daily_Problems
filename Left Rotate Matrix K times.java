class Solution {
    int[][] rotateMatrix(int k, int mat[][]) {
        // code here
        
        int m = mat[0].length;
        int n = mat.length;
        int k1 = k%m;
        int[][] result = new int[n][m];
        
        for(int i = 0;i<n;i++){
            for(int j=0;j<m;j++){
                int val = (j - k1 + m) % m;
                result[i][val] = mat[i][j];
            }
        }
        return result;
    }
}
