class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int length = flowerbed.length;
        
        // Use a single loop to check each plot
        for (int i = 0; i < length; i++) {
            // Check if the current plot is empty
            if (flowerbed[i] == 0) {
                // Check if the previous and next plots are also empty
                boolean prevEmpty = (i == 0) || (flowerbed[i - 1] == 0);
                boolean nextEmpty = (i == length - 1) || (flowerbed[i + 1] == 0);
                
                if (prevEmpty && nextEmpty) {
                    // Plant a flower here
                    flowerbed[i] = 1;
                    count++;
                    
                    // Move to the next position where we can start checking
                    // Skipping the next plot since it cannot have a flower
                    i++;
                }
            }
        }
        
        // Check if we have managed to plant at least n flowers
        return count >= n;
    }
}
