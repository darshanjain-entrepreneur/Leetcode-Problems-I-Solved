class Solution {
    public int findMaxK(int[] nums) {
        
        
        int ans = -1;
        HashMap<Integer , Integer> map = new HashMap<>();
        
        
        
        for(int i : nums){
            
           if(map.containsKey(-i)){
               
               if(i < 0){
                   ans = Math.max(ans , -i);
               }else{
                   
                   ans = Math.max(ans , i);
               }
           }else{
               
               map.put(i , 0);
           }
            
          
            
        }
        
        return ans;
       
    }
}