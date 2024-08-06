class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans=0;
        int fullbottle=numBottles;
        int emptyBottle=0;
        while(fullbottle>0){
            ans+=fullbottle;

            emptyBottle+=fullbottle;
  
           fullbottle=emptyBottle/numExchange;

            emptyBottle=emptyBottle%numExchange;

        }
        return ans;
        
    }
}