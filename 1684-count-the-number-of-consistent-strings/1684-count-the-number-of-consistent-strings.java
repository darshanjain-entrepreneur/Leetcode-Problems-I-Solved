class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        
        HashMap<Character , Integer> map = new HashMap<>();
        int count =0;
        
        
      for(int i =0; i < allowed.length(); i++){
          
          map.put(allowed.charAt(i) , 1);
          
          }
        
        
        
        for(String s : words){
            
            int h = 0;
            for(int i = 0; i < s.length(); i++){
                
               if(map.containsKey(s.charAt(i))){
                   
                   
               }else{
                   h = 1;
                   break;
               } 
                
                
                
                
            }
            
            
            if(h==1){
                
            }else{
                count++;
            }
            
            
            
        }
        
        
        return count;
        
    }
}