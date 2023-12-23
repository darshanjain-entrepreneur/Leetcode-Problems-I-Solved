class Solution {
    public boolean isPathCrossing(String path) {
        
        
        
    HashSet<String> set = new HashSet<>();
        
        int x = 0; int y = 0;
        
        String a = "(" + x + " " + y + ")";
        
        set.add(a);
     
        for(int i = 0; i < path.length(); i++){
            
          
            if(path.charAt(i) == 'N'){
                y++;
            }else if(path.charAt(i) == 'S'){
                
                y--;
            }else if(path.charAt(i) == 'W'){
                x--;
            }else{
                
                
                x++;
                
            }
            
            
            String b = "(" +x + " " + y + ")";
            
            if(set.contains(b)){
                return true;
            }else{
                set.add(b);
            }
            
            
            
        }
        return false;
    }
}