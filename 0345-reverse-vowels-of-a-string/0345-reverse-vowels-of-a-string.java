class Solution {
    public String reverseVowels(String s) {
        
        StringBuilder b = new StringBuilder(s);
        
        int start = 0;
        int end = s.length()-1;
        int n = s.length();
        
        
        while(start <= end){
            
            char ch1 = b.charAt(start);
            char ch2 = b.charAt(end);
            
    while(start < n && ch1 != 'a'&& ch1 !='e'&& ch1!='i'&&ch1!='o'&&ch1!='u'&&ch1!='A'&&ch1!='E'&&ch1!='I'&&ch1!='O'&&ch1!='U'){
        
        
        start++;
        if(start < n){
                 ch1 = b.charAt(start);
        }
   
        
        
    }        
    
     while(end >= 0 && ch2 != 'a'&& ch2!='e'&& ch2!='i'&&ch2!='o'&&ch2!='u'&&ch2!='A'&&ch2!='E'&&ch2!='I'&&ch2!='O'&&ch2!='U'){
        
        
       end--;
    
        if(end >= 0){
                 ch2 = b.charAt(end);
        }
   
        
        
        
    } 
    
            if(start<=end){
                
                char c = b.charAt(start);
                char d = b.charAt(end);
                
                b.setCharAt(start , d);
                b.setCharAt(end , c);
                start++;
                end--;
                
            }

           
            
            
            
        }
        
        return b.toString();
        
    }
}