class Solution {
    public int[] fairCandySwap(int[] al, int[] bo) {
        
        
        int sum1 = 0;
        int sum2 = 0;
        
        int n = al.length;
        int m = bo.length;
        
        for(int i = 0; i < n; i++){
            
            sum1 = sum1 + al[i];
        }
        
        for(int j = 0; j < m; j++){
            
            sum2 = sum2 + bo[j];
        }
        
        
        Arrays.sort(al);
        Arrays.sort(bo);
        
        
        int i = 0;
        int j = 0;
        
        while(i < n && j < m){
            
        int p = sum1 - al[i] + bo[j];
            
            int q = sum2 - bo[j] + al[i];
            
            if(p == q){
                
                return new int[]{al[i] , bo[j]};
            }
            
            if(p > q){
                
                i++;
                
                
                
            }else{
                
                j++;
            }
            
            
            
            
            
            
        }
        
        
        
        return new int[]{0 , 0};
        
        
    }
}