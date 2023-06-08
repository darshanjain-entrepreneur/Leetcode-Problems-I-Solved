class Solution {
    public boolean divisorGame(int n) {
        
        
        
        return find( n );
    }
    
    public boolean find(int n ){
        
        if(n <= 1 ){
            
        return false;
            
            
        }
        boolean ans = false;
        
     int i = 1;
        while(i < n){
            
            if(n % i == 0){
                
             return  !find(n-i );
             
            }
            i++;
            
        }
        
      
        
        return ans;
        
    }
    

}