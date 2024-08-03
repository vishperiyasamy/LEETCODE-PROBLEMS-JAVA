class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         
         int n1=nums1.length;
         int n2 = nums2.length;
         int[] arr = new int[n1+n2];
         int k=0;
         for(int i=0;i<n1;i++){
            arr[k++]=nums1[i];
         }
         
         for(int i=0;i<n2;i++){
            arr[k++]=nums2[i];
         }
         Arrays.sort(arr);
        int m=arr.length;
           if(m%2==1){
               return (double) arr[m/2];
           }
           else{
                int arr1=arr[m/2-1];
                int arr2=arr[m/2];
                return ((double)arr1 + (double)arr2) /2.0;
           }
    }
}