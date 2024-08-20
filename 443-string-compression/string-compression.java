class Solution {
    public int compress(char[] chars) {
          if(chars.length==1){
            return 1;
          }
          String res="";
          int c=1;
          for(int i=0;i<chars.length-1;i++){
            if(chars[i]==chars[i+1]){
                c++;
            }
            else{
                if(c!=1){
                    res=res+chars[i]+c;
                    c=1;
                }
                else{
                    res=res+chars[i];
                    c=1;
                }
            }
          }
          if(c!=1){
          res=res+chars[chars.length-1]+c;
          }
          else{
            res=res+chars[chars.length-1];
          }
          for(int i=0;i<res.length();i++){
             chars[i]=res.charAt(i);
          }
          return res.length();
    }
}