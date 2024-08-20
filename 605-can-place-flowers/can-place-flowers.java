class Solution 
{
    public boolean canPlaceFlowers(int[] f, int n) 
    {
        for(int i=0;i<f.length;i++)
        {
            if(i-1>=0&&i+1<f.length)
            {
                if(f[i-1]==0 && f[i]==0 && f[i+1]==0)
                {
                    f[i]=1;
                    n--;
                }
            }
            else if(i-1>=0)
            {
                 if(f[i-1]==0 && f[i]==0)
                {
                    f[i]=1;
                    n--;
                }
            }
            else if(i+1<f.length)
            {
                 if(f[i+1]==0 && f[i]==0)
                {
                    f[i]=1;
                    n--;
                }
            }
            else
            {
                if(f[i]!=1)n--;
            }
        }
        return n<=0;
    }
}