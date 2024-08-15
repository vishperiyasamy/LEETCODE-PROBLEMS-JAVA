class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int j1=0;
        HashSet<Character> set = new HashSet<>();
        for(char i:jewels.toCharArray()){
            set.add(i);
        }
        for(char j:stones.toCharArray()){
            if(set.contains(j)){
                j1++;
            }
        }
        return j1;
    }
}