class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        
        int metal = 0;
        int paper = 0;
        int glass = 0;
           int count1 = 0;
                int count2 = 0;
                int count3 = 0;
        
        for(int i = garbage.length-1; i >= 0; i--){
            
            if(i == 0){
             
              for(int j = 0; j < garbage[0].length(); j++){
                  
                  char ch = garbage[0].charAt(j);
                  if(ch == 'M'){
                      metal++;
                  }else if(ch == 'P'){
                      paper++;
                  }else{
                      glass++;
                      
                  }
                  
                  
                  
              }  
                
                
                
            }else{
                
             
                
                for(int j = 0; j < garbage[i].length(); j++){
                    
                     char ch = garbage[i].charAt(j);
                  if(ch == 'M'){
                      metal++;
                      count1 = 1;
                  }else if(ch == 'P'){
                      paper++;
                      count2 = 1;
                      
                  }else{
                      glass++;
                      count3 = 1;
                      
                  }
                  
                    
                    
                    
                }
                    
                    
                 if(count1 == 1){
                     
                     metal = metal + travel[i-1];
                     
                 }
                if(count2 == 1){
                    
                    paper = paper + travel[i-1];
                }
                
                if(count3 == 1){
                    glass = glass + travel[i-1];
                }
                
            }
            
            
            
            
            
        }
        
        return paper+metal+glass;
    }
}