class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
         TreeMap<Integer , Integer> map = new TreeMap<>();
        
        
        int max = 0;
        for(int i : nums){
            
            if(map.containsKey(i)){
                
                map.put(i , map.get(i) + 1);
                max = Math.max(max , map.get(i));
                
            }else{
                
                
                map.put(i , 1);
                max = Math.max(max , map.get(i));
                
                
            }
            
            
            
            
        }
        
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i = 0; i < max; i++){
            
            ans.add(new ArrayList<Integer>());
        }
        
        
       
    for(int i : map.keySet()){
        
        for(int j = 0; j < map.get(i); j++){
            
            ans.get(j).add(i);
            
        }
        
        
        
    }
        
        
        return ans;
    }
}