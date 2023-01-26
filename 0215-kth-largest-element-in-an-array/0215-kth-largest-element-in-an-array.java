class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        int n = nums.length;
        PriorityQueue<Integer> p = new PriorityQueue<>();
        
        
        for(int j = 0; j <k ; j++ ){
            p.add(nums[j]);
            
        }
        
        for(int i =k; i < nums.length; i++ ){
            
            if(nums[i] > p.peek()){
                
                p.poll();
                p.add(nums[i]);
                
                
            }
            
            
            
            
        }
        
        return p.peek();
        
    }
}