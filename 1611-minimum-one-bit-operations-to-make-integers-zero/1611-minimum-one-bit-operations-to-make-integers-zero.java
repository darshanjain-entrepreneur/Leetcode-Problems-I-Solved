class Solution {
    public int minimumOneBitOperations(int n) {
        
        int arr[] = new int[31];
        
        
        arr[0] = 1;
        
        
        for(int i = 1; i <= 30; i++){
            
            arr[i] = 2*arr[i-1] + 1;
        }
        
        
        int ans = 0;
int count = 0;        
        for(int i = 30 ; i>= 0 ;i--){
            
            if(((1<<i)&n) != 0){
                
              count++;
                if(count%2 != 0){
                    ans+=arr[i];
                }else{
                    
                    ans = ans - arr[i];
                }
            }
            
            
            
        }
        
        return ans;
    }
}