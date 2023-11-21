class Solution {
    public int countNicePairs(int[] nums) {
        
     
        
        HashMap<Integer , Integer> map = new HashMap<>();
        
        int mod = (int)(1e9)+7;
        
        
        
        for(int i : nums){
            
            
            String a = ""+i;
            
            StringBuilder b = new StringBuilder(a);
            
            String c = b.reverse().toString();
            
            int d = Integer.valueOf(c);
            
            if(map.containsKey((i-d)) == false){
                map.put(i-d ,1);
            }else{
                map.put(i-d , map.get(i-d)+1);
            }
            
            
            
            
            
        }
        
        long ans = 0;
        
        for(int i : map.keySet()){
            
            long a = (long)(map.get(i));
            
            ans = (ans + ((a*(a-1))/2)%mod)%mod;
            
            
        }
        
        
        ans = ans%mod;
        
        return (int)(ans);
        
    }
}