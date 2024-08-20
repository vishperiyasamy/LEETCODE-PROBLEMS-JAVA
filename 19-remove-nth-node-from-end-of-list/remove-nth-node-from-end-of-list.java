
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n==1 && head.next==null){
            return null;
        }
        if(head.next==null || head==null){
            return head;
        }
        ListNode temp = head;
        int c=0;
        while(temp!=null){
            temp=temp.next;
            c++;
        }
        int last=c-n;
        if(last==0){
            return head.next;
        }
        temp=head;
        for(int i=1;i<last;i++){
             temp=temp.next;

        }
     
      temp.next=temp.next.next;
      return head;   
    }
}