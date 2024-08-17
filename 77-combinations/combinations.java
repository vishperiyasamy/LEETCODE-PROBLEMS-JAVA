import java.util.ArrayList;
import java.util.List;

class Solution {
    private void solve(List<List<Integer>> result, List<Integer> list, int start, int n, int k) {
        if (list.size() == k) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i = start; i <= n; i++) {
            list.add(i);
            solve(result, list, i + 1, n, k);
            list.remove(list.size() - 1);
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        solve(result, list, 1, n, k); 
        return result;
    }
}
