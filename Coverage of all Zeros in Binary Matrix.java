class Solution {
    public int findCoverage(int[][] matrix) {
        // code here
        int count=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    if(j>0 && matrix[i][j-1]==1)
                     count++;
                     
                    if(j < matrix[0].length-1 && matrix[i][j+1]==1)
                       count++;
                     
                    if(i>0 && matrix[i-1][j]==1)
                      count++;
                      
                    if(i<matrix.length-1 && matrix[i+1][j]==1)
                      count++;
                  }
            }
        }
        return count;
    }
}
