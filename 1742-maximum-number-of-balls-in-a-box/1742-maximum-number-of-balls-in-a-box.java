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
            
            if(map.containsKey(sum)){
                
                map.put(sum , map.get(sum)+1);
            }else{
                
                map.put(sum , 1);
            }
          
            
            max = Math.max(map.get(sum) , max);
            
            
            
            
        }
        

        
        return max;
        
        
        
    }
}