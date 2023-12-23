class Solution {
    public int minimumNumbers(int num, int k) {
        
       
        
        if(num == 0){
            return 0;
        }
        
        
        int ans = -1;
        int sum = 0;
        for(int i = 0; i < 10; i++){
            
            
            sum += k;
            if(sum%10 == num%10){
                
                ans = i+1;
                break;
            }
            
        }
        
        if(ans == -1 || (ans*k > num)){
            return -1;
        }
        
        return ans;
    }
}