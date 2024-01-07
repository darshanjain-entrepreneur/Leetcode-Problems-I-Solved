class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        
        int n = nums.length;
        
        int result = 0;
        
        HashMap<Integer , HashMap<Long , Integer>> map = new HashMap<>();
        
        for(int i = 0; i < n; i++){
            
            for(int j = 0; j < i; j++){
                
                long diff = (long)(nums[j]) - (long)(nums[i]);
                
                if(map.containsKey(j) == false){
                    
                    map.put(j , new HashMap<>());
                }
                
                if(map.get(j).containsKey(diff) == false){
                    
                    map.get(j).put(diff , 0);
                }
                
                int count = map.get(j).get(diff);
                
                
                  if(map.containsKey(i) == false){
                    
                    map.put(i , new HashMap<>());
                }
                
                if(map.get(i).containsKey(diff) == false){
                    
                    map.get(i).put(diff , 0);
                }
                
            map.get(i).put(diff , map.get(i).get(diff) + count+1);
                
                
                result = result+count;
            }
        }
        
        return result;
    }
}