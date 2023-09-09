class Solution {
    public int[] findOriginalArray(int[] nums) {
        
        int n = nums.length;
        
        if(n%2 != 0){
            
            return new int[]{};
        }
        
        
        int ans[] = new int[nums.length/2];
        
        Arrays.sort(nums);
        
        HashMap<Integer , Integer> map = new HashMap<>();
        
        int count = 0;
        
        for(int i : nums){
            
            if(i%2 != 0){
                count++;
            }
            
            map.put(i , map.getOrDefault(i , 0) + 1);
        }
        
        
        if(count > nums.length/2){
            
            return new int[]{};
        }
  
   count = 0;
        int k = 0;
        for(int i = nums.length-1; i >= 0; i--){
            
            
         if(map.containsKey(nums[i])){
             
             if(nums[i]%2 != 0){
                 
            return new int[]{};
                 
             }else{
                 
              if(map.containsKey(nums[i]/2)){ 
                 
                  map.put(nums[i] , map.get(nums[i])-1);
                 if(map.get(nums[i]) == 0){
                     map.remove(nums[i]);
                 }
                 
                  map.put(nums[i]/2 , map.get(nums[i]/2)-1);
                 if(map.get(nums[i]/2) == 0){
                     map.remove(nums[i]/2);
                 }
                 if(k < ans.length){
                     ans[k] = nums[i]/2;
                     k++;
                 }
              }else{
                 
                 return new int[]{};
             }
                  
             }
             
             
             
         }else{
             
             count++;
             
             
         }
            
            
            
            
            
        }
        
        if(count > nums.length/2){
            
            return new int[]{};
        }
        
        return ans;
        
        
    }
}