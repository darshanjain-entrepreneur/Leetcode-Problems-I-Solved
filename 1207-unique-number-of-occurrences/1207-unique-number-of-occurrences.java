class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
      HashMap<Integer  ,Integer> map = new HashMap<>();
        
        for(int i :arr){
            
            
            map.put(i , map.getOrDefault(i , 0) + 1);
            
            
            
            
            
        }
        
     
        int nums[]=new int[10000];
        
          for(int i :arr){
            
            
if(map.containsKey(i)){
               int c = map.get(i);
            nums[c] = nums[c] + 1;
}
            
            map.remove(i);
            
            
            
        }
        
      for(int i = 0; i < nums.length; i++){
          
          if(nums[i] > 1){
              return false;
          }
      }
        
        return true;
    }
}