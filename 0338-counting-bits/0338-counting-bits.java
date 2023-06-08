class Solution {
    public int[] countBits(int n) {
        
        int ans[] = new int[n+1];
        
        for(int i = 0; i <= n; i++){
            
            
            int no = find(i , 0);
            ans[i] = no;
            
            
            
            
        }
        
        return ans;
        
    }
    
    public int find(int i , int count){
        
        if(i  <= 1){
            return i;
        }
        
        
       
        if(i % 2 == 0){
            
            return find(i/2 , count);
        }else{
            
            return 1 +  find(i/2 , count);
        }
        
       
        
    }
}