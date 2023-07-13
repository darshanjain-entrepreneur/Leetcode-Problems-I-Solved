class Solution {
    public int[] minOperations(String boxes) {
        
        int answer[] = new int[boxes.length()];
        
        for(int i = 0; i < boxes.length(); i++){
            
            int sum = 0;
            
            for(int j = 0; j < boxes.length(); j++){
                
                int a = (int)(boxes.charAt(j)- '0');
                if(a == 0){
                    
                    
                }else{
                    
                    sum = sum + Math.abs(i - j);
                    
                }
                
                
                
            }
            
            
            answer[i] = sum;
            
            
            
            
        }
        
        return answer; 
        
    }
}