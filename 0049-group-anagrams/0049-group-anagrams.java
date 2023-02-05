class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
       
       HashMap<String , List<String>>  map = new HashMap<>(); 
     
        for(int i = 0; i < strs.length; i++){
            
            char ch[] = strs[i].toCharArray();
            Arrays.sort(ch);
            StringBuilder b = new StringBuilder();
            for(int j = 0 ; j < ch.length; j++){
                b.append(ch[j]);
                
            }
            
            String result = b.toString();
            
           if(!map.containsKey(result)){
               map.put(result , new LinkedList<String>());
           }
            map.get(result).add(strs[i]);
            
        }
        
        
        return new LinkedList<>(map.values());
        
        
        
        
        
    }
}