class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
         int n=mat.length;
         int one=0;int max=0;int row=0;
         int m=mat[0].length;
         for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    count++;
                }
            }
            if(count>one){
                one=count;
                row=i;

            }
         }
            return new int[]{row,one};
         
    }
}