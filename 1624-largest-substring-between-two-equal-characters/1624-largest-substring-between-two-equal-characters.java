class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        

        HashMap<Character , Integer> map1 = new HashMap<>();
                HashMap<Character , Integer> map2 = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            
            
            if(map1.containsKey(s.charAt(i)) == false){
                
                map1.put(s.charAt(i) , i);
                
            }
            
            map2.put(s.charAt(i) , i);
        }
        
        int ans= -1;
        
        for(char a : map1.keySet()){
            
            int aa = map1.get(a);
            int bb = map2.get(a);
            ans = Math.max(ans , bb - aa +1 - 2);
            
        }
        return ans;
    }
}