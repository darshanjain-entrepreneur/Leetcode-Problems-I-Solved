class Solution {
    public int reductionOperations(int[] nums) {
        
        
        Arrays.sort(nums);
        int a = nums[0];
        
        ArrayList<Integer> ll =new ArrayList<>();
        
        
        
   HashMap<Integer ,Integer> map = new HashMap<>();
       
        for(int i : nums){
            
            if(i == a){
                continue;
            }
            
            if(map.containsKey(i) == false){
                ll.add(i);
            }
          
            
            map.put(i , map.getOrDefault(i , 0)+1);
            
        }
        
        
     
    int ans = 0;
        
        for(int i =0; i < ll.size(); i++){
            
            ans = ans + (map.get(ll.get(i)))*(i+1);
            
        }
        
        
        
        return ans;
    }
}