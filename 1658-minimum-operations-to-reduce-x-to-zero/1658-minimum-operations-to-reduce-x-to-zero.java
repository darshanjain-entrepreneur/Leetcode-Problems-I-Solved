class Solution {
    public int minOperations(int[] nums, int x) {
        
        HashMap<Integer , Integer> map = new HashMap<>();
        
        
        int sum = 0;
        
        map.put(0 , 0);
        
        for(int i = 0; i < nums.length; i++){
            
            
            sum = sum + nums[i];
            map.put(sum , i);
            
            
        }
        
            
            if(x > sum){
                
                return -1;
            }
        
       
        int value = 0;
        sum = sum -x;
        int ans = 0;
        
        for(int i = 0; i < nums.length; i++){
            
            
            value = value+nums[i];
            
            if(map.containsKey(value-sum)){
                
                if(sum - value == 0){
                    
                   ans = Math.max(ans , i - map.get(value-sum) + 1); 
                }else{
                    
                    ans = Math.max(ans , i - map.get(value-sum));
                }
            }
            
            
        }
        
        if(ans == 0 ){
           
            if(sum == 0){
                return nums.length;
            }else{
                
                return -1;
            }
            
        }
        
       
        return nums.length-ans;
    }
}