
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
        
        
        
      int n = 0;
        
        ListNode temp = head;
        
        while(temp != null){
            
            temp = temp.next;
            n++;
        }
        
        if(n == 0){
            return null;
        }
         k = k%n;
        
        if(n == 1){
            return head;
        }
        
        if(n == 2){
            if(k == 1){
                ListNode temp1 = head;
                ListNode temp2 = head.next;
                temp2.next = temp1;
                temp1.next =null;
                return temp2;
            }else{
                return head;
            }
        }
        
       
       int c = n-k;
        
    temp = head;
        while(c > 1){
            temp = temp.next;
            c--;
        }
        
        ListNode temp3 = temp.next;
        
        if(temp3 == null){
            return head;
        }
        
        ListNode temp4 = temp.next;
        temp.next = null;
        
        while( temp3 != null && temp3.next != null){
            
            temp3 = temp3.next;
        }
        temp3.next = head;
        
        return temp4;
    }
}