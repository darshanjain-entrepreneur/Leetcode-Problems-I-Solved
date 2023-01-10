class Solution {
    
    
    public int find(List<List<Integer>> triangle , int i , int j , int n , int m , int dp[][]){
        if(i == n){
            return triangle.get(i).get(j);
            
        }
    if(dp[i][j] != -1){
        return dp[i][j];
    }
        
        
      int down = triangle.get(i).get(j) + find(triangle , i + 1 , j , n , m , dp);
        int diagonal = triangle.get(i).get(j) + find(triangle , i + 1 , j + 1 , n , m , dp);
        
        
        return  dp[i][j] =   Math.min(down , diagonal);
        
        
        
    }
    
    
    
    
    
    public int minimumTotal(List<List<Integer>> triangle) {
        
       
        
        
        
        
        
        int n = triangle.size();
        int m = triangle.get(n-1).size();
        
        int dp[][] = new int[n][m];
        
        for(int rows[] : dp){
            Arrays.fill(rows , -1);
        }
        
        
        return find(triangle , 0 , 0 , n - 1 , m - 1 , dp);
        
        
    }
}