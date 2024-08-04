class Solution {
    int count=0;
    public void solve(int[][] grid,int n,int m,int row,int col){
        if(row==-1 || row==n || col==-1 || col==m || grid[row][col]==-1){
            return ;
        }
        if(grid[row][col]==2){
           for(int i=0;i<=n-1;i++){
            for(int j=0;j<=m-1;j++){
                if(grid[i][j]==0){
                    return;
                }
            }
           }
           count++;
           return;
        }
        else{
           int temp=grid[row][col];
           grid[row][col]=-1;
           solve(grid,n,m,row,col+1);
           solve(grid,n,m,row+1,col);
           solve(grid,n,m,row,col-1);
           solve(grid,n,m,row-1,col);
           grid[row][col]=temp;
        }
    }
    public int uniquePathsIII(int[][] grid) {
        int row=0;
        int col=0;
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<=n-1;i++){
            for(int j=0;j<=m-1;j++){
                if(grid[i][j]==1){
                    row=i;
                    col=j;
                    break;
                }
            }
        }
        solve(grid,n,m,row,col);
        return count;
    }
}