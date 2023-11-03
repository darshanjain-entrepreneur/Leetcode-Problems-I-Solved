class Solution {
    public List<String> buildArray(int[] target, int n) {
        
        
        List<String> st = new ArrayList<>();
        Stack<Integer> ss = new Stack<>();
        Arrays.sort(target);
        
        int k = 0;
        
        for(int i = 1; i <= n; i++){
            
          if(k == target.length){
              break;
          }
            
            
            if(target[k] != i){
                
                st.add("Push");
                ss.add(i);
                continue;
                
                
            }
            
            
            while(!ss.isEmpty()){
                
                if(k > 0 && target[k-1] == ss.peek()){
                    
                    break;
                    
                }else{
                    
                    
                    st.add("Pop");
                    ss.pop();
                    
                    
                }
                
                
                
                
                
            }
            
            
            
            st.add("Push");
            ss.add(i);
            k++;
            
            
            
            
        }
        
        
        return st;
        
    }
}