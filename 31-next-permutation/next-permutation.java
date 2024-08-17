class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int idx=-1,i;
        for(i=n-1;i>=1;i--)
        {
            if(nums[i-1]<nums[i])
            {
                idx=i-1;
                break;
            }
        }

        if(idx!=-1)
        {
            for(i=n-1;i>=idx+1;i--)
            {
                if(nums[i]>nums[idx])
                {
                    int temp=nums[i];
                    nums[i]=nums[idx];
                    nums[idx]=temp;
                    break;

                }
            }
           
           
        }

        int start=idx+1;int end=n-1;
        while(start<end)
        {
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}
