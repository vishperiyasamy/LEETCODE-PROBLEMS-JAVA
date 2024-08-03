class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int prefixSum[]=new int[n];
        int sum=0;
         prefixSum[0] = nums[0];
        for(int i=1;i<n;i++){
             prefixSum[i] = prefixSum[i - 1] + nums[i];
        }
           int SuffixSum[]=new int[n];
          SuffixSum[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--){
             SuffixSum[i] = SuffixSum[i + 1] + nums[i];
        }
          int result[]=new int[n];
          for (int i = 0; i < n; i++) {
            result[i] = Math.abs(prefixSum[i] - SuffixSum[i]);
        }
        return result;



        
        
    }
}