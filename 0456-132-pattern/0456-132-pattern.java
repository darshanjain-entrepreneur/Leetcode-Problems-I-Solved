class Solution {
    public boolean find132pattern(int[] nums) {
        
        
        int prefix[] = new int[nums.length];
       
        
       int min = nums[0];
        
 for(int i = 0; i < nums.length; i++){
     
     if(i == 0){
         prefix[i] = min;
     }else{
         
         min = Math.min(min , nums[i]);
         prefix[i] = min;
         
         
     }
     
     
 }
     Stack<Integer> st = new Stack<>();

     for(int j = nums.length-1; j >= 0; j--){
         
         while(st.size() > 0 && st.peek() <= prefix[j]){
             
             
             st.pop();
             
         }
         
         if(st.size() > 0 && st.peek() < nums[j] ){
             
             return true;
         }
         
         st.push(nums[j]);
         
     }   
        
        
      return false;
        
    }
}