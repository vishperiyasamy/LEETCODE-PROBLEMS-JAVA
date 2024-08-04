class Solution {
    public boolean isUgly(int n) {
      /*  if(n%2==0 && n%3==0 && n%5==0){
            return true;
        }
        else if(n%2==0 || n%3==0 || n%5==0){
           return true;
        }
        else{
             return false;
        }*/int num=n;
    if (num <= 0) return false;
    while (num % 2 == 0) num /= 2;
    while (num % 3 == 0) num /= 3;
    while (num % 5 == 0) num /= 5;
    return num == 1;
        
    }
}