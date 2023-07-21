
class Solution {
    public ListNode mergeNodes(ListNode head) {
        
        ListNode head1 = new ListNode(0);
        ListNode tail = head1;
        int sum = 0;
        
    while(head != null){
        
        if(head.val == 0){
            
            if(sum!= 0){
                ListNode temp = new ListNode(sum);
                tail.next = temp;
                tail = tail.next;
            }
            sum = 0;
        }else{
            
            sum = sum + head.val;
        }
        
        head = head.next;
        
    }
        
        return head1.next;
        
    }
}