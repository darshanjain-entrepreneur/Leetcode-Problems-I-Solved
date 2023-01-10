class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int m = triangle.get(n-1).size();
        
        
        
        int prev[] = new int[n];
        
        for(int i = 0 ; i  < m; i++){
            
            prev[i] = triangle.get(n-1).get(i);
            
            
        }
        
        
        for(int i = n -2 ; i >= 0; i--){
            
            int cur[] = new int[n];
            
            for(int j = i ; j >= 0; j--){
                
                int down = triangle.get(i).get(j) + prev[j];
                
                int up = triangle.get(i).get(j) + prev[j + 1];
                
                cur[j] = Math.min(down , up);
                
            }
            
            prev = cur;
            
        }
        
        
        return prev[0];
        
        
    }
}