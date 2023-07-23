
class Solution {

    ArrayList<Integer> ll;
    
    public Solution(ListNode head) {
        ll = new ArrayList<>();
        while(head != null){
            
            ll.add(head.val);
            head = head.next;
        }
        
    }
    
    public int getRandom() {
        
        return ll.get((int)(Math.random()*(ll.size())));
    }
}

