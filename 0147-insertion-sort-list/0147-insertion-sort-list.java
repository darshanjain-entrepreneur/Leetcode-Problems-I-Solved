
 
class Solution {
    public ListNode insertionSortList(ListNode head) {
        
        List<Integer> ll = new ArrayList<>();
        
        
        ListNode temp = head;
        
        while(temp != null){
            
            ll.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(ll);
        temp = head;
        for(int i = 0;  i< ll.size(); i++){
            
            temp.val = ll.get(i);
            temp = temp.next;
            
            
        }
        
        return head;
    }
}