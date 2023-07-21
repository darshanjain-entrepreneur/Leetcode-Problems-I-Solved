
 
class Solution {
    public int pairSum(ListNode head) {
        
 ArrayList<Integer> ll = new ArrayList<>();
        
        while(head != null){
            
            ll.add(head.val);
            head = head.next;
            
            
            
        }
       
        int start = 0;
        int end = ll.size()-1;
        int max = 0;
        while(start < end){
            
            max = Math.max(max , ll.get(start)+ll.get(end));
            start++;
            end--;
            
        }
        
       return max; 
        
        
    }
}