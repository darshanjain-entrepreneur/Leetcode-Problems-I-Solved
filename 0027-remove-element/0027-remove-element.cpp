class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
            int count =0;
     
        
        
        for(int i = 0; i < nums.size(); i++){
            
            if(nums[i] != val){
                
                count++;
            }
        }
        
        int k = 0;
      
        for(int i = 0; i < nums.size(); i++){
            
            if(nums[i] == val){
                
                
                
            }else{
                
              if(k == i){
                  k++;
                  
              }else{
                  nums[k] = nums[i];
                  nums[i] = val;
                  k++;
                  
              }
                
                
                
            }
            
            
            
            
            
            
        }
        
        return count;
    }
};