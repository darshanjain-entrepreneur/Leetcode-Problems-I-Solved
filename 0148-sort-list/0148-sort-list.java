
class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null){
            
            return null;
        }
        if(head.next == null){
            return head;
        }
        
        ArrayList<Integer> ll = new ArrayList<>();
        
        while(head != null){
            
            ll.add(head.val);
            head = head.next;
            
            
            
        }
        
        Collections.sort(ll);
        ListNode tail = new ListNode(ll.get(0));
        ListNode head1  = tail;
        int i =1;
        while(i < ll.size()){
            
            ListNode temp = new ListNode(ll.get(i));
            tail.next = temp;
            tail = tail.next;
            i++;
            
            
            
            
            
            
        }
        
        return head1;
        
    }
}