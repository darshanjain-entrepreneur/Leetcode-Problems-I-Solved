class Solution {
    public char findTheDifference(String s, String t) {
             int nums[] = new int[26];
        
        
        for(int i = 0; i < s.length(); i++){
            
            int a = (int)(s.charAt(i) - 'a');
            
            nums[a] = nums[a]+1;
            
            
            
            
        }
        
        for(int i = 0; i < t.length(); i++){
            
            
            int b = (int)(t.charAt(i) - 'a');
            
            nums[b] = nums[b] -1;
            
            
            
            
        }
        
        
        for(int i = 0; i <= 25; i++){
            
            if(nums[i] != 0){
                
                return (char)(i +'a');
            }
            
        }
        
        return 'a';
    }
}