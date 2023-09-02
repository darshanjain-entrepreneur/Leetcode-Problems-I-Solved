
class Pair{
    
    int  index;
    int value;
    
    public Pair(int index , int value){
        this.index = index;
        this.value = value;
    }
    
    
}



class Solution {
       int result = (int)(1e9);
    
    
    
    public void dfs(int node , int vis[] ,  ArrayList<ArrayList<Pair>> adj  ){
        
        
        
       vis[node] = 1;
        
        for(Pair it : adj.get(node)){
            
            int index = it.index;
            int value = it.value;
            
            result = Math.min(result , value);
            
            if(vis[index] == 0){
                dfs(index , vis , adj);
            }
            
            
        }
        
        
        
        
    }
    
    
    
    
    public int minScore(int n, int[][] roads) {
        
       ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        
    for(int i = 0; i <= n; i++){
        adj.add(new ArrayList<>());
    }
        
        
    for(int i = 0; i < roads.length; i++){
        
        int u  =roads[i][0];
        int v = roads[i][1];
        int d = roads[i][2];
        
        adj.get(u).add(new Pair(v , d));
        adj.get(v).add(new Pair(u , d));
        
        
    }    
        
        
     int vis[] = new int[n+1];
        
     dfs(1 , vis ,adj);
     
        
        return result;
        
    }
}