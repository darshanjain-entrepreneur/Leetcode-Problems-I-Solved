class Solution {
    public long minimalKSum(int[] nums, int k) {
        
    long kk = k;
        
        long sum = (kk+1)*(kk)/2;
        
        
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        
        
        for(int i : nums){
            
            if(!set.contains(i) && i >= 1 && i <= k){
                
                count++;
                sum = sum - i;
            }
            
            set.add(i);
            
        }
        
        int a = k+1;
        
        while(count > 0){
            
            if(!set.contains(a)){
                count--;
                sum = sum + a;
                a++;
            }else{
                
                a++;
            }
        }
        
        
       return sum; 
    }
}