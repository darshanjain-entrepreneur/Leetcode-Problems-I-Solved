
class Solution {
    public ListNode mergeNodes(ListNode head) {
        
        ArrayList<Integer> ll = new ArrayList<>();
        int sum = 0;
        
        while(head != null){
            
            if(head.val == 0){
                if(sum != 0){
                    ll.add(sum);
                }
                sum = 0;
                
            }else{
                sum = sum + head.val;
            }
            
            head = head.next;
        }
        
        ListNode head1 = new ListNode(ll.get(0));
        ListNode tail = head1;
        
        for(int i = 1; i < ll.size(); i++){
            
            ListNode temp = new ListNode(ll.get(i));
            tail.next = temp;
            tail = tail.next;
        }
        
        return head1;
    }
}