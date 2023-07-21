class LRUCache {
    Node head = new Node(0 , 0);
    Node tail = new Node(0 , 0);
  
    Map<Integer , Node> map = new HashMap<>();
    int capacitysize;

    public LRUCache(int capacity) {
        
        capacitysize = capacity;
          head.next = tail;
    tail.prev = head;
        
    }
    
    public int get(int key) {
        
       if(map.containsKey(key)){
           int value = map.get(key).value;
           remove(map.get(key));
           insert(new Node(key , value));
           
           return map.get(key).value;
           
       } else{
           
           return -1;
       }
        
        
    }
    
    public void put(int key, int value) {
        
     if(map.containsKey(key)){
         
         remove(map.get(key));
         insert(new Node(key , value));
         
         
     }else{
         if(map.size() == capacitysize){
             remove(tail.prev);
             insert(new Node(key , value));
         }else{
             
             insert(new Node(key , value));
         }
         
         
     }
        
       
        
    }
    
    
    class Node{
        
        Node next , prev;
        int key,value;
        public Node(int key , int value){
            this.key = key;
            this.value = value;
        }
        
    }
    
    public void remove(Node a){
        map.remove(a.key);
       Node b = a.next;
        a.next.prev = a.prev;
        a.prev.next = a.next;
        a.next.prev = a.prev;
        
        
    }
    public void insert(Node a ){
        
       map.put(a.key , a);
        Node headnext = head.next;
        head.next = a;
        a.prev = head;
        a.next = headnext;
        headnext.prev = a;
        
    }
    
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */