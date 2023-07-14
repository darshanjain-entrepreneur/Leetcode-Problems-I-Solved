class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        
        
      
        
      List<String> ll = new ArrayList<>();  
        
        for(String s : words){
            
           HashMap<Character , Character> map1 = new HashMap<>();
                HashMap<Character , Character> map2 = new HashMap<>();
            
           int  count = 0;
            for(int i = 0; i < pattern.length(); i++){
                
         char ch1 = pattern.charAt(i);
                char ch2 = s.charAt(i);
                
              if(!map1.containsKey(ch1) && !map2.containsKey(ch2)){
                  
                  map1.put(ch1 , ch2);
                  map2.put(ch2 , ch1);
                  
              }else{
                  
                  if(!map1.containsKey(ch1) && map2.containsKey(ch2)){
                      count =1;
                      break;
                  }else if(map1.containsKey(ch1) && !map2.containsKey(ch2)){
                      count = 1;
                      break;
                  }else{
                      
                      if(map1.get(ch1) == ch2 && map2.get(ch2) == ch1){
                          
                      }else{
                          count = 1;
                          break;
                      }
                      
                  }
                  
                  
                  
              }
                
                
                
                
            }
            
            
            if(count == 0){
                
                ll.add(s);
            }
            
            
            
        }
        
        
        
        
        return ll;
        
        
    }
}