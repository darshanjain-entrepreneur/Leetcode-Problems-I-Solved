class Solution {
    public int subsetXORSum(int[] nums) {
        
        
        List<Integer> ll = new ArrayList<>();
        
        
        int ans[] = new int[1];
        
        find(0 , nums , ll , ans);
        
       return ans[0]; 
        
    }
    
    public void find(int i , int nums[] ,List<Integer> ll , int ans[] ){
        
        
        if(i == nums.length){
            
            if(ll.size() == 0){
                
                
            }else{
                
                int a = ll.get(0);
                
                for(int j = 1; j < ll.size();j++){
                    
                    
                    a = a^ll.get(j);
                    
                    
                    
                    
                }
                
                ans[0]  = ans[0] + a;
                
            }
            
            
           return; 
        }
        
        
        ll.add(nums[i]);
        find(i+1 , nums, ll , ans);
        
        ll.remove(ll.size() -1);
        
        find(i+1 , nums , ll ,ans);
        
        
        
    }
}