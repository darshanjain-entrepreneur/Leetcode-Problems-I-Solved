class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        
      
     
     
        HashMap<Integer , Integer> map = new HashMap<>();
        
    for(int i = 0; i < nums.length; i++){
        
        if(map.containsKey(nums[i])){
            
            
            map.put(nums[i] , map.get(nums[i]) + 1);
            
            
            
            
        }else{
            
            map.put(nums[i] , 1);
            
            
        }
        
        
        
        
        
        
    }
        
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            
            
            if(map.containsKey(nums[i])){
                
            
                
                    if(map.get(nums[i]) >=2){
                    int n = map.get(nums[i]);
                    
                    count+= (n)*(n-1)/2;
                    
                    map.remove(nums[i]);
            
                    }
                
                
                
            }
            
            
            
        }
        
       return count; 
    }
}