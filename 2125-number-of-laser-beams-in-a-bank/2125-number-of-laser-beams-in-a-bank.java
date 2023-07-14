class Solution {
    public int numberOfBeams(String[] bank) {
        
        int m = bank.length;
        
        if(m==1){
            return 0;
        }
        
     int sum = 0;
   
      int start = 0;
        int end = start+1;
        
        while(start < bank.length-1 && end < bank.length){
            
            int count1 = 0;
              int count2 = 0;
         for(int i = 0;i<bank[start].length(); i++){
             
             char ch = bank[start].charAt(i);
             if(ch =='1'){
                 count1++;
             }
             
             
             
         }
          
            for(int i = 0;i<bank[end].length(); i++){
             
             char ch = bank[end].charAt(i);
             if(ch =='1'){
                 count2++;
             }
             
             
             
         }
           
            
         if(count1 == 0 && count2 == 0){
             start++;
             end++;
         }else if(count1 != 0 && count2 != 0){
             
             sum = sum + (count1*count2);
             start = end;
             end++;
         }else if(count1 == 0 && count2 != 0){
             start = end;
             end++;
             
         }else{
             end++;
             
         }   
            
            
            
            
        }
        
        
        return sum;
        
    }
}