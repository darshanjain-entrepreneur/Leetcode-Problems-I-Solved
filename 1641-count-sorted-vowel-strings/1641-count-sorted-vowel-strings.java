class Solution {
    
    public int count(int n , char ch1 , char ch[]){
        
       if(n==0){
           return 1;
           
       }
        
      int temp = 0;
        
        for(char chh : ch){
            
            if(chh >= ch1){
                
                temp = temp + count(n-1 , chh , ch);
            }
            
            
        }
        
        
        return temp;
    }
    
    
    public int countVowelStrings(int n) {
        
        int ans = 0;
        char ch[] = {'a' , 'e' , 'i' , 'o' , 'u'};
        
        for(char ch1 : ch){
            
            
            ans = ans + count(n-1 , ch1 , ch);
            
            
         
            
        }
        
        
        
          return ans; 
        
        
    }
}