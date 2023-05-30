class Solution {
    public int subarraySum(int[] nums, int k) {
        
        
        HashMap<Integer , Integer> map = new HashMap<>();
        
        
        int count = 0;
        int n = nums.length;
        
        int prevsum = 0;
        
        for(int i = 0; i <n; i++ ){
            
            prevsum+= nums[i];
            
            if(prevsum == k){
                count++;
            }
            
            if(map.containsKey(prevsum - k)){
                
                count+= map.get(prevsum - k);
                map.put(prevsum - k , map.get(prevsum - k));
                
            }
            
            
            if(map.containsKey(prevsum)){
                map.put(prevsum , map.get(prevsum) + 1);
                
            }else{
                map.put(prevsum , 1);
            }
            
            
            
        }
        
        return count;
        
    }
}