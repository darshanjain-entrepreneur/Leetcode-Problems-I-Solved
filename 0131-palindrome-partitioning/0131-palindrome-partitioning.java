class Solution {
    
    public boolean isPalindrome(int i , int j , String s){
        
        
        while(i < j){
            
            if(s.charAt(i) != s.charAt(j)){
                
                return false;
            }else{
                i++;
                j--;
                
            }
        }
        
        
        return true;
    }
    
    public List<List<String>> partition(String s) {
        
        
        List<List<String>> ans = new ArrayList<>();
        
        find(0 , s , ans , s.length() , new ArrayList<>());
        
        return ans;
        
    }
    
    
    public void find(int i , String s , List<List<String>> ans , int n , List<String> temp ){
        
        if(i == n){
            
            if(temp.size() > 0){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        
        
       for(int j = i; j < n; j++){
           
          if(isPalindrome(i , j , s)){
              
              String st = s.substring(i , j+1);
              temp.add(st);
              find(j + 1 , s , ans , n , temp);
              
              temp.remove(temp.size()-1);
          } 
           
           
           
           
       } 
        
        
        
        
        
    }
}