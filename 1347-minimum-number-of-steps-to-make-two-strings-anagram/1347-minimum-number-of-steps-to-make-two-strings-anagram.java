class Solution {
    public int minSteps(String s, String t) {
        
        int sum1 = 0;
    int char1[]  = new int[26];
        
        for(int i = 0; i < s.length(); i++){
            
            
            int a = (int)(s.charAt(i)- 'a');
            
            char1[a]++;
            sum1++;
            
        }
        int char2[] = new int[26];
        
           for(int i = 0; i < t.length(); i++){
            
             int a = (int)(t.charAt(i)- 'a');
               
               if(char1[a] > 0){
                   char1[a]--;
                   sum1--;
               }else{
                   
                   char2[a]++;
               }
          
             }
        
        
   return sum1;
        
    }
}