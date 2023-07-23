
class Solution {
    public ListNode removeNodes(ListNode head) {
         
         ListNode head1 = reverse(head);
        
        int maxvalue = head1.val;
        
        ListNode prev = null;
        ListNode pre = head1;
        ListNode fut = head1.next;
        
        while(fut != null){
            
           if(fut.val >= maxvalue){
               
               pre.next = fut;
               maxvalue = fut.val;
               prev = pre;
               pre = fut;
               fut = fut.next;
               pre.next = null;
           }else{
               
               fut = fut.next;
               pre.next = null;
           }
            
            
        }
        
      ListNode ans =   reverse(head1);
        return ans;
    }
    
    public ListNode reverse(ListNode n){
        
        ListNode prev = null;
        ListNode pre = n;
        ListNode fut = n.next;
        while(pre != null){
            
            pre.next = prev;
            prev = pre;
            pre = fut;
            if(fut!= null){
                fut = fut.next;
            }
        }
        return prev;
    }
}