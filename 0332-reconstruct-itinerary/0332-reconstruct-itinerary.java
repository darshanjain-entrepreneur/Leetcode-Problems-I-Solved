class Solution {
    
    
    public void dfs(  Map<String , PriorityQueue<String>> adj ,   LinkedList<String> ans,String s ){
        
        
        
      PriorityQueue<String> pq = adj.get(s);
        
        while(pq != null && pq.isEmpty() == false){
            
            
            String v = pq.poll();
            dfs(adj , ans , v);
            
            
            
            
            
        }
        
        ans.addFirst(s);
        
        
        
    }
    
    
    
    
    
    public List<String> findItinerary(List<List<String>> tickets) {
        
     Map<String , PriorityQueue<String>> adj = new HashMap<>();   
        
        
        
        for(List<String> t : tickets){
            
            if(adj.containsKey(t.get(0)) == false){
                
                adj.put(t.get(0) , new PriorityQueue<>());
                
            }
            
            adj.get(t.get(0)).add(t.get(1));
        }
        
        
        LinkedList<String> ans = new  LinkedList();
        
        dfs(adj , ans ,"JFK");
        
       
        
        return ans;
        
        
    }
    
    
}