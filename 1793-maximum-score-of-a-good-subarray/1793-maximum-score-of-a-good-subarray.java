class Solution {
    public int maximumScore(int[] nums, int k) {
        
        
        Stack<Integer> st = new Stack<>();
      int[] minleft = new int[nums.length];
        int[] minright = new int[nums.length];
        
        
        for(int i = 0; i < nums.length; i++){
            
            if(i == 0){
                
                minleft[i] = -1;
                
                st.add(i);
            }else{
                
                while(!st.isEmpty() && nums[st.peek()] >= nums[i]){
                    st.pop();
                }
                
                if(!st.isEmpty()){
                    
                    minleft[i] = st.peek();
                    st.add(i);
                }else{
                    minleft[i] = -1;
                    st.add(i);
                }
                
            }
            
        }
        
        // right
        st.clear();
        
        
        
          for(int i = nums.length-1; i >= 0; i--){
            
            if(i == nums.length-1){
                
                minright[i] = nums.length;
                
                st.add(i);
            }else{
                
                while(!st.isEmpty() && nums[st.peek()] >= nums[i]){
                    st.pop();
                }
                
                if(!st.isEmpty()){
                    
                    minright[i] = st.peek();
                    st.add(i);
                }else{
                    minright[i] = nums.length;
                    st.add(i);
                }
                
            }
            
        }
        
        
    System.out.println(Arrays.toString(minleft));
           System.out.println(Arrays.toString(minright));
       int sum = 0;
      
       for(int i = 0; i < nums.length; i++){
           
           int start = minleft[i]+1;
           int end = minright[i]-1;
           
           if(start <= k && start <= end && k <= end){
               
               sum = Math.max(sum , nums[i]*(end-start+1));
           }
           
           
           
       }
        
        
        return sum;
    }
}