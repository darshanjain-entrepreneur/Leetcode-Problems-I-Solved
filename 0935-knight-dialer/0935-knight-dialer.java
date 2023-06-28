class Solution {
    
    
    public long find(int i , int j , int visited[][] , int matrix[][] , int n , Long dp[][][]){
        
    if(i < 0 || j < 0 || i >= matrix.length || j >= matrix[0].length){
        
        return 0;
        
        
        
        
        
    }
        if((i==3 && j==0) || (i==3 && j==2)){
            return 0;
        }
  
        if(n==1){
            
            return 1;
        }
        
        if(dp[i][j][n] != null){
            return dp[i][j][n]%((long)(Math.pow(10 , 9)) + 7);
        }
  
        
        
        long first = find(i-2 , j-1 ,visited , matrix , n-1 , dp);
        long second = find(i-2 , j+1 , visited , matrix , n-1 , dp);
        long third = find(i-1 , j+2 , visited , matrix , n-1 , dp);
            long fourth = find(i+1 , j+2 , visited , matrix , n-1 , dp);
            long fifth = find(i+2 , j+1 , visited , matrix , n-1 , dp);
            long sixth = find(i+2 , j-1 , visited , matrix , n-1 , dp);
            long seventh = find(i+1 , j-2 , visited , matrix , n-1 , dp);
            long eight = find(i-1 , j-2 , visited , matrix , n-1 , dp);
        
      dp[i][j][n] =   first+second+third+fourth+fifth+sixth+seventh+eight;
        
        return dp[i][j][n]%((long)(Math.pow(10 , 9)) + 7);
        
    }
    
    
    
    
    
    public int knightDialer(int n) {
        
        
        int matrix[][] = {
            {1 , 2 , 3},
            {4 , 5 , 6},
            {7 , 8 , 9},
            {-1 , 0 ,-2 }
            
            
            
        };
     Long dp[][][] = new Long[5][4][n+1];
      
        
        
        int visited[][] = new int[matrix.length][matrix[0].length];
       long ans = 0;
      
        
      for(int i = 0; i < matrix.length; i++){
          
          for(int j = 0; j < matrix[0].length; j++){
              
              for(int rows[] : visited){
                  Arrays.fill(rows , 0);
              }
              
              visited[3][0] = 1;
        visited[3][2] = 1;
               
                  
                  
                   ans = ans + find(i , j , visited , matrix , n , dp);
              
              
             System.out.println(ans);
              
              
          }
          
          
      }
        
   ans =  ans%((long)(Math.pow(10 , 9)) + 7);
        
        return (int)(ans);
    
    }
}