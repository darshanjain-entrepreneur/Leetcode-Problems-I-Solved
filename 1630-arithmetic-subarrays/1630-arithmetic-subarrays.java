class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        
        List<Boolean> ans = new ArrayList<>();
        
        
        for(int i = 0; i < l.length; i++){
            
            int start = l[i];
            int end = r[i];
            int count = 0;
            
            int arr[] = new int[end-start+1];
            int k = 0;
            for(int j = start ; j <= end; j++){
                

                arr[k] = nums[j];
                k++;
                
                
            }
            int d = 0;
            Arrays.sort(arr);
            for(int y = 0; y < arr.length-1; y++){
                
                if(y==0){
                    
                    d = arr[y+1] - arr[y];
                }else{
                    if(arr[y+1] - arr[y] != d){
                        count = 1;
                        break;
                    }
                    
                }
                
                
            }
            
            if(count == 1){
                ans.add(false);
            }else{
                ans.add(true);
            }
            
            
        }
        
        
        
        return ans;
        
        
    }
}