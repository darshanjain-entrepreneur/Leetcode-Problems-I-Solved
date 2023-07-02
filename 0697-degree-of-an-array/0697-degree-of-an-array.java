class Solution {
    public int findShortestSubArray(int[] nums) {
        
     
        
        HashMap<Integer , Integer> map1 = new HashMap<>();
        HashMap<Integer , Integer> map2 = new HashMap<>();
           HashMap<Integer , Integer> map3 = new HashMap<>();
        int freq = 0;
        
        for(int i = 0; i < nums.length; i++){
            
              
            if(map1.containsKey(nums[i])){
                map3.put(nums[i] , i);
                map1.put(nums[i] , map1.get(nums[i]) + 1);
                
            }else{
                
                map2.put(nums[i] , i);
                map1.put(nums[i] , 1);
                map3.put(nums[i] , i);
            }
            
            if(map1.get(nums[i]) > freq){
                
                freq = map1.get(nums[i]);
            }
           
            
            
        }
        int count = (int)1e9;
        
        for(int i =0; i < nums.length; i++){
            
            if(map1.get(nums[i]) == freq){
                
                count = Math.min(count , map3.get(nums[i]) - map2.get(nums[i])+1);
            }
            
            
        }
        
return count;
    }
}