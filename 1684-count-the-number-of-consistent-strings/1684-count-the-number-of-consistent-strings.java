class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        
       int arr[] = new int[26];
        int count =0;
        
        
      for(int i =0; i < allowed.length(); i++){
          
              int pp = (int)(allowed.charAt(i) -'a');
          arr[pp] = 1;
          
          }
        
        
        
        for(String s : words){
            
            int h = 0;
            for(int i = 0; i < s.length(); i++){
                
                int k = (int)(s.charAt(i)-'a');
                
               if(arr[k] == 1){
                   
                   
               }else{
                   h = 1;
                   break;
               } 
                
                
                
                
            }
            
            
            if(h==1){
                
            }else{
                count++;
            }
            
            
            
        }
        
        
        return count;
        
    }
}