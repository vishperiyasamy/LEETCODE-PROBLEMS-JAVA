class Solution {
    public int[] twoSum(int[] nums, int target) {
        int res[]=new int[2];
        int []n=new int[nums.length];
        int n1=0;
        int n2=0;
        for(int k=0;k<nums.length;k++)
        {
            n[k]=nums[k];
        }
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        while(i<j)
        {
            int sum=nums[i]+nums[j];
            if(sum<target){i++;}
            else if(sum>target){j--;}
            else {n1=nums[i];n2=nums[j];break;}
        }
        int x=0;
      
        
         for(int k=0;k<nums.length;k++)
        {
            if(n[k]==n1&&x==0) {res[0]=k;x++;}
             if(n[k]==n2){ res[1]=k;}
        }

        return res;
       
    
    }
}


     
    