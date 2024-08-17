import java.math.BigInteger; 

class Solution
 {
    public static boolean great(int n1,int n2)
    {
        String s1=n1+"";
        String s2=n2+"";
      String  s3=s1+s2;
        String s4=s2+s1;
        BigInteger numBig1 = new BigInteger(s3);
        BigInteger numBig2= new BigInteger(s4);
      int  result = numBig1.compareTo(numBig2);   
       return result==1;



    }
    public String largestNumber(int[] nums) 
    {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(great(nums[i],nums[j]))
                {
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
               
            }
        }

        String s="";
        int c=0;
        for(int j=nums.length-1;j>=0;j--)
        {
            if(nums[j]==0) c++;
            s=s+nums[j];
        }
        if(c==nums.length)
        {
            s="0";
            return s;

        }
        return s;
        
    }
}