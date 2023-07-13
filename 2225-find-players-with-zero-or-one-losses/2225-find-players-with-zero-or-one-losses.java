class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        
        
  TreeMap<Integer , Integer> map1 = new TreeMap<>();
        TreeMap<Integer , Integer> map2 = new TreeMap<>();
        
        
        for(int i = 0; i < matches.length; i++){
            
            int winner = matches[i][0];
            int loser = matches[i][1];
            
      map1.put(loser , map1.getOrDefault(loser , 0) + 1);
            
      
   if(!map1.containsKey(winner)){
       System.out.println(winner);
         map2.put(winner , map2.getOrDefault(winner , 0) + 1);
   }else{
       
       map2.remove(winner);
   }
          
            if(map2.containsKey(loser)){
                map2.remove(loser);
            }
            
        }
        
        List<Integer> won = new ArrayList<>(map2.keySet());
        List<Integer> loss = new ArrayList<>();
        
        for(int i : map1.keySet()){
            
            if(map1.get(i) == 1){
                loss.add(i);
                
            }
            
        }
      
    
        
        List<List<Integer>> answer = new ArrayList<>();
        
        answer.add(new ArrayList<Integer>(won));
        answer.add(new ArrayList<Integer>(loss));
        
        
        return answer;
        
        
    }
}