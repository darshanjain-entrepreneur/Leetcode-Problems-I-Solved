class Solution {
    public int minDistance(String word1, String word2) {
        
        
        int dp[][] = new int[word1.length()][word2.length()];
        
        for(int rows[] : dp){
            
            Arrays.fill(rows , -1);
        }
        
        
        int ans = find(word1.length()-1 , word2.length()-1 ,word1 , word2 , dp);
        
        return word1.length()- ans + word2.length()-ans;
        
        
        
    }
    
    public int find(int i , int j , String word1 , String word2 , int dp[][]){
        
        if(i < 0 || j < 0){
            return 0;
        }
        
        if(dp[i][j]!= -1){
            return dp[i][j];
        }
        
        
        if(word1.charAt(i) == word2.charAt(j)){
            
            return dp[i][j] =  1 + find(i-1 , j-1 , word1 , word2 , dp);
        }else{
            
            return dp[i][j] =  Math.max(find(i-1 , j , word1 , word2 , dp),find(i , j-1 , word1 , word2 , dp));
        }
        
        
        
        
    }
    
}