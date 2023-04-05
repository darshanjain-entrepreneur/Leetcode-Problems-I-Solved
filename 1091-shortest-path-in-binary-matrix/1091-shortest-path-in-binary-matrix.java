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
    public int shortestPathBinaryMatrix(int[][] grid) {
        


int n = grid.length;

        if(n == 1){
           if(grid[0][0] == 1){
               return -1;
           }else{
               return 1;
           }
        }

int dist[][] = new int[n][n];

for(int rows[] : dist){
    
    Arrays.fill(rows , (int)1e9);
    
}

dist[0][0] = 0;
        if(grid[0][0] == 1){
            return -1;
        }

Queue<Pair> q = new LinkedList<>();

q.add(new Pair(1 , 0 , 0));



while(!q.isEmpty()){
    
    Pair cur = q.poll();
    int distance = cur.first;
    int row = cur.second;
    int col = cur.third;
    
for(int i = -1; i<=1; i++){
    
    for(int j = -1; j <= 1; j++){
        
    int nrow = row + i;
        int ncol = col + j;
        
   if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < n && grid[nrow][ncol] == 0 &&
     dist[nrow][ncol] > distance + 1){
       
       dist[nrow][ncol] = distance + 1;
       if(nrow == n -1 && ncol == n-1){
           return distance + 1;
       }
       q.add(new Pair(distance + 1 , nrow , ncol));
       
   }     
        
        
        
        
    }
    
    
}
    
    
    
    
      
      
  }
    
    
    








return -1;

        
        
        
        
        
        
        
        
    }
}