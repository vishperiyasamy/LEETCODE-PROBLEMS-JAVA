class Solution 
{
    public List<List<Integer>> levelOrderBottom(TreeNode root)
    {
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
                r.add(0,li);
            } 
            return r;
    }
}