class Solution {
    public List<String> generateParenthesis(int n) {
        
        
        
        List<String> ans = new ArrayList<>();
        
        find("(" , 1 , 0 , ans , n);
        
        return ans;
        
        
        
        
        
    }
    
    public void find(String current , int o , int c , List<String> ans  , int n ){
        
        if(current.length() == 2*n){
            
            ans.add(current);
            return;
        }
        
        
        
       if(o < n){
           find(current + "(" , o+1 , c , ans , n);
       } 
        
        if(c <o){
            find(current + ")" , o  ,c+1 , ans , n);
        }
        
    }
}