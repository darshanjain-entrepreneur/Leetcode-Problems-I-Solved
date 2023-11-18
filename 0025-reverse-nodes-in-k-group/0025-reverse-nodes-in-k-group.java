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
    
    
    
    public void reverse(int start , int end , List<Integer> ll){
        
        
        while(start < end){
            
            int temp  = ll.get(start);
            
            int temp2 = ll.get(end);
            
            ll.set(start , temp2);
            ll.set(end , temp);
            start++;
            end--;
            
            
            
        }
        
        
    }
    
    
    
    public ListNode reverseKGroup(ListNode head, int k) {
        
        
        List<Integer> ll = new ArrayList<>();
        
        ListNode tail =head;
        while(tail != null){
            
            ll.add(tail.val);
            
            tail = tail.next;
            
        }
        
        int start = 0;
        int end = 0;
        
        while(start <= end && end < ll.size()){
            
            if(end-start +1 < k){
                
                
                end++;
            }else if(end-start+1 == k){
                
                
                reverse(start , end , ll);
                start = end;
                end++;
                start++;
                
            }
            
            
            
            
            
            
        }
        
        
        ListNode temp = new ListNode(ll.get(0));
        ListNode ans = temp;
        
        for(int i = 1; i < ll.size(); i++){
            
            int val = ll.get(i);
            ListNode temp1 = new ListNode(val);
            temp.next = temp1;
            temp = temp.next;
        }
        
        return ans;
    }
}