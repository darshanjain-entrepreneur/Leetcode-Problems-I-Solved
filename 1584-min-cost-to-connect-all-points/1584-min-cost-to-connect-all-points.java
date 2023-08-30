
class Pair{
    int first;
    int second;
    public Pair(int first , int second){
        this.first = first;
        this.second = second;
    }
}



class Solution {
    
     public  int  primesalgo(ArrayList<ArrayList<Pair>> adj , int V) {
         
         
         
         PriorityQueue<Pair> pq = new PriorityQueue<>((a , b) -> {
             return a.second - b.second;
         }); 
        
     
     pq.add(new Pair(0 , 0));
        
        
            boolean inMST[] = new boolean[V];
        int sum = 0;
 
        while(!pq.isEmpty()) {
            
           Pair p = pq.poll();
            
            int node = p.first;
           int wt = p.second;
            
            if(inMST[node] == true)
                continue;
            
            inMST[node] = true; //added to mst
            sum += wt;
            
            for(Pair tmp : adj.get(node)) {
                
                int neighbor      = tmp.first;
                int neighbor_wt   = tmp.second;
                
                if(inMST[neighbor] == false) {
                    pq.add(new Pair(neighbor , neighbor_wt));
                }
 
            }
        }
        
        return sum;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    public int minCostConnectPoints(int[][] points) {
        int V = points.length;
        
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        
        for(int i = 0; i <V; i++){
            adj.add(new ArrayList<>());
        }
        
        for(int i = 0; i < V; i++){
            
            
            for(int j = i+1; j <V; j++){
                
                int x1  = points[i][0];
                int y1 = points[i][1];
                
                int x2 = points[j][0];
                int y2 = points[j][1];
                
                int d = Math.abs(x2 - x1) + Math.abs(y2 - y1);
                adj.get(i).add(new Pair(j , d));
                adj.get(j).add(new Pair(i , d));
                
            }
            
            
            
            
            
        }
        
        
        
        return primesalgo(adj , V);
    }
}