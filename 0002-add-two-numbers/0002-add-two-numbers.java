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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        StringBuilder b1 = new StringBuilder();
        
        StringBuilder b2 = new StringBuilder();
        
        StringBuilder b3 = new StringBuilder();
        
        while(l1 != null){
            b1.append(l1.val);
           l1 =  l1.next;
        }
        
        while(l2 != null){
            b2.append(l2.val);
            l2 = l2.next;
        }
        b1.reverse();
        b2.reverse();
        
        StringBuilder b = new StringBuilder();
        int i = b1.length()-1;
        int j = b2.length()-1;
        int borrow = 0;
        while(i >= 0 && j >= 0){
            
            int a = (int)(b1.charAt(i) - '0');
            int c = (int)(b2.charAt(j) - '0');
            int sum = a+c;
            sum = sum + borrow;
            if(sum >= 10){
                borrow = 1;
                sum = sum%10;
            }else{
                borrow = 0;
            }
            b.append(sum);
            i--;
            j--;
        }
        
          while(i >= 0 ){
            
            int a = (int)(b1.charAt(i) - '0');
          
            int sum = a;
            sum = sum + borrow;
            if(sum >= 10){
                borrow = 1;
                sum = sum%10;
            }else{
                borrow = 0;
            }
            b.append(sum);
            i--;
        }
        
         while(j >= 0 ){
            
          
            int c = (int)(b2.charAt(j) - '0');
            int sum = c;
            sum = sum + borrow;
            if(sum >= 10){
                borrow = 1;
                sum = sum%10;
            }else{
                borrow = 0;
            }
            b.append(sum);
            j--;
        }
        
        if(borrow == 1){
            b.append(1);
        }

        
       ListNode ans = new ListNode((int)(b.charAt(0) - '0'));
        ListNode result = ans;
        for(int k = 1; k< b.length(); k++){
            
              ListNode ans1 = new ListNode((int)(b.charAt(k) - '0'));
            ans.next = ans1;
            ans = ans.next;
        }
        
        return result;
    }
}