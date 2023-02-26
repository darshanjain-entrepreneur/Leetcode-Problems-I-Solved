/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
      
        int count = 0;
        
        
        ListNode temp = head;
        
        while(temp != null){
            
            count++;
            temp = temp.next;
            
            
            
        }
        
        
        int size = count - n + 1;
        
        if(size == 1){
            head = head.next;
            return head;
        }
        
     
        
        ListNode pre = head;
        ListNode prev = null;
        
          int y = 1;
        
        while(y <= size){
            
            if(y == size){
                
               prev.next = pre.next;
                
                
            }
            
            prev = pre;
            pre = pre.next;
            y++;
            
            
        }
        
        
        return head;
        
    }
}