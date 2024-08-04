class Solution {
    public boolean detectCapitalUse(String word) {
        char ch =word.charAt(0);
        int s=0;
        int l=0;
        int len=word.length();
        for(int i=0;i<word.length();i++){
           ch=word.charAt(i);
           if(ch>='a'&&ch<='z') s++;
           else l++;
           }
          if(len==l || len==s) return true;
          ch=word.charAt(0);
          if(l==1 && (ch>='A' && ch<='Z')) return true;
           return false; 
        
        
    }
}