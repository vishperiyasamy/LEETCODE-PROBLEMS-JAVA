class Solution {
    public void setZeroes(int[][] matrix) {
        int row= matrix.length;
        int col=matrix[0].length;
        int[] rows = new int[row];
        int[] cols = new int[col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    rows[i]=1;
                    cols[j]=1;
                }
            }
        }
           for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(rows[i]==1|| cols[j]==1){
                 matrix[i][j]=0;
                }
            }
        }
    }
}