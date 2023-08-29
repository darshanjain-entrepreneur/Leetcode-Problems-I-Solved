
class Pair{
    
    int node;
    int time;
    
    public Pair(int node , int time){
        this.node = node;
        this.time = time;
    }
    
    
}




class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        
        List<List<Pair>> adj = new ArrayList<>();
        
        
        int dist[] = new int[n+1];
        
        Arrays.fill(dist ,(int)(1e9));
        
        dist[k] = 0;
        
        
        for(int i = 0; i <=n; i++){
            
            adj.add(new ArrayList<>());
        }
        
        for(int i = 0; i < times.length; i++){
            
            int u = times[i][0];
            int v = times[i][1];
            int wt = times[i][2];
            adj.get(u).add(new Pair(v , wt));
        }
        
        
        PriorityQueue<Pair> pq = new PriorityQueue<>((a , b) -> {
            
            return a.time - b.time;
            
        });
        
        pq.add(new Pair(k , 0));
        
        while(!pq.isEmpty()){
            
            Pair p = pq.poll();
            
            int u = p.node;
            int tt = p.time;
            
            
           for(int j = 0; j < adj.get(u).size(); j++){
               
               Pair it = adj.get(u).get(j);
                    int v =  it.node;
                    int time = it.time;
                    
                    if(dist[u] + time < dist[v]){
                        dist[v] = dist[u] + time;
                        pq.add(new Pair(v , dist[u] + time));
                    }
           }
            
            
            
            
            
            
            
            
        }
        
        
        int max = -(int)(1e9);
        
        for(int i = 1; i <=n; i++){
            if(dist[i] == (int)(1e9)){
                
                return -1;
            }
            max = Math.max(max , dist[i]);
        }
        
        
        
      return max;  
        
    }
}