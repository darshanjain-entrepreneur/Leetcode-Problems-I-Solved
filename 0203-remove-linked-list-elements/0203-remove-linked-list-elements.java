
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
        
        ListNode ll = new ListNode(0);
        
        ListNode pre = head;
        ListNode  prev = ll;
        
        
        while(pre != null){
            
            if(pre.val == val){
                
                pre = pre.next;
                
            }else{
                
                prev.next = pre;
                prev = pre;
                pre = pre.next;
                
                
                
            }
            
            
            
            
            
        }
        prev.next = null;
        
        return ll.next;
        
    }
}