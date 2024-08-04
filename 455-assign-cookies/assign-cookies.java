class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int n=g.length,m=s.length;
        for(int j=0;j<m;j++){
            if(i<n && g[i] <= s[j]){
                i++;
            }
        }
            
        return i;
    }
}