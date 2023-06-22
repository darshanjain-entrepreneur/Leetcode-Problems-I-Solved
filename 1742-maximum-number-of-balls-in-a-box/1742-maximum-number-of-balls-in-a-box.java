class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        
      TreeMap<Integer , Integer> map = new TreeMap<>();
        
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
          
            
            
            
            
            
            
        }
        
        int max = 0;
        
        for(int i : map.values()){

 max = Math.max(max , i);
}

   
        
    return max;
        
        
        
        
        
    }
}