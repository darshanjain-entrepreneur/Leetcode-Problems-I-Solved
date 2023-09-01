class Solution {
    
    
    public int find(int target , int heaters[]){
        
        int start = 0;
        int min = (int)(1e9);
        int end = heaters.length-1;
        
        while(start <= end){
            
            int mid = (end-start)/2 + start;
            
           if(heaters[mid] == target){
               return 0;
           }else{
               
               if(heaters[mid] > target){
                   
                   int b = Math.abs(heaters[mid] - target);
                   if(b < min){
                       min = b;
                       end = mid-1;
                       
                   }else{
                       
                       end = mid-1;
                       
                   }
                   
                   
               }else{
                   
                    int b = Math.abs(heaters[mid] - target); 
                   if(b < min){
                       min = b;
                       start = mid+1;
                   }else{
                       start = mid+1;
                       
                   }
                   
               }
               
               
               
           }
            
            
            
        }
        
        
        
        
        
        return min;
        
        
        
    }
    
    
    
    public int findRadius(int[] houses, int[] heaters) {
       
        Arrays.sort(houses);
        Arrays.sort(heaters);
        
        int max = -1;
  
        for(int i = 0; i < houses.length; i++){
            
            int a = houses[i];
            
            int dist = find(a , heaters);
            max = Math.max(dist , max);
            
            
            
            
            
            
            
        }
        
        
        
        
        return max;
        
    }
}