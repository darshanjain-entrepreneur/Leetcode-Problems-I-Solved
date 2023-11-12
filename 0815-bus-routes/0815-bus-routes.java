class Solution {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        
        if(source == target){
            
            return 0;
        }
        
        
        HashMap<Integer , List<Integer>> map = new HashMap<>();
        
        for(int i = 0; i < routes.length; i++){
            
            for(int j = 0; j < routes[i].length; j++){
                
                int a = routes[i][j];
                
                if(map.containsKey(a) == false){
                    map.put(a , new ArrayList<>());
                }
                
                map.get(a).add(i);
            }
            
        }
        
        
        
        Queue<Integer> q = new LinkedList<>();
        
        
        boolean vis[] = new boolean[501];
        
        for(Integer it : map.get(source)){
            
            q.add(it);
            vis[it] = true;
            
            
        }
        
        
        
        int count = 1;
        while(!q.isEmpty()){
            
            int size = q.size();
            
            while(size > 0){
                
                size--;
                
                int route = q.poll();
                
               for(int j = 0; j < routes[route].length; j++){
                   
                   
                   if(routes[route][j] == target){
                       
                       return count;
                   }
                   
                   for(Integer it : map.get(routes[route][j])){
                       
                       if(vis[it] == false){
                           vis[it] = true;
                           q.add(it);
                       }
                   }
                   
               }
                
           
            }
            
                count++; 
        }
        
        
        
        return -1;
        
    }
}