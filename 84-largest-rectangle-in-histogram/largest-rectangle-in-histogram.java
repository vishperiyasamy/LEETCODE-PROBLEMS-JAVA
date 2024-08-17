class Solution {
    public int largestRectangleArea(int[] heights) {
         int n = heights.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int maxArea = 0;

        // Fill left array
        left[0] = -1;
        for (int i = 1; i < n; i++) {
            int prev = i - 1;
            while (prev >= 0 && heights[prev] >= heights[i]) {
                prev = left[prev];
            }
            left[i] = prev;
        }

        // Fill right array
        right[n - 1] = n;
        for (int i = n - 2; i >= 0; i--) {
            int next = i + 1;
            while (next < n && heights[next] >= heights[i]) {
                next = right[next];
            }
            right[i] = next;
        }
        for (int i = 0; i < n; i++) {
            int width = right[i] - left[i] - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}