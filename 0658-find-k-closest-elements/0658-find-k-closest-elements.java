class Solution {
    public List<Integer> findClosestElements(int[] nums, int k, int x) {
        
        
    
        int index = 0;
        if(x < nums[0]){
            
            index = 0;
        }else if(x > nums[nums.length-1]){
            
            index = nums.length-1;
        }else{
             for(int i = 0; i < nums.length; i++){
            
            if(nums[i] == x){
                index = i;
                break;
            }else if(i > 0 && nums[i] > x){
                
                index = i-1;
                break;
            }
            
            
        }
        }
        
        
       
        
        
       int start = index;
        int end = index+1;
        List<Integer> ans = new ArrayList<>();
        
        while(k > 0){
            
            
           if(start >= 0 && end < nums.length){
               int abs1 = Math.abs(x - nums[start]);
               int abs2 = Math.abs(x - nums[end]);
               
               if(abs1 <= abs2){
                   ans.add(nums[start]);
                   k--;
                   start--;
                   
               }else{
                   ans.add(nums[end]);
                   k--;
                   end++;
                   
               }
               
           }else if(start >= 0 && end >= nums.length){
               
               while(start >= 0 && k > 0){
                   
                   ans.add(nums[start]);
                   k--;
                   start--;
                   
               }
               
               break;
               
           }else{
               
                  while(end < nums.length && k > 0){
                   
                   ans.add(nums[end]);
                   k--;
                 end++;
                   
               }
               
               break;
               
               
               
           }
            
            
            
            
            
            
        }
        
        Collections.sort(ans);
        return ans;
        
        
    }
}