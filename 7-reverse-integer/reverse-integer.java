class Solution {
    public int reverse(int x) {
      int n =Math.abs(x);
      long rev=0;
      while(n>0){
          long rem=n%10;
          rev = rev*10+rem;
          n/=10;
          if(rev>=Integer.MAX_VALUE) return 0;
      }  
      if(x>0) rev = rev;
      else rev=(-1*rev);
      return (int)rev;
    }
}