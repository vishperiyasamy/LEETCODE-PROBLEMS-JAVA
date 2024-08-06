class Solution {
    Map<Integer,Integer> dp = new HashMap<>();
    public int tribonacci(int n) {

        if(n==0) return 0;
        if(n==1 || n==2) return 1;
        if(dp.containsKey(n)) return dp.get(n);
        int n1=tribonacci(n-1)+ tribonacci(n-2)+tribonacci(n-3);
        dp.put(n,n1);
        return n1;    
    }
}