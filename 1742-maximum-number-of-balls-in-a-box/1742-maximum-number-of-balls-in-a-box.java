class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        
      TreeMap<Integer , Integer> map = new TreeMap<>();
        
        int max = 0;
        
        for(int i = lowLimit; i <= highLimit; i++){
            
            
            int k = i;
            int sum = 0;
            while(k != 0){
                
                sum = sum + k%10;
                k = k/10;
                
                
            }
            int g = 0;
            
            if(map.containsKey(sum)){
             g=   map.get(sum)+1;
                
                map.put(sum , g);
            }else{
                
                g=1;
                map.put(sum , 1);
            }
          
            
   max = Math.max(max , g);
            
            
            
            
        }
        

        
        return max;
        
        
        
    }
}