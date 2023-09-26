class Solution {
    public String removeDuplicateLetters(String s) {
        
        
        HashMap<Character , Integer> map = new HashMap<>();
        
        
        for(int i = 0; i < s.length(); i++){
            
                char c = s.charAt(i);
            map.put(c , i);
        }
        
        
        StringBuilder b = new StringBuilder();
        
        
        HashSet<Character> set = new HashSet<>();
        
        
        for(int i = 0; i < s.length(); i++){
            
            char c = s.charAt(i);
            
            if(set.contains(c) == true){
                continue;
            }
            
            while(b.length() > 0 && b.charAt(b.length()-1) > c && map.get(b.charAt(b.length()-1)) > i ){
                
                
                set.remove(b.charAt(b.length()-1));
                
                b.delete(b.length()-1 , b.length());
                
            }
            
            b.append(c);
            set.add(c);
            
        }
        
        return b.toString();
    }
}