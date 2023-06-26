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
    public boolean isPalindrome(ListNode head) {
        
        
    int n = 0;
        ListNode tail = head;
        
        while(head != null){
            

            n++;
            head = head.next;
            
        }
        
        int nums[] = new int[n];
        int i = 0;
        while(tail != null){
            
            nums[i] = tail.val;
            tail = tail.next;
            i++;
            
        }
        
      int start = 0;
        int end = nums.length-1;
        
        while(start <=end){
            
            if(nums[start]!= nums[end]){
                
                return false;
            }
            start++;
            end--;
            
            
            
            
        }
        
        return true;
    }
}