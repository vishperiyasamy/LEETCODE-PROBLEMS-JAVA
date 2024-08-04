class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n == 0) return false;
        //return Math.log(n)/Math.log(2)%1==0;
        //return Math.floor(Math.log(n) / Math.log(2)) == Math.ceil(Math.log(n) / Math.log(2));
        return n > 0 && (n & (n - 1)) == 0;  
    }
}