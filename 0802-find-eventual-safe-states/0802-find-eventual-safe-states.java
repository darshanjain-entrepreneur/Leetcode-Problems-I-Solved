class Solution {
    
    public boolean dfs(int node , int vis[] , int pathvis[] , int[][] graph , int check[] , int n){
        
        vis[node] =1;
        pathvis[node] = 1;
        
        
        for(Integer it : graph[node]){
            
            if(vis[it] == 0){
                
                if(dfs(it , vis , pathvis , graph , check , n)){
                    return true;
                }
                
            }else{
                
                if(pathvis[it] == 1){
                    
                    return true;
                }
                
                
                
                
            }
            
            
            
            
        }
        
        
        
        check[node] = 1;
        
        pathvis[node] = 0;
        
        return false;
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        
        int vis[] = new int[graph.length];
        
        int pathvis[] = new int[graph.length];
        int check[] = new int[n];
        
        
        for(int i = 0; i < n; i++){
            
            if(vis[i] == 0){
                
                dfs(i , vis , pathvis , graph , check , n);
            }
            
            
            
            
        }
        
        
        List<Integer> ans = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            if(check[i] == 1){
                ans.add(i);
            }
        }
        
        return ans;
        
        
    }
}