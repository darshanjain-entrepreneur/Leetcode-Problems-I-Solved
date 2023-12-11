class Solution {
    public int findSpecialInteger(int[] arr) {
        
        int count = 0;
        int n = arr.length;
  
        for(int i = 0; i < n; i++){
      
              if(i == 0){
                  count++;
              }else if(arr[i] == arr[i-1]){
                  count++;
              }else{
                  
                  count = 1;
              }
            if(count > arr.length/4){
                return arr[i];
            }
        
        }
        
        
        return 1;
        
    }
}