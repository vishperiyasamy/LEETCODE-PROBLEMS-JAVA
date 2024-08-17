class Solution {
    public boolean isPalindrome(String s1){
        String res="";
        int i=0;
        int j=s1.length()-1;
        while(i<j){
            if(s1.charAt(i)!=s1.charAt(j)) return false;
            i++;
            j--;
        }
        // for(int i=s1.length()-1;i>=0;i--){
        //     res+=s1.charAt(i);
        // }
        // return res.equals(s1);
        return true;
    }
    public String shortestPalindrome(String s) {
        int n =s.length();
        String s1="";
          for (int i = n - 1; i >= 0; i--) {
            s1 = s.substring(0, i + 1);
            if (isPalindrome(s1)) {
                break; 
            }
          }
          String ans="";
         int n1=s1.length();
          for(int j=n-1;j>=n1;j--){
            ans=ans+s.charAt(j);
          }
        return ans+s;
    }
}