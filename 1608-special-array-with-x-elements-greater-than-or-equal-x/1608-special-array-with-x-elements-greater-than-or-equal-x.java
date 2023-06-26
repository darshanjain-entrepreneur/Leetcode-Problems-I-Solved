class Solution {
    public int specialArray(int[] nums) {
        
        Arrays.sort(nums);
        
        int max = nums[nums.length-1];
      
        
       for(int i = 1; i<= max;i++){
           
           int start = 0;
           int end = nums.length-1;
           while(start <= end){
               
               
               int mid = (end-start)/2 + start;
               
               if(nums[mid] < i){
                   start = mid+1;
               }else{
                   
                   int k = mid;
                   while(k >= 0 && nums[k] >= i ){
                       k--;
                   }
                   k = k+1;
                   if(end-k+1 == i){
                       
                       return i;
                   }else{
                       break;
                   }
                   
               }
               
               
           }
           
           
           
           
       }
        return -1;
        
    }
}