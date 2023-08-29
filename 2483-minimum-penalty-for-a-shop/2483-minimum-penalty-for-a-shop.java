class Solution {
    public int bestClosingTime(String cust) {
        
        int n = cust.length();
        int no[] = new int[n+1];
        int yes[] = new int[n];
        int count = 0;
        
        
        for(int i = 0; i < cust.length(); i++ ){
            
            char c = cust.charAt(i);
            
            no[i] = count;
            if(c == 'N'){
                count++;
            }
            
            
            
            
        }
        
        no[n] = count;
        
        count = 0;
          
        for(int i = cust.length()-1; i>= 0; i-- ){
            
            char c = cust.charAt(i);
            
           if(c == 'Y'){
               count++;
           }
            
           yes[i] = count; 
            
            
        }
        
        
        int index = -1;
        int maxpen = (int)(1e9);
        
        for(int i = 0; i < n; i++){
            
            int total = no[i] + yes[i];
            
            if(total < maxpen){
                maxpen = total;
                index = i;
                
            }
            
        }
        
        
        if(no[n] < maxpen){
            index = n;
        }
        
        
        return index;
        
        
    }
}