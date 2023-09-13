class Solution {
    public int candy(int[] ratings) {
        
     int n = ratings.length;
        if(n == 1){
            
            return 1;
        }
        
        int value[] = new int[n];
        
        int minvalue = (int)(1e9);
        
        for(int i = 0; i < ratings.length; i++){
            
         
            value[i] = 1;
        }
        
        int ans = ratings.length;
        
        for(int i = 1; i < n; i++){
            
            
            if(ratings[i] == ratings[i-1]){
                
                
            }else if(ratings[i] > ratings[i-1]){
                
                if(value[i] > value[i-1]){
                    
                }else{
                    int b = value[i-1] - value[i];
                    ans = ans +b + 1;
                    value[i] = value[i] +  b+1;
                }
                
            }else{
                
                if(value[i-1] > value[i]){
                    
                }else{
                   
                     int b = value[i] - value[i-1];
                    ans = ans +b + 1;
                    value[i-1] = value[i-1] +  b+1;
                }
                
            }
            
            
            
        }
        
        
        
          for(int i = n-1; i > 0; i--){
            
            
            if(ratings[i] == ratings[i-1]){
                
                
            }else if(ratings[i] > ratings[i-1]){
                
                if(value[i] > value[i-1]){
                    
                }else{
                    int b = value[i-1] - value[i];
                    ans = ans +b + 1;
                    value[i] = value[i] +  b+1;
                }
                
            }else{
                
                if(value[i-1] > value[i]){
                    
                }else{
                   
                     int b = value[i] - value[i-1];
                    ans = ans +b + 1;
                    value[i-1] = value[i-1] +  b+1;
                }
                
            }
            
            
            
        }
        
        
       
        return ans;
        
    }
}