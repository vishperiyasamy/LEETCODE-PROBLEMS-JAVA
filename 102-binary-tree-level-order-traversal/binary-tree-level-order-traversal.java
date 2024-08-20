/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
             List<List<Integer>> r=new ArrayList<>();
            if(root==null) return r ;

            Queue<TreeNode>q=new LinkedList<>();
            q.offer(root);
            while(!q.isEmpty())
            {
                TreeNode temp=null;
                int size=q.size();
                List<Integer> li=new ArrayList<>();
                for(int i=0;i<size;i++)
                {
                    temp=q.poll();
                    li.add(temp.val);
                    if(temp.left!=null)
                    {
                        q.offer(temp.left);
                    }
                      if(temp.right!=null)
                    {
                        q.offer(temp.right);
                    }
                    
                }
                r.add(li);
            } 
            return r;
    }
}