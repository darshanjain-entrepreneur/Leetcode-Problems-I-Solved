class Solution {
    ArrayList<String> ll = new ArrayList<>();
    
    
    public String findDifferentBinaryString(String[] nums) {
        
        HashMap<String , Integer> map = new HashMap<>();
        
        for(String i : nums){
            
            map.put(i ,1);
        }

      
        
    solve(0 , "" , nums.length , map);  
        
        return ll.get(0);
        
    }
    
    public void solve(int i , String p , int n,   HashMap<String , Integer> map){
        
        
     if(p.length() == n && map.containsKey(p) == false && ll.size()==0){
         
         ll.add(p);
         
         return;
         
     }
        
        if(i == n){
            return;
        }
        
        
    solve(i+1 , p +"" + '0' , n , map);
        solve(i+1 , p +"" + '1' , n , map);
        
        
        
        
    }
}