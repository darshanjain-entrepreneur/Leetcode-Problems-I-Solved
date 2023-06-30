class Solution {
    public int getMaximumGenerated(int n) {
         int arr[] = new int[n+1];
        if(n == 0){
            
            return arr[0];
        }
        
    
        arr[0] = 0;
        arr[1] = 1;
        //even
        
   for(int i = 0; i <= n; i++){
       
       
       if(2*i <= n){
           arr[2*i] = arr[i];
           
       }
       if(2*i +1 <= n){
           arr[2*i + 1] = arr[i] + arr[i+1];
       }
       
       
   }
            
            
     Arrays.sort(arr);
        return arr[arr.length-1];
        
        
    }
}