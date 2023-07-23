
class Solution {
    public ListNode swapPairs(ListNode head) {
        
        if(head == null || head.next == null){
            return head;
        }
        ListNode start = head;
        ListNode pre = head;
        ListNode prev = null;
        ListNode fut = head.next;
        
        
        while( pre != null && fut != null ){
            
         if(prev == null){
             start = fut;
             prev = pre;
             pre.next = fut.next;
             fut.next = pre;
           pre = pre.next;
              if(pre != null){
               fut = pre.next;
           }
             
             
         }else{
             prev.next = fut;
              prev = pre;
              pre.next = fut.next;
             fut.next = pre;
           pre = pre.next;
           if(pre != null){
               fut = pre.next;
           }
             
             
         }
            
            
            
        }
        
        
    return start;
        
        
    }
}