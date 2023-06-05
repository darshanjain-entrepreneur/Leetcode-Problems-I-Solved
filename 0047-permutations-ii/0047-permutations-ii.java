class Solution {
    
    List<List<Integer>> result = new ArrayList<>();
    
    
    
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        int n = nums.length;
        Arrays.sort(nums);
        
        boolean[] check = new boolean[n];
        
        
        backtracking( check , nums , new ArrayList<Integer>());
        
        return result;
        
        
    }
    
    public void backtracking( boolean check[] , int nums[] ,ArrayList<Integer> ll){
        
        if(ll.size() == nums.length && !result.contains(ll)){
            
            result.add(new ArrayList<Integer>(ll));
            return;
            
            
        }
        
        
        
        
        for(int i = 0; i < nums.length; i++ ){
            
           if(check[i]){
               
               continue;
           } 
            
            
            check[i] = true;
            ll.add(nums[i]);
            backtracking(check , nums , ll);
            
            check[i] = false;
            ll.remove(ll.size() - 1);
            
            
            
        }
        
        
    }
}