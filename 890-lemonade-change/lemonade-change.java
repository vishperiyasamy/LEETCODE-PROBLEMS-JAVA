class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fiveCount = 0, tenCount = 0;
        
        for (int bill : bills) {
            if (bill == 5) {
                fiveCount++;
            } else if (bill == 10) {
                fiveCount--;
                tenCount++;
            } else if (tenCount >0) {
                    tenCount--;
                    fiveCount--;
                } else  {
                    fiveCount -= 3;
                }
          if(fiveCount<0)
            return false;
          
        }
        return true;
    }
}