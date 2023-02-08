class Solution {
    public String minWindow(String s, String t) {
        
        
        HashMap<Character , Integer> map1 = new HashMap<>();
        
        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
            map1.put(ch , map1.getOrDefault(ch , 0) + 1);
        }
        
        
        int i = -1;
        int j = -1;
        int ideal = t.length();
        int real = 0;
        HashMap<Character , Integer> map2 = new HashMap<>();
        String ans = "";
        
        while(true){
            
            boolean f1 = false;
            boolean f2 = false;
            
            while(i < s.length() - 1 && real != ideal ){
                
                 i++;
            char c = s.charAt(i);
            map2.put(c , map2.getOrDefault(c , 0) + 1);
                
                if(map2.getOrDefault(c , 0) <= map1.getOrDefault(c , 0)){
                    real++;
                }
                
                f1 = true;
                
            }
           
            while(j < i && real == ideal){
                String paths = s.substring(j + 1 , i+ 1);
                
                if( ans.length() == 0 ||  paths.length() < ans.length()){
                    ans = paths;
                }
                
                j++;
                char c = s.charAt(j);
                if(map2.get(c) == 1){
                    map2.remove(c);
                }else{
                    map2.put( c , map2.getOrDefault(c , 0) - 1);
                }
                
                if(map2.getOrDefault(c , 0) < map1.getOrDefault(c , 0) ){
                    real--;
                }
                f2 = true;
            }
            
            
            if(f1 == false && f2 == false){
                break;
            }
            
            
        }
        
        return ans;
    }
}