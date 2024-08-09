class Solution {
    public boolean isPalindrome(ListNode head)
    {
       Stack<Integer> st = new Stack<>(); 
       ListNode temp = head; 
       while(temp!=null)
       {
          st.push(temp.val); 
          temp = temp.next;
       } 
       temp =head; 
       while(temp!=null)
       {
          if(temp.val != st.peek())
          {
                return false;
          } 
          st.pop(); 
          temp = temp.next;
       }
     return true;
    }
}