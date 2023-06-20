class Solution {
    public int findFinalValue(int[] nums, int original) {
        
        HashMap<Integer , Integer> map = new HashMap<>();
        
        
        for(int i = 0; i < nums.length; i++){
            
            
            map.put(nums[i] , 1);
            
        }
        
        
        while(true){
            
            if(map.containsKey(original)){
                
                original = original*2;
            }else{
                
                
                break;
            }
            
            
            
            
            
        }
        
        return original;
        
    }
}