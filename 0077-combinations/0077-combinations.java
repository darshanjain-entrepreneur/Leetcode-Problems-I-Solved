class Solution {
    public List<List<Integer>> combine(int n, int k) {
        
        
        List<List<Integer>> result = new ArrayList<>();
        
        int ans = k;
        
        find(1 , n , k , new ArrayList<Integer>() , result , ans);
        
        return result;
        
        
    }
    
    public void find(int i , int n , int k ,  ArrayList<Integer> ll , List<List<Integer>> result , int ans){
        
        if(i> n && k > 0){
            
            return;
        }
        
        if(k == 0){
            
        if(ll.size() == ans){
            
            result.add(new ArrayList<Integer>(ll));
        }
            return;
            
            
        }
        
        ll.add(i);
        find(i + 1 , n , k-1 , ll , result , ans);
        
        ll.remove(ll.size() - 1);
        find(i + 1 , n , k , ll , result , ans);
        
        
    }
}