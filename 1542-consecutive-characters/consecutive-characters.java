class Solution {
    public int maxPower(String s) {
        int max=0;
        for(int i=0;i<s.length();i++){
            int count=1;
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
                else break;
            }
            max=Math.max(count,max);
        }

return max;
    }
}