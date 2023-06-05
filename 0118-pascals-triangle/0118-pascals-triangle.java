class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i = 1; i <= numRows; i++){
            
            
            ans.add(find(i));
            
            
            
            
            
            
        }
       
     return ans;
        
    }
       
        public List<Integer> find(int row){
            
           List<Integer> ll = new ArrayList<>();
            int ans = 1;
            ll.add(ans);
            
            for(int i = 1; i< row; i++){
                
                ans = ans*(row - i);
                ans = ans/i;
                
                ll.add(ans);
            }
            
            
            
            
            return ll;
            
        }
}