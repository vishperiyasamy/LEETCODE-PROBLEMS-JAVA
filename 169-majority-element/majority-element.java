class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int res=0;
        int max=0;
        if(n==1) return nums[0];
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(max<count) {max=count;res=nums[i];}
        }
            return res;
        
        
    }
}