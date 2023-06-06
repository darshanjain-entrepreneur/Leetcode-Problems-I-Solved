class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        
              List<List<Integer>> result = new ArrayList<>();

     
    backtracking(1 , n , new ArrayList<Integer>() , result , k);
     
     return result;
    
        
        
        
        
        
    }
    
    public void backtracking(int index , int n , List<Integer> ll ,  List<List<Integer>> result , int k ){
        
        
        if(n == 0 && k == 0){
            
            result.add(new ArrayList<Integer>(ll));
            return;
        }
        
        if(index > 9){
            return;
        }
        
       if(k < 0){
           return;
       }
        
        if(index <= n){
            
            ll.add(index);
            backtracking(index + 1 , n - index , ll , result , k - 1);
            ll.remove(ll.size() - 1);
        }
        
        backtracking(index + 1 , n , ll , result , k );
        
        
        
    }
}