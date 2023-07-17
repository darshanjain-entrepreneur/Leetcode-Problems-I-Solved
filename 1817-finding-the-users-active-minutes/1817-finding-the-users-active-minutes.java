class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        
        int answer[] = new int[k];
        
       HashMap<Integer , HashSet<Integer>> map = new HashMap<>();
        
        for(int temp[] : logs){
            
            if(!map.containsKey(temp[0])){
                
                map.put(temp[0] , new HashSet<>());
                
            }
            map.get(temp[0]).add(temp[1]);
        }
        
        
        
        
        for(HashSet<Integer> set : map.values()){
            
            System.out.println(set.size());
            int j  = set.size()-1;
            
          
            answer[j]++;
            
            
            
        }
        
        
        
        
        
        return answer;
        
    }
}