class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int rf = 0;
        int sc = 0;
        int sr = 0;
        int er = matrix.length - 1;
        int ec = matrix[0].length - 1;
        while (sr <= er && sc <= ec) {
            if (rf == 0) {
                for (int i = sc; i <= ec; i++) {
                    ans.add(matrix[sr][i]);
                }
                sr = sr + 1;
                rf++;
            } else if (rf == 1) {
                for (int i = sr; i <= er; i++) {
                    ans.add(matrix[i][ec]);
                }
                ec = ec - 1;
                rf++;
            } else if (rf == 2) {
                for (int i = ec; i >= sc; i--) {
                    ans.add(matrix[er][i]);
                }
                er = er - 1;
                rf++;
            } else if (rf == 3) {
                for (int i = er; i >= sr; i--) {
                    ans.add(matrix[i][sc]);
                }
                sc = sc + 1;
                rf = 0;
            }
        }
     return ans;
    }
}