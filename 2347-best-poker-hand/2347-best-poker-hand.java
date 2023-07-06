class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        
        HashMap<Character , Integer> map1 = new HashMap<>();
        
        HashMap<Integer , Integer> map2 = new HashMap<>();
        
        
        for(char ch : suits){
            
            map1.put(ch , map1.getOrDefault(ch , 0) +1);
            
            
        }
        
       if(map1.size() == 1){
           return "Flush";
       } 
        
        for(int ch : ranks){
            
            map2.put(ch , map2.getOrDefault(ch , 0) +1);
            System.out.println(map2.get(ch));
            if(map2.get(ch) >= 3){
                
                return "Three of a Kind";
            }
            
        }
        
          for(int ch : ranks){
            
           
            if(map2.get(ch) >= 2){
                
                return "Pair";
            }
            
         
       
          }
         return "High Card";
        
        
    }
}