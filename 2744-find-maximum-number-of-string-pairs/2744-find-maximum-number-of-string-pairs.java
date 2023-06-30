class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        
        
        HashMap<String , Integer> map = new HashMap<>();
        
    
        for(int i = 0; i < words.length; i++){
            
            map.put(words[i] , i);
        }
        
        int count = 0;
        for(int i = 0; i < words.length; i++){
            
            StringBuilder b = new StringBuilder(words[i]);
            b.reverse();
            
           if(map.containsKey(b.toString()) && (map.get(b.toString()) != i)){
               
               count++;
               
           } 
            
            map.remove(words[i]);
            
            
            
        }
     
        return count;
    }
}