class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int a=0,b=0;
        //if(nums.length==1) return 0;
       for(int num : nums){
          a+=num;
          if(a==0){
            b++;
          }
       }
        return b;
    }
}