
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        
      ListNode ans[] = new ListNode[k];
        
        ListNode temp = head;
        int n = 0;
        while(temp != null){
            
            
            temp = temp.next;
            n++;
        }
       
        
        if(n <= k){
            
          temp = head;
            int i = 0;
            while(temp != null){
                
               ans[i] = temp;
                ListNode head1 = temp;
                
                temp = temp.next;
                head1.next = null;
                i++;
                
            }
            
           return ans; 
            
        }
        
        
        
        int m = n/k;
        temp = head;
        int extra = n%k;
        
    int i = 0;
        while(extra > 0){
            
            ans[i] = temp;
            
            for(int j = 1; j < m + 1; j++){
                temp = temp.next;
            }
            
            if(temp != null){
               ListNode head1 = temp;
                temp = temp.next;
                head1.next = null;
            }
            
            extra--;
            i++;
        }
        
        
        while(i < k){
            
            ans[i] = temp;
            for(int j = 1; j < m; j++){
                
                temp = temp.next;
                
            }
            
            if(temp != null){
               ListNode head1 = temp;
                temp = temp.next;
                head1.next = null;
            }
            
       
            i++;
            
            
            
            
            
        }
        
        
        
        
        return ans;
        
        
    }
}