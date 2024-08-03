class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int rigth=height.length-1;
        int max=0;
        while(left<rigth){
         int width=rigth-left;
         int area=Math.min(height[left],height[rigth])*width;
         max=Math.max(max,area);
         if(height[left]<height[rigth]){
            left++;
         }
         else{
            rigth--;
         }
        }
        return max;
    }
}