
class Solution {
    public void preorder(TreeNode root, List<Integer> result)
    {
        if(root==null)
        {
            return;
        }
         result.add(root.val); 
        preorder(root.left,result);  
        preorder(root.right,result);
    }
    public int kthSmallest(TreeNode root, int k) {
         List<Integer> result = new ArrayList<>(); 
        preorder(root,result); 
         Collections.sort(result);
         return result.get(k-1);
    }
}


