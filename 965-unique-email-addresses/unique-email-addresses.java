class Solution {
    public int numUniqueEmails(String[] emails) {
  HashSet<String> set = new HashSet();
        for(String email : emails){
          int atpos = email.indexOf("@");
          String localname = email.substring(0,atpos);
          String domainname = email.substring(atpos);

          localname = localname.replaceAll("\\.","");
          if(localname.contains("+")){
            int plus = localname.indexOf("+");
            localname = localname.substring(0,plus);
          }
        
       String  mail =localname+domainname;
        set.add(mail);
        }

        return set.size();
    }
}