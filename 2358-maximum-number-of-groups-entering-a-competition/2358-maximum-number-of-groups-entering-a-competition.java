class Solution {
    public int maximumGroups(int[] grades) {
        
        Arrays.sort(grades);
        
        if(grades.length == 1){
            return 1;
        }else if(grades.length ==2){
            return 1;
        }
        
     int start = 0;
        int end = 0;
        int prev = 0;
        int count =0;
        
        while(end < grades.length && start <= end){
            
          if(end-start+1 > prev){
              
              if(end == grades.length-1){
                  count++;
                  break;
              }else{
                  
                if(grades.length-1 - (end+1)+ 1 > (end-start+1)){
                    count++;
                    prev = end-start+1;
                    start = end+1;
                    end++;
                    
                }else{
                    count++;
                    break;
                    
                    
                }
                  
                  
                  
              }
              
              
          }else{
              
              end++;
              
              
          }  
            
            
            
        }
        
        
        
        
        return count;
        
    }
}