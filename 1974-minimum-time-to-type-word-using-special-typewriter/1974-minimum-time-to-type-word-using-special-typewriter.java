class Solution {
    public int minTimeToType(String word) {
        
   char ch = 'a';
        int i = 0;
        int min = 0;
        
        while(i < word.length()){
            
            
           if(ch >= word.charAt(i)){
               
               int a = (int)(word.charAt(i) -'a');
               a = a+1;
               int b = (int)(ch - 'a');
               b = b+1;
               
               if(a-(b-26) >= 0){
                     min = 1 +min + Math.min(b-a , a - (b-26));
               }else{
                   min = min + b-a+1;
               }
               
              ch = word.charAt(i);
               i++;
               
           } else{
               
               int a = (int)(word.charAt(i) -'a');
               a = a+1;
               int b = (int)(ch - 'a');
               b = b+1;
               
               if(b-(a-26) >= 0){
                   min = 1 +min + Math.min(a-b , b - (a-26));
               }else{
                                min = min +a-b+1;
               }
               

               
               ch = word.charAt(i);
               i++;
           }
            
            
            
            
            
            
            
        }
        
        
        
        
        return min;
        
        
        
    }
}