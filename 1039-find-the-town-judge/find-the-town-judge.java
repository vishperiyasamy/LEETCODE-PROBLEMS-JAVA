class Solution {
    public int findJudge(int n, int[][] trust) {
        if(trust.length==0 && n==1) return 1;
          if(trust.length==0 && n==2) return -1;
        int[] trust1=new int[n+1];
        for(int i=0;i<trust.length;i++){
            trust1[trust[i][1]]+=1;
            trust1[trust[i][0]]-=1;
        }
         for(int i=0;i<trust1.length;i++){
            if(trust1[i]==n-1){
                return i;
            }
         }
        return -1;
        
    }
}