
class Solution {
    public ListNode swapPairs(ListNode head) {
        
        if(head == null || head.next == null){
            return head;
        }
        ListNode start = head;
        
        while( head != null && head.next != null){
            
            int val1 = head.val;
            int val2 = head.next.val;
            head.val =val2;
            head.next.val = val1;
            
            head = head.next.next;
            
            
            
        }
        
        
        return  start;
        
        
    }
}