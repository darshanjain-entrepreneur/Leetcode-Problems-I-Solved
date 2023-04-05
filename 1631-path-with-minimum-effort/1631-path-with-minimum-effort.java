class Pair{
    
    int first;
    int second;
    int third;
    public Pair(int first , int second , int third){
        
        this.first = first;
        this.second = second;
        this.third = third;
        
    }
    
    
}

class Solution {
    public int minimumEffortPath(int[][] heights) {
        
int n = heights.length;
        int m = heights[0].length;
        
   int dist[][] = new int[n][m];
        
        for(int rows[] : dist){
            Arrays.fill(rows , (int)1e9);
        }
        
        dist[0][0] = 0;
        
        PriorityQueue<Pair> pq = new PriorityQueue<>((x , y) -> x.first - y.first);
        
        pq.add(new Pair(0 ,0 , 0));
        
        int drow[] = {-1 , 0 , 1 , 0};
        int dcol[] = {0 , 1 , 0 , -1};
        
        while(pq.size() != 0){
            
            Pair cur = pq.poll();
            int distance = cur.first;
            int row = cur.second;
            int col = cur.third;
            
            if(row == n-1 && col == m-1){
                return distance;
            }
            
            
           for(int i = 0; i < 4; i++){
               
          int nrow = row + drow[i];
               int ncol = col + dcol[i];
               
          if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m){
              
              int maxeffort = Math.max(distance , Math.abs(heights[row][col] - heights[nrow][ncol]));
              
              if(maxeffort < dist[nrow][ncol]){
                  
                  dist[nrow][ncol] = maxeffort;
                  pq.add(new Pair(maxeffort , nrow , ncol));
              }
              
              
              
          }     
               
               
               
               
               
               
               
           } 
            
            
            
            
            
            
        }
        
        
        
        
        return 0;
        
        
    }
}