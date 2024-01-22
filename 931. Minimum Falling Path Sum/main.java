class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i=1; i<row; i++){
            for(int j=0; j<col;j++){
                if(j==0){
                    matrix[i][j] = matrix[i][j] + Math.min(matrix[i-1][j], matrix[i-1][j+1]);
                }else if (j == col - 1){
                    matrix[i][j] = matrix[i][j] + Math.min(matrix[i-1][j], matrix[i-1][j-1]);
                }else{
                    matrix[i][j] = matrix[i][j] + Math.min(Math.min(matrix[i-1][j], matrix[i-1][j+1]), matrix[i-1][j-1]);
                }
            }
        }
        int minPath = Integer.MAX_VALUE;
        for(int j=0; j<col; j++){
            if (matrix[row-1][j] < minPath){
                minPath = matrix[row-1][j];
            }
        }
        return minPath;

        
    }
}