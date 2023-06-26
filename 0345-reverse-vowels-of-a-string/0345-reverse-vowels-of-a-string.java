class Solution {
    public String reverseVowels(String s) {
        
        StringBuilder b = new StringBuilder();
        
        
        for(int i = 0; i < s.length(); i++){
            
            char ch = s.charAt(i);
            
            if(ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'|| ch=='A'|| ch=='I'||ch=='E'||ch=='O'||ch=='U'){
                
                
                b.append(ch);
                
                
            }
            
            
            
        }
        
        
        if(b.length() == 0){
            return s;
        }
        b.reverse();
        System.out.print(b);
        
        StringBuilder c = new StringBuilder(s);
        int k = 0;
        
        for(int i = 0; i < s.length(); i++){
            
                char ch = s.charAt(i);
            if(ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'|| ch=='A'|| ch=='I'||ch=='E'||ch=='O'||ch=='U' ){
                
                
              c.setCharAt(i ,b.charAt(k) );
                System.out.println(k);
                k++;
                  
                  
              
                
                
            }
            
            
            
            
        }
        
        
        
        
        return c.toString();
        
        
    }
}