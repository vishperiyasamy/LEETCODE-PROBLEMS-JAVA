class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n =nums.length;
        int[] Prefix = new int[n];
        int[] Suffix=new int[n];
        int[] Prod= new int[n];
        
        Prefix[0]=1;
          for(int i=1;i<n;i++){
            Prefix[i]=nums[i-1]*Prefix[i-1];
          }
        Suffix[n-1]=1;
          for(int j=n-2;j>=0;j--){
            Suffix[j]=nums[j+1]*Suffix[j+1];
          }
        for(int i=0;i<n;i++){
            Prod[i]=Prefix[i]*Suffix[i];
        }
       
        // int k=0;
        // for(int i=0;i<n;i++){
        //      int prod=1;
        //     for(int j=0;j<n;j++){
        //         if(i==j) continue;
        //     prod=prod*nums[j];
        //     }
        //     arr[i]=prod;
             
        // }
        // return arr;
        return Prod;
    }
}

