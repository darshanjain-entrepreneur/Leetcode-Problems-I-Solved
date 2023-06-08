class Solution {
    public int[] countBits(int n) {
        
        int ans[] = new int[n+1];
        int dp[] = new int[n+2];
        Arrays.fill(dp, -1);
        for(int i = 0; i <= n; i++){
            
            
            int no = find(i , dp);
            ans[i] = no;
            
            
            
            
        }
        
        return ans;
        
    }
    
    public int find(int i , int dp[] ){
        
        if(i  <= 1){
            return i;
        }
        
        if(dp[i] != -1){
            return dp[i];
        }
        
        int ans = 0;
       
        if(i % 2 == 0){
            
            ans =  find(i/2 , dp);
        }else{
            
            ans = 1 +  find(i/2 , dp);
        }
        
       return dp[i] = ans;
        
    }
}