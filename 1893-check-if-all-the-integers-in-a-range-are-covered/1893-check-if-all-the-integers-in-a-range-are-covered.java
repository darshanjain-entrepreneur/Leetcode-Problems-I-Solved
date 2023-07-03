class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        
      
        for(int i = left; i <= right; i++){
            
            int count = 0;
            
            for(int arr[] : ranges){
                
                if(i >= arr[0] && i <= arr[1]){
                    count = 1;
                }
                
                
            }
            
            
            if(count ==0){
                return false;
            }
            
            
            
        }
        
        
        return true;
        
    }
}