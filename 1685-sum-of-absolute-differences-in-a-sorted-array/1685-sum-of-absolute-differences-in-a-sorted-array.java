class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        
        int n = nums.length;
        int prefix[] = new int[nums.length];
        
        
        for(int i = 0; i < nums.length; i++){
            
            if(i == 0){
                
                prefix[i] = nums[0];
            }else{
                
                prefix[i] = prefix[i-1] + nums[i];
            }
            
            
            
        }
        
        
        
        int arr[] = new int[nums.length];
        
        for(int i = 0; i < n; i++){
            
            if(i == 0){
                
                arr[i] = prefix[n-1] - prefix[i] - (n-1)*(nums[i]);
                
                
            }else{
                
                
             int a = prefix[n-1] - prefix[i] - (n-1-i)*(nums[i]);
             int b = i*nums[i] - (prefix[i-1]);   
                arr[i] = a+b;
            }
            
            
            
            
        }
        
        
        
       return  arr;
    }
}