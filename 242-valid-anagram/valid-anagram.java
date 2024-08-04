class Solution {
    public boolean isAnagram(String s, String t) {
        String s1=s.replaceAll("\\s"," ");
        String t1=t.replaceAll("\\s"," ");
        if(s1.length()!=t1.length()){
            return false;
        }
        else{
            char c1[]=s1.toLowerCase().toCharArray();
            char c2[]=t1.toLowerCase().toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            return Arrays.equals(c1,c2);
        }
        
    }
}