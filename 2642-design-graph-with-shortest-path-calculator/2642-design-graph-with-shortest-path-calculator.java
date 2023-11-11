class Graph {
    
    ArrayList<ArrayList<int[]>> adj = new ArrayList<>();

    public Graph(int n, int[][] edges) {
        
        for(int i = 0; i  < n; i++){
            adj.add(new ArrayList<>());
            
            
            
        }
        
        for(int i = 0; i < edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            int cost = edges[i][2];
            adj.get(u).add(new int[]{v , cost});
        }
        
    }
    
    public void addEdge(int[] edge) {
        
        
        int u = edge[0];
        int v  =edge[1];
        int cost = edge[2];
        adj.get(u).add(new int[]{v , cost});
        
    }
    
    public int shortestPath(int node1, int node2) {
        

      int n = adj.size();
    PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
        return a[0]-b[0];
    });
    int[] dist = new int[n];
    Arrays.fill(dist, Integer.MAX_VALUE);
    dist[node1] = 0;
    pq.offer(new int[]{0, node1});

    while (!pq.isEmpty()) {
      
        int d = pq.peek()[0];
        int node = pq.peek()[1];
        pq.poll();
        if (node == node2) return d;
        if (d > dist[node]) continue;
        for ( int temp[] : adj.get(node)) {
            
            int new_dist = d + temp[1];
            if (new_dist < dist[temp[0]]) {
                dist[temp[0]] = new_dist;
                pq.offer(new int[]{new_dist, temp[0]});
            }
        }
    }
        
        
    return -1;
    

    
}

}













/**
 * Your Graph object will be instantiated and called as such:
 * Graph obj = new Graph(n, edges);
 * obj.addEdge(edge);
 * int param_2 = obj.shortestPath(node1,node2);
 */