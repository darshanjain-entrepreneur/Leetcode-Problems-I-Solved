class Solution {
    public int trap(int[] height) {
        
        int n = height.length;
        
        if(n == 1 || n == 2){
            return 0;
        }
        
        
        
        int prefix[] = new int[n];
        int sufix[] = new int[n];
        int leftmaxi = height[0];
        int  rightmaxi = height[n-1];
        
      for(int i = 0;i < n; i++){
          
          leftmaxi = Math.max(leftmaxi , height[i]);
          prefix[i] = leftmaxi;
          rightmaxi = Math.max(rightmaxi , height[n - i - 1]);
          sufix[n - 1 - i] = rightmaxi; 
          
          
      }
        int sum = 0;
        
        for(int i = 0; i < n; i++ ){
            
            sum = sum + Math.min(prefix[i] , sufix[i]) - height[i];
            
            
        }
        return sum;
        
    }
}