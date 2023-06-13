class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int ans[] = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++){
            
            
            ans[i] = nums[i];
        }
        
        
        int arr[] = new int[101];
        
        
        Arrays.sort(ans);
        
        int k = 0;
        for(int i =0; i < nums.length; i++){
            
            if(i == 0){
                
               
             
            }else{
                
                if(ans[i] == ans[0]){
                    
                 
                }else{
                    
                  if(arr[ans[i]] == 0){
                     
                      arr[ans[i]] = k;
                  }
                
                    
                    
                }
                
                
            }
        k++;
     
        }
           
        for(int i = 0; i < nums.length; i++){
            
            
           int a = nums[i];
            nums[i] = arr[a];
            
            
        }
            return nums;
        
    }
}