class Solution {
    public int minCost(String colors, int[] nT) {
       
        return find(0 , colors , -1 , nT);
        
    }
    
    public int find(int i , String colors , int prev , int nT[]){
        
       if(i >= colors.length()){
           
           return 0;
       } 
        int max = 0;
       
        if( prev != -1 &&  colors.charAt(i) == colors.charAt(prev)){
            
        if(nT[prev] > nT[i]){
            
            max = max + nT[i] +  find(i+1 , colors , prev , nT);
            
        }else{
            
           max = max + nT[prev] +  find(i+1 , colors , i , nT);   
            
        }
            
            
        }else{
            
            
          max = max + find(i+1 ,colors , i , nT);  
            
            
        }
        
        
        
        return max;
        
    }
    
    
    
    
    
}