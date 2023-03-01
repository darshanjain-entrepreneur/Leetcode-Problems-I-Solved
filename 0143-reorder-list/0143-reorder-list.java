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
    public void reorderList(ListNode head) {
        
        if(head == null || head.next == null || head.next.next == null){
            return;
        }
        
        
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            
            slow = slow.next;
            fast = fast.next.next;
            
        }
        
        ListNode temp = slow.next;
        slow.next = null;
        
        ListNode prev = null;
        ListNode pre = temp;
        ListNode fut = temp.next;
        
        while(pre != null){
            
            pre.next = prev;
            prev = pre;
            pre = fut;
            if(fut != null){
                fut = fut.next;
            }
            
            
            
        }
        
        ListNode temp1 = null;
        ListNode temp2 = null;
        
        while(head != null && prev != null){
            
            temp1 = head.next;
            head.next = prev;
            temp2 = prev.next;
            prev.next = temp1;
            prev = temp2;
            head = temp1;
            
            
            
            
        }
        
        
        
        
        
    }
}