class Solution {
     public static  boolean isSafe(int row,int col,char[][]border,int n){
        int i,j;
        for(j=col-1;j>=0;j--){
            if(border[row][j]=='Q'){
                return false;
            }
        }
        for(i=row-1,j=col-1;j>=0 && i>=0;i--,j--){
            if(border[i][j]=='Q'){
                return false;
            }
        }
         for(i=row+1,j=col-1;j>=0 && i<=n-1;i++,j--){
            if(border[i][j]=='Q'){
                return false;
            }
        }
        return true;
     }
     public static void solve(char[][] border,int col,int n, List<List<String>> result){
        if(col==n){
            List<String> list = new ArrayList<>();
            int i,j;
            for( i=0;i<=n-1;i++){
                String str="";
                for(j=0;j<=n-1;j++){
                    str=str+border[i][j];
                }
                list.add(str);
            }
            result.add(list);
        }
        else{
            for(int row=0;row<=n-1;row++){
                if(isSafe(row,col,border,n)==true){
                    border[row][col]='Q';
                    solve(border,col+1,n,result);
                    border[row][col]='.';
                }
            }
        }
     }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result =new ArrayList<>();
     
        char[][] border = new char[n][n];
        for(int i=0;i<=n-1;i++){
            for(int j=0;j<=n-1;j++){
                border[i][j]='.';
            }
        }
        solve(border,0,n,result);
        return result;
        
    }
}