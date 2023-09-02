class Solution {
    

    
    
 public int reachableNodes(int n, int[][] edges, int[] rest) {
        
        HashSet<Integer> set = new HashSet<>();
     
     ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
     
     for(int i = 0; i < n; i++){
         adj.add(new ArrayList<>());
     }
     
     
     for(int i = 0; i < edges.length; i++){
         
         int u = edges[i][0];
         int v = edges[i][1];
         adj.get(u).add(v);
         adj.get(v).add(u);
         
     }
        
        for(int i :rest ){
            
            set.add(i);
        }
        
        int visited[] = new int[n];
        Queue<Integer>  q = new  LinkedList<>();
        
        int max = 1;
     visited[0] = 1;
        q.add(0);
        
        while(!q.isEmpty()){
            
        
            
        
            int node = q.poll();
            
            for(Integer it : adj.get(node)){
                
                if(visited[it] == 0 && set.contains(it) == false){
                    q.add(it);
                    visited[it] = 1;
                    max++;
                    
                    
                }
                
                
                
                
                
                
            }
            
            
            
            
            
        }
        
        
        
        return max;
        
        
    }
}