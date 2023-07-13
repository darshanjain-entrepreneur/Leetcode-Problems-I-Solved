class Solution {
    public List<List<Integer>> groupThePeople(int[] g) {
        
    TreeMap<Integer , ArrayList<Integer>> map = new TreeMap<>();
        
        
        
        
        for(int i = 0; i < g.length; i++ ){
            
            if(map.containsKey(g[i])){
           
                
                map.get(g[i]).add(i);
                
            }else{
                
                map.put(g[i] , new ArrayList<Integer>());
                map.get(g[i]).add(i);
                
                
            }
            
            
            
            
            
            
            
        }
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i : map.keySet()){
            System.out.println(map.get(i));
            if(map.get(i).size() == i){
                
                ans.add(new ArrayList<>(map.get(i)));
                
            }else{
                
              int j = 0;
                while(j < map.get(i).size()){
                    
                   ArrayList<Integer> ll = new ArrayList<>();
                    for(int k = 0; k < i; k++){
                        
                        ll.add(map.get(i).get(j));
                        
                        j++;
                        
                    }
                    ans.add(new ArrayList<Integer>(ll));
                    
                    
                    
                }
                
                
                
            }
            
            
            
        }
        
        
        
        
        return ans;
        
        
        
    }
}