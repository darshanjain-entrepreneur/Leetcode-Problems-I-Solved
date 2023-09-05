

class Solution {
    public Node copyRandomList(Node head) {
        
        if(head == null){
            return head;
        }
        
        
        
        HashMap<Node , Node> map = new HashMap<>();
        
        
        
       Node temp = head;
        Node prev = null;
        Node fut = null;
        
        
        while(temp!= null){
            
            if(prev == null){
                
                prev = new Node(temp.val);
                fut = prev;
                map.put(temp , prev);
            }else{
                
                Node pre = new Node(temp.val);
                fut.next = pre;
                fut = fut.next;
                map.put(temp , pre);
            }
            
            
            temp = temp.next;
            
        }
        
        
        temp = head;
        fut = prev;
        
        while(temp != null){
            
            if(temp.random != null){
                
                Node ans = map.get(temp.random);
                fut.random = ans;
                
            }
            
            temp = temp.next;
            fut = fut.next;
            
        }
        
        
        
        
        return prev;
        
    }
}