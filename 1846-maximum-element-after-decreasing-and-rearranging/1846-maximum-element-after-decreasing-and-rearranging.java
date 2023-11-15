class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        
        
        Arrays.sort(arr);
        
       int ans = 1;
        
        if(arr.length == 1){
            return ans;
            
        }
        
        arr[0] = 1;
        
        for(int i = 0; i < arr.length-1; i++){
            
            
            if(arr[i+1] - arr[i] <= 1){
                ans = arr[i+1];
            }else{
                
                
                
                arr[i+1] = 1+arr[i];
                ans = arr[i+1];
                
                
            }
            
            
            
            
            
            
        }
        
        
        return ans;
        
    }
}