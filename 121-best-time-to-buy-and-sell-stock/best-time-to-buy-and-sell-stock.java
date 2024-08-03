class Solution {
    public int maxProfit(int[] prices) {
      int rs[] = new int[prices.length];
        rs[prices.length-1] = prices[prices.length-1];
        
        for(int i=rs.length-2;i>=0;i--)
        {
            if(prices[i]>rs[i+1])
            {
                rs[i] = prices[i];
            }
            else {
                rs[i] = rs[i+1];
            }
        }
        int max=0;
        for(int i=0;i<rs.length;i++)
        {
            if(rs[i]-prices[i]>max)
                max = rs[i]-prices[i];
        }
        return max;


        
    }
}