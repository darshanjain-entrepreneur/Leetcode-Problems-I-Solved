class Solution {
    public List<Integer> partitionLabels(String s) {
        
        List<Integer> ans = new ArrayList<>();
        
       HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            
            map.put(s.charAt(i) , i);
            
        }
        StringBuilder b = new StringBuilder();
        
        int i = 0;
        int start = 0;
        int end = map.get(s.charAt(0));
        
        while(i < s.length()){
            char ch = s.charAt(i);
            
            
            if(i == end){
                b.append(ch);
                int a = b.length();
              ans.add(a);
                b.delete(0 , b.length());
                i++;
                
                
                
            }else{
                
                if(map.get(ch) > end){
                    end = map.get(ch);
               
               
                }else{
                    
                    b.append(ch);
                    i++;
                }
                
                
                
            }
            
            
            
            
        }
        
        return ans;
    }
}