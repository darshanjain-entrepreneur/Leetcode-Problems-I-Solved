class Solution {
    
    int N = 0;
    int M = 0;
    int K = 0;
    int Mod = (int)(1e9) + 7;
    
    
    public int numOfArrays(int n, int m, int k) {
        N = n;
        M = m;
        K = k;
        int dp[][][] = new int[51][51][101];
        
        for(int row[][] : dp){
            for(int col[] : row){
                Arrays.fill(col , -1);
            }
        }
        return find(0 , 0 , 0 , dp);
    }
    
    public int find(int i , int searchcost , int maxvalue , int dp[][][]){
        
        if(i == N){
            
            if(searchcost == K){
                return 1;
            }
            return 0;
        }
        
        if( dp[i][searchcost][maxvalue] != -1){
            
            return  dp[i][searchcost][maxvalue];
        }
       
        int result  = 0;
        
        for(int j = 1; j <=M; j++){
            
            if(j > maxvalue){
                
                result = (result + find(i+1 , searchcost+1 , j , dp)%Mod)%Mod;
            }else{
                
                result = (result + find(i+1 , searchcost , maxvalue , dp)%Mod)%Mod;
            }
            
        }
        
        return  dp[i][searchcost][maxvalue] =  result%Mod;
        
    }
}