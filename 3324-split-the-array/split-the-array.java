class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int temp[]=new int[1000000];
        for(int num:nums){
            temp[num]++;
            if(temp[num]>2){
                return false;
            }
        }
        return true;
    }
}