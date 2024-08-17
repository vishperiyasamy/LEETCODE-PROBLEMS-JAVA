import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public void solve(int[] nums, List<List<Integer>> result, List<Integer> tempList, boolean[] used) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) {
                continue;
            }

            used[i] = true;
            tempList.add(nums[i]);
            solve(nums, result, tempList, used);
            tempList.remove(tempList.size() - 1);
            used[i] = false;
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums); 
        solve(nums, result, tempList, used);
        return result;
    }
}
