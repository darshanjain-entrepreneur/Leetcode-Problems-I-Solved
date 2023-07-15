class Solution {
    public String frequencySort(String s) {
        
      
        
       int mat[][] = new int[62][2];
        
        
        for(int i = 0; i < s.length(); i++){
            
            
            char ch = s.charAt(i);
            
            if(ch>= 'A' && ch <='Z'){
                
                int a = (int)(ch -'A');
                a = a+26;
                mat[a][0] = a;
                mat[a][1] = mat[a][1] + 1;
                
            }else if(ch >= 'a' && ch <= 'z'){
                
                 int a = (int)(ch -'a');
              
                mat[a][0] = a;
                mat[a][1] = mat[a][1] + 1;
                
                
            }else{
                  int a = (int)(ch -'0');
              a=a+52;
                mat[a][0] = a;
                mat[a][1] = mat[a][1] + 1;
                
                
                
            }
            
            
            
            
            
        }
        
        
        
        Arrays.sort(mat , Comparator.comparingInt(x -> x[1]));
        
        StringBuilder bt = new StringBuilder();
        
        
        for(int i=  0; i < mat.length; i++){
            
           int a = mat[i][0];
            int b = mat[i][1];
            
            if(b == 0){
                continue;
            }
            
            if(a >= 26 && a < 52){
                
           a = a-26;
                char ch = (char)(a + 'A');
                while(b > 0){
                    
                    bt.append(ch);
                    b--;
                    
                }
                
                
                
            }else if(a < 26){
                
               
                char ch = (char)(a + 'a');
                while(b > 0){
                    
                    bt.append(ch);
                    b--;
                
                
                }
                
            }else{
                a = a-52;
                char ch = (char)(a +'0');
                while(b > 0){
                     bt.append(ch);
                    b--;
                    
                }
                
                
            }
            
            
        }
        
        bt.reverse();
            
           
            
      return bt.toString();
        
        
        
        
    }
}