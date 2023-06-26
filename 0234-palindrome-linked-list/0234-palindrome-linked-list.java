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
    public boolean isPalindrome(ListNode head) {
        
        if(head.next == null){
            return true;
        }
        
        ListNode tail = head;
        
        StringBuilder b = new StringBuilder();
        
        while(tail != null){
            
            b.append(tail.val);
            tail = tail.next;
        }
        
             StringBuilder c = new StringBuilder();
        
        ListNode tail2 = reverse(head);
        
        while(tail2 != null){
            
            c.append(tail2.val);
            tail2 = tail2.next;
        }
     System.out.println(c);
        System.out.println(b);
        String d = c.toString();
        String e = b.toString();
   
        
        if(d.equals(e)){
            return true;
        }else{
            
            return false;
        }
        
        
    }
    
    public ListNode reverse(ListNode head){
        
        
        ListNode prev = null;
        ListNode pre = head;
        ListNode fut = head.next;
        
        
        while(pre != null){
            
            pre.next = prev;
            prev =  pre;
            pre = fut;
            if(fut != null){
                fut = fut.next;
            }
            
            
            
            
        }
        
        return prev;
        
    }
}