class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        
        
        HashMap<Integer , Integer> map = new HashMap<>();
        
        
        map.put(0 , -1);
        int sum = 0;
        
        for(int i = 0; i < nums.length; i++){
            
          sum = sum + nums[i];
            
            int b = sum%k;
            
            if(map.containsKey(b)){
                
                if(i - map.get(b)>=2 ){
                    return true;
                }else{
                    
                    
                }
                
                
            }else{
                
                
                map.put(b , i);
                
            }
            
            
            
            
            
            
        }
        
        
        return false;
        
    }
}