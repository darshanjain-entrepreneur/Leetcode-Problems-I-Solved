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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        
        ListNode head = null;
        int count = 0;
        ListNode hi = null;
        
        
        while(list1 != null && list2 != null){
            
            if( count == 0 ){
                count = 1;
                if( list1.val <= list2.val){
                    head = list1;
                    list1 = list1.next;
                    hi = head;
                }else{
                    head = list2;
                    list2 = list2.next;
                    hi = head;
                    
                }
               
                
            }else{
                
                
                
                if(list1.val <= list2.val){
                    
                    head.next = list1;
                    list1 = list1.next;
                    head = head.next;
                    
                }else{
                         head.next = list2;
                    list2 = list2.next;
                    head = head.next;
                    
                    
                }
                
                
                
                
                
                
                
            }
            
            
            
            
            
            
        }
        
        while(list1 != null){
            
            head.next = list1;
            list1 = list1.next;
            head = head.next;
        }
        
        while(list2 != null){
              head.next = list2;
            list2 = list2.next;
            head = head.next;
            
        }
        
        return hi;
        
        
    }
}