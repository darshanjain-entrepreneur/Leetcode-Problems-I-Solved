class Solution {
    
    int dp[][];
    public int paintWalls(int[] cost, int[] time) {
        
        dp = new int[cost.length+1][cost.length+1];
        
    for(int row[] : dp){
        
        Arrays.fill(row ,-1);
    }
        
        return solve(0 , cost.length , cost , time);
    }


    public  int solve(int i, int wallsleft , int cost[] , int time[]){

       if(wallsleft <= 0){

           return 0;
       }

       if(i == cost.length){
           return (int)(1e9);
       }
        
        if(dp[i][wallsleft] != -1){
            
            return dp[i][wallsleft];
        }

        
        int take = cost[i] + solve(i+1 , wallsleft - time[i] - 1 , cost , time);
        
        int nottake = solve(i+1 , wallsleft , cost , time);
        
        return  dp[i][wallsleft] =  Math.min(take , nottake);
       



    }
    
}