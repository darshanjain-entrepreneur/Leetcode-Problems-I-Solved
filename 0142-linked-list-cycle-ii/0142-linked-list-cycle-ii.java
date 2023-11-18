
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        if(head == null || head.next == null || head.next.next == null){
            
            
            return null;
        }
        
        
        ListNode temp = head;
        
        HashMap<ListNode , Integer> map = new HashMap<>();
        
        
        while(temp != null){
            
            
            if(map.containsKey(temp)){
                
                return temp;
            }
            
            
            map.put(temp,1);
            
            temp = temp.next;
            
            
            
        }
        
        
        
        
       return null; 
        
        
    }
}