
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
HashSet<ListNode> set = new HashSet<>();
        
        ListNode head = headA;
        
        while(head!= null){
            
            set.add(head);
            head = head.next;
            
        }
        head = headB;
        
         while(head!= null){
            
        if(set.contains(head)){
            return head;
        }
            head = head.next;
            
        }
        
        return null;
        
    }
}