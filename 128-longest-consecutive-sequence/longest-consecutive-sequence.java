class Solution {
    public int longestConsecutive(int[] a) {
        if(a.length==0) return 0;
        Arrays.sort(a);
        int n=a.length;
        int c=1;
        int max=1;
        for(int i=0;i<n-1;i++)
         {
            if(a[i]+1==a[i+1])
            {
                c++;
                if(max<c)
                {
                    max=c;
                }
            }
            else if (a[i]!=a[i+1])
            {
                c=1;
            }
        }
        return max;
    }
}