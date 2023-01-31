class Solution {
    public int maxArea(int[] height) {
        
  int left = 0;
        int maxi = 0;
        int right = height.length - 1;
        while(left < right){
            
            if(height[left] <= height[right]){
                
               maxi = Math.max(height[left]*(right - left) , maxi);
                
                left++;
                
            }else{
                
                maxi = Math.max(height[right]*(right - left) , maxi);
                right--;
            }
            
            
            
            
        }
        
        return maxi;
    }
}