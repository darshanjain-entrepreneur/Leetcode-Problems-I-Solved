class Solution {
    
    
    public int setMask(int mask , int ver){
        
        return mask | (1<<ver);
    }
    
    public int shortestPathLength(int[][] graph) {
        
        if(graph.length == 1){
            return 0;
        }
        Queue<int[]> queue = new LinkedList<>();
     int n = graph.length;
        
        int finalval = 1<<n;
        int[][] dis = new int[n][finalval];
        
        for(int a[] : dis){
            Arrays.fill(a , -1);
        }
        
        for(int i = 0; i< n;i++){
            
            int mask = setMask(0 , i);
            queue.add(new int[]{i , mask});
            dis[i][mask] = 0;
        }
        
        
        
        while(!queue.isEmpty()){
            
           int[] elem = queue.remove();
            
            int ver = elem[0];
            int mask = elem[1];
            
            if(mask == finalval - 1){
                return dis[ver][mask];
            }
           
            for(int child : graph[ver]){
                
                int newVer = child;
                int newMask = setMask(mask , newVer);
                
                if(dis[newVer][newMask] != -1){
                    continue;
                }
                dis[newVer][newMask] = dis[ver][mask] + 1;
                queue.add(new int[]{newVer , newMask});
            }
            
            
        }
        
        
        
      return n;  
        
    }
}