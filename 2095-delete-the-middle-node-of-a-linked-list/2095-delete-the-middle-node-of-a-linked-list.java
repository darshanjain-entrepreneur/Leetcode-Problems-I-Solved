
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        
      if(head == null || head.next == null){
          
          return null;
      }  
        
        
        int n = 0;
        ListNode temp = head;
        while(temp != null){
            n++;
            temp = temp.next;
        }
        
        ListNode prev = null;
        ListNode pre = head;
        
  
        for(int i = 0; i < n/2; i++){
            
            prev = pre;
            
            pre = pre.next;

            
        }
        
        prev.next = pre.next;
        pre.next = null;
        
        return head;
        
    }
}