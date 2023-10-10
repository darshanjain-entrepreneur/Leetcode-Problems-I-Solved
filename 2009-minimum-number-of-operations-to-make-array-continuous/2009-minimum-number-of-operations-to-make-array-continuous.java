class Solution {
    
    
    public int solve( ArrayList<Integer> ll,int start , int startvalue , int endvalue , HashSet<Integer> set){
        
       
        int end = ll.size()-1;
        int index = -1;
        
        while(start <= end){
            
            int mid = (end-start)/2 + start;
            if(ll.get(mid) >= startvalue && ll.get(mid) <= endvalue){
                index = Math.max(index , mid);
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        
        
       return index; 
        
        
    }
    
    public int minOperations(int[] nums) {
        
        
        HashSet<Integer> set = new HashSet<>();
        
        Arrays.sort(nums);
        
        
        ArrayList<Integer> ll = new ArrayList<>();
        
        for(int i : nums){
            
            if(set.contains(i) == false){
                ll.add(i);
            }
            set.add(i);
        }

        
        int ans = (int)(1e9);
        
        
        for(int i = 0; i < ll.size(); i++){
            
            int start = ll.get(i);
            int end = ll.get(i) + nums.length-1;
            
            int  index = solve(ll , i , start , end , set);
          
            int value = index - i +1;
            ans = Math.min(ans , nums.length - value);
            
            
        }
        
        
        return ans;
        
        
        
    }
}