import java.util.ArrayList;
import java.util.List;

class Solution {
    public void solve(int[] nums, List<List<Integer>> result, int start) {
        if (start == nums.length) {
            List<Integer> list = new ArrayList<>();
            for (int num : nums) {
                list.add(num);
            }
            result.add(list);
            return;
        }
        
        for (int i = start; i < nums.length; i++) {
             int temp = nums[i];
           nums[i] = nums[start];
            nums[start] = temp;
            solve(nums, result, start + 1);
             temp = nums[i];
        nums[i] = nums[start];
        nums[start] = temp;
           
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        solve(nums, result, 0);
        return result;
    }
}
