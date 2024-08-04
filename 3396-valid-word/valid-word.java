class Solution {
    public boolean isValid(String word) {
        if(word.length()<=2){
            return false;
        }
        String v= "aeiouAEIOU";
        int c=0;
        int x=0;
        for(int i=0;i<word.length();i++){
            if(Character.isLetter(word.charAt(i))){
               if(v.contains(Character.toString(word.charAt(i)))){
                c++;
               }
               else{
                 x++;
               }
            }
            else{
                if(word.charAt(i)=='@' || word.charAt(i)=='$' || word.charAt(i)=='#'){
                    return false;
                }
            }
        }
      if(x>=1 && c>=1){
        return true;
      }
      else{
         return false;
      }
        
    }
}