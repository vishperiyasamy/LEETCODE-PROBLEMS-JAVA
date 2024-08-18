class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);int c=0;
        int n1=costs.length;
        for(int n:costs){
            coins-=n;
            if(coins>=0){
                c++;
            }
            else{
                break;
            }
        }
        return c;
    }
}