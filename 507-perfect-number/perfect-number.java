class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        int n=num;
        for(int i=1;i<=num/2;i++){
        if(num%i==0){
            sum+=i;
        }
        }
        if(n==sum){
            return true;
        }
        return false;
    }
}