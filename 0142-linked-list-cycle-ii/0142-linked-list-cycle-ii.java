
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        if(head == null || head.next == null || head.next.next == null){
            
            
            return null;
        }
        
        
      ListNode slow = head;
        ListNode fast = head;
        
        
        
        while(fast.next != null && fast.next.next != null){
            
            fast = fast.next.next;
            slow = slow.next;
            
            if(fast == null || slow == null){
                return null;
            }
            if(fast == slow){
                break;
            }
            
        }
        
        if(fast != slow){
            
            return null;
        }
        
        
        
        ListNode start = head;
        
        while(start != slow){
            start = start.next;
            slow = slow.next;
        }
        
        
        return start;
    }
}