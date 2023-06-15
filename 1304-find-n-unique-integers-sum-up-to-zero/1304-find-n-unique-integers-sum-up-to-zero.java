class Solution {
    public int[] sumZero(int n) {
        
        
        int arr[] = new int[n];
        
        if(n % 2 == 0){
            
            int k =1;
            for(int i = 0; i < n/2; i++){
                
                arr[i] = k;
              k =   k+1;
                
            }
          k=1;
            
            for(int i = n/2; i < n; i++){
                
                arr[i] = -k;
                k = k +1;
            }
            
            return arr;
        }
        
        int k = 0;
        
        for(int i = 0; i <= n/2; i++){
            
            arr[i] = k;
          k =   k+1;
            
            
        }
        k = k-1;
        
        for(int i = n/2 + 1; i < n; i++){
            
            arr[i] = -(k);
            k = k-1;
            
        }
        
        
        return arr;
        
    }
}