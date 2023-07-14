class Solution {
    public int countDistinctIntegers(int[] nums) {
        
        
        HashMap<Integer , Integer> map = new HashMap<>();
        
        
        for(int i : nums){
            
            if(!map.containsKey(i)){
                
                map.put(i , 1);
            }
            
            StringBuilder b = new StringBuilder();
            b.append(i);
            b.reverse();
            String a = b.toString();
            int c = Integer.valueOf(a);
            if(!map.containsKey(c)){
                map.put(c ,1);
            }
            
            
        }
        
        return map.size();
    }
}