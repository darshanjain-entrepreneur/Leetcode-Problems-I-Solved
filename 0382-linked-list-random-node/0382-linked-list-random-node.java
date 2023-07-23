
class Solution {

ListNode head;
    
    public Solution(ListNode head) {
      this.head = head;
        
    }
    
    public int getRandom() {
        
        ListNode cur = head;
        int res = -1;
        
        for(int i = 1; cur != null; i++){
            
           if(random(i) == i-1){
               res = cur.val;
           } 
            cur = cur.next;
        }
        
        return res;
    
    }
    
    public int random(int i){
        
        int a = (int)(Math.random()*i);
        return a;
    }
}

