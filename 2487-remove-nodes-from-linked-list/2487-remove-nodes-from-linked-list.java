
class Solution {
    public ListNode removeNodes(ListNode head) {
        
        Stack<ListNode> st = new Stack<>();
        
        ListNode temp = head;
        
        while(temp != null){
            st.add(temp);
            temp = temp.next;
        }
        int maxvalue = -1;
        ListNode head1 = new ListNode(-7);
        ListNode res =head1;
      
        while(!st.isEmpty()){
            
           int val = st.peek().val;
            if(maxvalue <= val){
                
                head1.next = st.pop();
                head1 = head1.next;
                maxvalue = val;
            }else{
                st.pop();
            }
            
            
        }
      
        if(head1 != null){
            head1.next = null;
        }
        
        ListNode ans = reverse(res.next);
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
            if(fut != null){
                fut = fut.next;
            }
            
        }
        
        return prev;
    }
}