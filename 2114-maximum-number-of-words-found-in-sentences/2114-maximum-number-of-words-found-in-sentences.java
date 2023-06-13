class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int max = 0;
        
        for(String st : sentences){
            int count = 1;
            
            if(st == " " || st == "" ){
                
                continue;
            }else{
                
                int a = 0;
              for(int i = 0; i < st.length(); i++){
                  
                  char ch = st.charAt(i);
                  if(ch==' '){
                      
                      a = 1;
                  }else{
                      
                      if(a == 1){
                          count++;
                      }
                      a = 0;
                      
                  }
                  
                  
                  
                  
                  
              }  
                
                
            
                
                
                
                
            }
          
            
                max = Math.max(count , max);
            
            
            
            
            
        }
        
        
        
        
        
        
        
        
        return max;
        
        
    }
}