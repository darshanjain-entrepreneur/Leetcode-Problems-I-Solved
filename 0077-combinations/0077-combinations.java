class Solution {
    public List<List<Integer>> combine(int n, int k) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
       findcomb(n , k , new ArrayList<>() , ans);
        
        
        return ans;
    }
    
    public void findcomb(int n , int k , List<Integer> ll ,  List<List<Integer>> ans ){
        
        if(n <= 0 || ll.size() == k){
            
            if(ll.size() == k){
                
                ans.add(new ArrayList<>(ll));
                
            }
            
            return;
        }
        
        ll.add(n);
        findcomb(n-1 , k , ll , ans);
        
        ll.remove(ll.size() -1);
        findcomb(n-1 , k , ll , ans);
        
        
        
        
        
    }
}