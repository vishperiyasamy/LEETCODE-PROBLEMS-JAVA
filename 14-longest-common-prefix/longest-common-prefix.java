class Solution {
    public String longestCommonPrefix(String[] strs) {
     Arrays.sort(strs);
     String n1=strs[0];
     String n2 =strs[strs.length-1];
     int i=0;
     while(i<n1.length() && i<n2.length()){
        if(n1.charAt(i)==n2.charAt(i)){
            i++;
        }
        else{
            break;
        }
     }

     return n1.substring(0,i); 
        
        
    }
}