class Solution {
    public int lengthOfLastWord(String s) {
        /*s = s.trim();
        for(int i =s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                System.out.println(s);
                return (s.length()-i-1);
            }
        }
        
        return s.length();*/
        String s1[] = s.split(" ");
        String  a=s1[s1.length-1];
        return a.length();
        
    }
}