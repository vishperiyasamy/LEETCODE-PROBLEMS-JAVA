class Solution {
    public char findTheDifference(String s, String t) {
     char xor = ' ';
    for (int i = 0; i < s.length(); i++) {
      xor ^= s.charAt(i);
    }
   for (int i = 0; i < t.length(); i++) {
    xor ^= t.charAt(i);
   }
     return Character.toLowerCase(xor);
       
    }
}